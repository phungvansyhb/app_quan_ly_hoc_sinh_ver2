package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.student;

public class studentDao {
	public List<student> getliststudent (Connection conn) throws SQLException{
		List<student> list = new ArrayList<student>();
		PreparedStatement pst = null;
		String sql = "Select * From apptimhocsinh.class";
		pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			 student cl = new student();
			cl.setStudentId(rs.getInt("idStudent"));
			cl.setStudentName(rs.getString("studentName"));
			cl.setClassID(rs.getInt("idClass"));
			list.add(cl);
		}
		
		
		return list;
}
}
