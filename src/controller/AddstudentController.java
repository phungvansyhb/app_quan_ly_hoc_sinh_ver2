package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.classDao;
import Dao.insertDao;
import Db.Dbconnect;
import bean.classroom;
import bean.student;
@WebServlet("/AddstudentController")
public class AddstudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddstudentController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int classid = Integer.parseInt(request.getParameter("dropdown_class"));	
		String mathpoint = request.getParameter("Point1");
		String physicpoint = request.getParameter("Point2");
		String chempoint = request.getParameter("Point3");
		
		student st = new student();
		st.setStudentName(name);
		st.setClassID(classid);
		st.setMathPoint(Double.parseDouble(mathpoint));
		st.setPhysicPoint(Double.parseDouble(physicpoint));
		st.setChemPoint(Double.parseDouble(chempoint));
		
		try {
			boolean kt = insertDao.insertstudent(Dbconnect.conn(), st);
			if(kt) {			
				request.setAttribute("masseger", "thêm dữ liệu thành công");
				List<classroom> listclass = classDao.getlistclass(Dbconnect.conn());	
				request.setAttribute("listclass", listclass);
				RequestDispatcher rdp = request.getRequestDispatcher("/WEB-INF/view/home.jsp");
				rdp.forward(request, response);
			}
			else {
				request.setAttribute("masseger", "thêm dữ liệu thất bại");
				List<classroom> listclass = classDao.getlistclass(Dbconnect.conn());	
				request.setAttribute("listclass", listclass);
				RequestDispatcher rdp = request.getRequestDispatcher("/WEB-INF/view/home.jsp");
				rdp.include(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("loi o DB");
		}
	}

}
