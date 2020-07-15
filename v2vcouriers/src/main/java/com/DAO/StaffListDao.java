package com.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


import com.Vo.*;
public class StaffListDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/courier";
	static final String USER = "root";
	static final String PASS = "root";
public List<Courier> getStaff()
{
	Connection conn = null;
	PreparedStatement stmt = null;
	List<Courier> list = new ArrayList<Courier>();
	try
	{
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql = "select employee_id,first_name,last_name,email,contact_number,salary,designation,permanent_address,correspondance_address,login_type from staff";
		stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while(rs.next())
		{
			Courier obj = new Courier();
			obj.setFirstName(rs.getString("first_name"));
			obj.setLastName(rs.getString("last_name"));
			obj.setEmail(rs.getString("email"));
			obj.setContactNumber(rs.getLong("contact_number"));
			obj.setEmployeeId(rs.getLong("employee_id"));
			obj.setSalary(rs.getDouble("salary"));
			obj.setDesignation(rs.getString("designation"));
			obj.setPermanentAddress(rs.getString("permanent_address"));
			obj.setCorrespondanceAddress(rs.getString("correspondance_address"));
			obj.setLoginType(rs.getString("login_type"));
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
