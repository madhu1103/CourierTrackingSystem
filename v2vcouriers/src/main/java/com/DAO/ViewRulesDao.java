package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.Vo.RulesVo;;

public class ViewRulesDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/courier";
	static final String USER = "root";
	static final String PASS = "root";
public List<RulesVo> viewRules()
{
	Connection conn = null;
	PreparedStatement stmt = null;
	List<RulesVo> list = new ArrayList<RulesVo>();
	try
	{
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql = "select * from rules order by sno";
		stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next())
		{
			RulesVo obj = new RulesVo();
			obj.setNumber(rs.getInt(1));
			obj.setRule(rs.getString(2));
			list.add(obj);
		}
		rs.close();
		stmt.close();
		conn.close();
	}
	catch(SQLException se)
	{
		se.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			if(stmt != null)
				stmt.close();
		}
		catch(SQLException se2)
		{
			
		}
		try
		{
			if(conn != null)
			{
				conn.close();
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	return list;
}
}
