package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Vo.*;
import com.Bo.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserVo obj = new UserVo();
		obj.setUserId(request.getParameter("useridtxt"));
		obj.setPassword(request.getParameter("passwordtxt"));
		LoginBo loginBoObj = new LoginBo();
		UserVo u = loginBoObj.loginCheck(obj);
		if(u.getStatus() == 1)
		{
			HttpSession session = request.getSession();
			session.setAttribute("uname", u.getUserId());
			session.setAttribute("username", u.getFirstName());
			session.setAttribute("CustomerId", u.getCustomerId());
			request.getRequestDispatcher("UserHome.jsp").forward(request, response);
		}
		else
		{
			request.setAttribute("stat", "UserId or Password is incorrect...");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}

}
