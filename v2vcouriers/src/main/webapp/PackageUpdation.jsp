<%@ include file="WEB-INF/AdminDesign.html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript" src="js/PackageUpdate.js"></script>
<title>Package Updation</title>
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
<h2>Package Updation Form </h2>
<form action="PackageUpdate" method="get">
<div class="form-group">
<label for="PackageIdtxt">Package Id</label>
<input type="text"  class="form-control" name="PackageIdtxt" id="PackageIdtxt" maxlength="8" >
</div>

<div class="form-group">
<label for="CurrentDatetxt">Current Date</label>
<input type="date"  class="form-control" name="CurrentDatetxt" id="CurrentDatetxt">
</div>

<div class="form-group">
<label for="CurrentLocationtxt">Current Location</label>
<input type="text"  class="form-control" name="CurrentLocationtxt" id="CurrentLocationtxt" >
</div>

<div class="form-group">
<label for="PackageStatustxt">Package Status</label>
     <select id="PackageStatustxt" class="form-control" name="PackageStatustxt">
     <option value="In_Transit">In Transit</option>
     <option value="Delivered">Delivered</option>
     
     </select>
</div>

<input  type="submit" value="Submit" onclick = "return SubmitValidation()">
<br><br>
<span id="SubmitError" style="color: red"></span>
<span style = "color:red"><%if(stat !=null)
			{ 
				out.print(stat);
			}
		%>
</span>
</form>
</div>

</body>
</html>