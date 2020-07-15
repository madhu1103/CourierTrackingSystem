package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bo.PackageStatusBo;
import com.Vo.PackageVo;

/**
 * Servlet implementation class UserPackageStatus
 */
@WebServlet("/UserPackageStatus")
public class UserPackageStatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PackageVo obj = new PackageVo();
		obj.setConsignmentId(Long.parseLong(request.getParameter("PackageIdtxt").toString()));
		PackageStatusBo packageStatusBoObj = new PackageStatusBo();
		PackageVo p = packageStatusBoObj.trackPackage(obj);
		//String loc = p.getCurrentLocation();
		
		if(p.getStatus() == 1)
		{
			request.setAttribute("packageDetails",p);
			request.getRequestDispatcher("UserPackageLocation.jsp").forward(request, response);
		}
		else if(p.getStatus() == 0)
		{
			request.setAttribute("stat", "Given details did not match, try again...");
			request.getRequestDispatcher("UserTrackPackage.jsp").forward(request, response);
		}
	}

}
