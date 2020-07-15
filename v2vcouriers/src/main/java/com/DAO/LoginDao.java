package com.DAO;
import java.sql.*;

import com.Vo.*;
public class LoginDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/courier";
	static final String USER = "root";
	static final String PASS = "root";
	public UserVo loginCheck(UserVo u)
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		//CallableStatement stmt = null;
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "select First_Name,Customer_Id from User where UserId=? and Password=?";
			//stmt = conn.prepareCall("{call Login(?,?,?)}");
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, u.getUserId());
			stmt.setString(2, u.getPassword());
            ResultSet rs = stmt.executeQuery();
            
			//stmt.registerOutParameter(3, java.sql.Types.VARCHAR);
			//stmt.execute();
			//String a = stmt.getString(3);
			
			if(rs.next())
			{
				u.setStatus(1);
				u.setFirstName(rs.getString("First_Name"));
                u.setCustomerId(rs.getLong("Customer_Id"));

                

			}
			else
			{
				u.setStatus(0);
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
		return u;
	}
}
