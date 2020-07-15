package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Vo.*;
import com.Bo.SignUpBo;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Courier obj = new Courier();
		obj.setFirstName(request.getParameter("FirstNametxt"));
		obj.setLastName(request.getParameter("LastNametxt"));
		obj.setGender(request.getParameter("Gender"));
		obj.setEmail(request.getParameter("Emailtxt"));
		obj.setContactNumber(Long.parseLong(request.getParameter("ContactNumbertxt").toString()));
		obj.setUserId(request.getParameter("UserIdtxt"));
		obj.setPassword(request.getParameter("Passwordtxt"));
		SignUpBo signUpBoObj = new SignUpBo();
		Courier c = signUpBoObj.signUpCheck(obj);
		if (c.getStatus() == 1) {

			response.sendRedirect("Login.jsp");
		} else if (c.getStatus() == 0) {

			request.setAttribute("stat", "UserId already exists");
			request.getRequestDispatcher("SignUp.jsp").forward(request, response);
		}

	}
}
