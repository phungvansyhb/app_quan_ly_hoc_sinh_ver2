package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.student;

public class findDao {
	public static ResultSet findStudent(Connection conn, String name ) throws SQLException {
		PreparedStatement pst = null;		
		String sql = " SELECT studentName,className,mathpoint,physicpoint,chempoint\n" +" FROM student\n" + " INNER JOIN class\n" + 
				" ON student.idClass = class.idClass  WHERE studentName Like '%"+name+"%'";
		pst = conn.prepareStatement(sql);
		
		ResultSet rs = pst.executeQuery();
		return rs;
	}
	
}
