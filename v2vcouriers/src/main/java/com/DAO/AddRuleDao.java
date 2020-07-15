package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Vo.RulesVo;

public class AddRuleDao {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/courier";
	static final String USER = "root";
	static final String PASS = "root";

	public RulesVo addRule(RulesVo r) {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println(r.getRule());
			String sql = "insert into rules(rule) value(?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, r.getRule());
			if (stmt.executeUpdate()>0) {
				r.setStatus(1);
			} else {
				r.setStatus(0);
			}

			
			stmt.close();
			conn.close();
		} catch (SQLException se) {

			se.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();

			} catch (SQLException se2) {

			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return r;
	}
}
