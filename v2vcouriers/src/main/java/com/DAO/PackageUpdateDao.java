package com.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Vo.PackageVo;
public class PackageUpdateDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/courier";
	static final String USER = "root";
	static final String PASS = "root";
	public PackageVo packageUpdate(PackageVo p)
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "update package set current_location=?,package_status=?,present_date=? where consignment_id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, p.getCurrentLocation());
			stmt.setString(2, p.getPackageStatus());
			stmt.setDate(3,p.getCurrentDate());
			stmt.setDouble(4, p.getConsignmentId());
			if(stmt.executeUpdate() > 0)
			{
				p.setStatus(1);
				}
			else
			{
				p.setStatus(0);
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
		return p;
	}
}
