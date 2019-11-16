package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.student;

public class insertDao {
	public static boolean insertstudent (Connection conn , student st) throws SQLException {
		PreparedStatement pst = null;
		String sql = "INSERT INTO apptimhocsinh.student(studentName,idClass,mathpoint,physicpoint,chempoint) VALUES(?,?,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1,st.getStudentName());
			pst.setInt(2, st.getClassID());
			pst.setDouble(3, st.getMathPoint());
			pst.setDouble(4, st.getPhysicPoint());
			pst.setDouble(5, st.getChemPoint());
		if(pst.executeUpdate()!=0) return true;
		else		
		return false;
		
	}
}
