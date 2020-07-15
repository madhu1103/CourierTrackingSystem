package com.Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Vo.*;
import com.Bo.PackageUpdateBo;
@WebServlet("/PackageUpdate")
public class PackageUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PackageVo obj = new PackageVo();
		obj.setConsignmentId(Long.parseLong(request.getParameter("PackageIdtxt").toString()));
		String date = request.getParameter("CurrentDatetxt");
		Date date1 = Date.valueOf(date);
		obj.setCurrentDate(date1);
		obj.setCurrentLocation(request.getParameter("CurrentLocationtxt"));
		obj.setPackageStatus(request.getParameter("PackageStatustxt"));
		PackageUpdateBo packageUpdateBoObj = new PackageUpdateBo();
		PackageVo p = packageUpdateBoObj.packageUpdate(obj);
		if(p.getStatus()==1)
		{
			response.sendRedirect("AdminHome.jsp");
		}
		else if(p.getStatus()==0)
		{
			request.setAttribute("stat", "Given details did not match, try again...");
			request.getRequestDispatcher("PackageUpdation.jsp").forward(request, response);
		}
	}

}
