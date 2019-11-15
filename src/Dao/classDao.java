package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.classroom;

public class classDao {
	public static List<classroom> getlistclass (Connection conn) throws SQLException{
		List<classroom> list = new ArrayList<classroom>();
		PreparedStatement pst = null;
		String sql = "Select * From apptimhocsinh.class";
		pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			 classroom cl = new classroom();
			cl.setClassId(rs.getInt("idClass"));
			cl.setClassName(rs.getString("className"));
			list.add(cl);
		}
		
		
		return list;
}}
