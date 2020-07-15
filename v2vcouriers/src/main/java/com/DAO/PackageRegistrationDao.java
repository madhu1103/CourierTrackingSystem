package com.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.Vo.*;

public class PackageRegistrationDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/courier";
	static final String USER = "root";
	static final String PASS = "root";
	public Courier registerPackage(Courier c)
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "insert into package(Consignment_Id,Accept_Date,Package_Weight,Cost,Sender_Address,Receiver_Address,Employee_id,Customer_id,Current_Location,Package_Status) values (?,?,?,?,?,?,?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setDouble(1, c.getConsignmentId());
			stmt.setDate(2, c.getAcceptDate());
			stmt.setDouble(3,c.getPackageWeight());
			stmt.setDouble(4, c.getCost());
			stmt.setString(5,c.getSenderAddress());
			stmt.setString(6, c.getReceiverAddress());
			stmt.setDouble(7, c.getEmployeeId());
			stmt.setDouble(8, c.getCustomerId());
			stmt.setString(9, c.getCurrentLocation());
			stmt.setString(10, c.getPackageStatus());
			if(stmt.executeUpdate() > 0)
			{
				c.setStatus(1);
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
