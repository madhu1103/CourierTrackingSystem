package com.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.Vo.*;

public class StaffLoginDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/courier";
	static final String USER = "root";
	static final String PASS = "root";
	public Courier loginCheck(Courier c)
	{
		Connection conn = null;
		CallableStatement stmt = null;
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			//String sql = "select first_name from user where userid = ? and password = ?";
			stmt = conn.prepareCall("{call StaffLogin(?,?,?,?)}");
			//stmt = conn.prepareStatement(sql);
			stmt.setString(1, c.getUserId());
			stmt.setString(2, c.getPassword());
			stmt.registerOutParameter(3, java.sql.Types.VARCHAR);
			stmt.registerOutParameter(4, java.sql.Types.VARCHAR);
			stmt.execute();
			String a = stmt.getString(3);
			c.setFirstName(stmt.getString(4));
			if(a!=null && a.equals("A"))
			{
				c.setStatus(1);
			}
			else if(a!=null && a.equals("S"))
			{
				c.setStatus(2);
			}
			else
			{
				c.setStatus(0);
			}
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
		return c;
	}
}
