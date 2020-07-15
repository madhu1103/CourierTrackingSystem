package com.DAO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.Vo.*;
public class StaffSignUpDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/courier";
	static final String USER = "root";
	static final String PASS = "root";
	public Courier staffSignUpCheck(Courier c)
	{
		Connection conn = null;
		CallableStatement stmt = null;
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.prepareCall("{call NewStaff(?,?,?,?,?,?,?,?,?,?,?,?)}");
			stmt.setString(1, c.getFirstName());
			stmt.setString(2, c.getLastName());
			stmt.setString(3, c.getGender());
			stmt.setString(4, c.getEmail());
			stmt.setDouble(5, c.getContactNumber());
			stmt.setString(6, c.getUserId());
			stmt.setString(7, c.getPassword());
			stmt.setDouble(8, c.getSalary());
			stmt.setString(9, c.getDesignation());
			stmt.setString(10, c.getPermanentAddress());
			stmt.setString(11, c.getCorrespondanceAddress());
			stmt.setString(12, c.getLoginType());
			stmt.execute();
			c.setStatus(1);
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
