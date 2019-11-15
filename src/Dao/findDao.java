package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.student;

public class findDao {
	public static ResultSet findStudent(Connection conn, String name , int idclass) throws SQLException {
		PreparedStatement pst = null;
		String sql = "SELECT * FROM apptimhocsinh.student WHERE studentName =(?) AND idClass=(?)";
		pst = conn.prepareStatement(sql);
		pst.setString(1, name);
		pst.setInt(2, idclass);
		ResultSet rs = pst.executeQuery();
		return rs;
	}
	public static void show (student st) {
		
		
		
	}
}
