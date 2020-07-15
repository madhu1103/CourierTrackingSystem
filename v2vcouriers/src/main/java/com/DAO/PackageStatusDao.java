package com.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Vo.PackageVo;
public class PackageStatusDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/courier";
	static final String USER = "root";
	static final String PASS = "root";
	public PackageVo trackPackage(PackageVo p)
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "select consignment_id,accept_date,current_location,present_date,package_status from package where consignment_id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setDouble(1, p.getConsignmentId());
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
			{
				p.setCurrentLocation(rs.getString("current_location"));
				p.setConsignmentId(rs.getLong("consignment_id"));
				p.setAcceptDate(rs.getDate("accept_date"));
				p.setCurrentDate(rs.getDate("present_date"));
				p.setPackageStatus(rs.getString("package_status"));
				p.setStatus(1);
			}
			else
			{
				p.setStatus(0);
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
		return p;
	}
}
