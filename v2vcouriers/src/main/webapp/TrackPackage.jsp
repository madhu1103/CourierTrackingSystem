<%@ include file="WEB-INF/AdminDesign.html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript" src="js/TrackPackage.js"></script>
<title>Track Package</title>
<%
	String stat = null;
	if(request.getAttribute("stat")!=null)
	{
		stat = request.getAttribute("stat").toString();
	}
%>
</head>
<body>
<%if(session.getAttribute("uname")==null) 
{
	response.sendRedirect("StaffLogin.jsp");
}%>

<div class="container">
<h2>Package Tracking Form </h2>
<form action="PackageStatus" method="get">


<div class="form-group">
<label for="PackageIdtxt">Package Id</label>
<span id="PackageIdError" style="color:red"></span>
<input type="text"  class="form-control" name="PackageIdtxt" id="PackageIdtxt" maxlength="8">
</div>

<input  type="submit" value="Submit" onclick = "return SubmitValidation()">
<span id="SubmitError" style="color: red"></span>
<span style = "color:red"><%if(stat !=null)
			{ 
				out.print(stat);
			}
		%>
</span>
</body>
</html>