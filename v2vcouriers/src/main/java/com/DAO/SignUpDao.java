package com.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.CallableStatement;
import com.Vo.*;

public class SignUpDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/courier";
	static final String USER = "root";
	static final String PASS = "root";
	public Courier signUpCheck(Courier c)
	{
		Connection conn = null;
		//PreparedStatement stmt = null;
        CallableStatement stmt = null;
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			//String sql = "insert into user(First_Name,Last_Name,Gender,Email,Contact_Number,UserId,Password) values (?,?,?,?,?,?,?)";
			stmt = conn.prepareCall("{call NewUser(?,?,?,?,?,?,?,?,?,?,?,?)}");
			//stmt = conn.prepareStatement(sql);
			stmt.setString(1, c.getFirstName());
			stmt.setString(2, c.getLastName());
			stmt.setString(3, c.getGender());
			stmt.setString(4, c.getEmail());
			stmt.setDouble(5, c.getContactNumber());
			stmt.setString(6, c.getUserId());
			stmt.setString(7, c.getPassword());
			
			stmt.execute();
			c.setStatus(1);
			/*if(stmt.execute())
			{
				c.setStatus(1);
				}
			else
			{
				c.setStatus(0);
			}*/
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
