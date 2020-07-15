package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bo.StaffLoginBo;
import com.Vo.*;

@WebServlet("/StaffLogin")
public class StaffLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Courier obj = new Courier();
		obj.setUserId(request.getParameter("useridtxt"));
		obj.setPassword(request.getParameter("passwordtxt"));
		StaffLoginBo staffLoginBoObj = new StaffLoginBo();
		Courier c = staffLoginBoObj.loginCheck(obj);
		
		if(c.getStatus() == 1)
		{
			HttpSession session = request.getSession();
			session.setAttribute("uname", obj.getUserId());
			request.setAttribute("username", c.getFirstName());
			request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
			//response.sendRedirect("AdminHome.jsp");
		}
		else if(c.getStatus() == 2)
		{
			response.sendRedirect("StaffHome.jsp");
		}
		else 
		{
			request.setAttribute("stat", "UserId or Password is incorrect...");
			request.getRequestDispatcher("StaffLogin.jsp").forward(request, response);
		}
	}

}
