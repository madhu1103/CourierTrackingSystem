package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Vo.*;
import com.Bo.*;
import java.util.*;
@WebServlet("/StaffList")
public class StaffList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StaffListBo staffListBoObj = new StaffListBo();
		List<Courier> list=staffListBoObj.getStaff();
		if(list.isEmpty())
		{
			request.setAttribute("empty", "No Record Found");
			request.getRequestDispatcher("StaffList.jsp").forward(request,response);
		}
		else
		{
		request.setAttribute("StaffData", list);
		request.getRequestDispatcher("StaffList.jsp").forward(request,response);
		}
	}

}
