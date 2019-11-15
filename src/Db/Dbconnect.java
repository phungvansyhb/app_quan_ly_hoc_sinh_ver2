package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnect {
	public static Connection conn() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(Dbconfig.getUrl(),Dbconfig.getUsername(),Dbconfig.getPass());	
		return conn;		
	}
}
