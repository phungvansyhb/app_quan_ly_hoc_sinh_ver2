package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.classDao;
import Dao.findDao;
import Db.Dbconnect;
import bean.classroom;
import bean.student;
/**
 * Servlet implementation class FindStudentController
 */
@WebServlet("/FindStudentController")
public class FindStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public FindStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int idclass = Integer.parseInt(request.getParameter("dropdown_class"));
		
		ArrayList<student>list = new ArrayList<student>();
		ResultSet rs = null;
		try {
			rs = findDao.findStudent(Dbconnect.conn(),name,idclass);
			while(rs.next()) {
				student st = new student();
				st.setStudentId(rs.getInt("idStudent"));
				st.setStudentName(rs.getString("studentName"));
				st.setMathPoint(rs.getDouble("mathpoint"));
				st.setPhysicPoint(rs.getDouble("physicpoint"));
				st.setChemPoint(rs.getDouble("chempoint"));
				list.add(st);
			}
			request.setAttribute("listResult", list);	
			List<classroom> listclass = classDao.getlistclass(Dbconnect.conn());	
			request.setAttribute("listclass", listclass);
			RequestDispatcher rdp = request.getRequestDispatcher("/WEB-INF/view/home.jsp");
			rdp.forward(request, response);	
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
