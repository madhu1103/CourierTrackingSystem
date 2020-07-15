package com.Controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bo.PackageRegistrationBo;
import com.Vo.*;

@WebServlet("/PackageRegistration")
public class PackageRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Courier obj = new Courier();

		obj.setConsignmentId(Double.parseDouble(request.getParameter("ConsignmentIdtxt").toString()));
		String date = request.getParameter("AcceptDatetxt");
		// Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		Date date1 = Date.valueOf(date);
		obj.setAcceptDate(date1);
		obj.setPackageWeight(Double.parseDouble(request.getParameter("PackageWeighttxt").toString()));
		obj.setConsignmentId(Double.parseDouble(request.getParameter("Costtxt").toString()));
		obj.setSenderAddress(request.getParameter("SenderAddresstxt"));
		obj.setReceiverAddress(request.getParameter("ReceiverAddresstxt"));
		obj.setEmployeeId(Long.parseLong(request.getParameter("EmployeeIdtxt").toString()));
		obj.setCustomerId(Long.parseLong(request.getParameter("CustomerIdtxt").toString()));
		obj.setCurrentLocation(request.getParameter("CurrentLocationtxt"));
		obj.setPackageStatus(request.getParameter("PackageStatustxt"));
		PackageRegistrationBo packageRegistrationBoObj = new PackageRegistrationBo();
		Courier c = packageRegistrationBoObj.registerPackage(obj);
		if(c.getStatus()==1)
		{
			response.sendRedirect("AdminHome.jsp");
		}
		else if (c.getStatus() == 0) {

			request.setAttribute("stat", "Please verify your details");
			request.getRequestDispatcher("PackageRegistration.jsp").forward(request, response);
		}
	}

}
