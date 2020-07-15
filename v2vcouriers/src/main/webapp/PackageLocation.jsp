<%@ include file="WEB-INF/AdminDesign.html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Vo.PackageVo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Package Location</title>
<%
	PackageVo obj = new PackageVo();
if(request.getAttribute("packageDetails")!=null)
{
	obj = (PackageVo)request.getAttribute("packageDetails");
}
	
%>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
}
th,td {
  text-align: center;
}
table {
  border-spacing: 5px;
}
</style>
</head>
<body>
<table style="width:100%">
  <tr>
    <th>Package ID</th>
    <th>Accept Date</th>
    <th>Current Location</th>
    <th>Present Date</th>
    <th>Package Status</th>
  </tr>
  <tr>
    <td><%= obj.getConsignmentId() %></td>
    <td><%= obj.getAcceptDate() %></td>
    <td><%= obj.getCurrentLocation() %></td>
    <td><%= obj.getCurrentDate() %></td>
    <td><%= obj.getPackageStatus() %></td>
  </tr>
</table>
</body>
</html>