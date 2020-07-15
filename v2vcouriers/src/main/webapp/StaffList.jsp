<%@ include file="WEB-INF/AdminDesign.html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.Vo.Courier"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Staff Details</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
}
th {
  text-align: center;
}
table {
  border-spacing: 5px;
}
</style>
</head>
<%
	List<Courier> list = new ArrayList<Courier>();
	String msg=null;
	if (request.getAttribute("StaffData") != null) {
		list = (List) request.getAttribute("StaffData");
		//msg=null;
	} else if (request.getAttribute("empty") != null) {
		msg = request.getAttribute("empty").toString();

	}
%>
<body>
<div style = "text-align:center">
<h3>Available Staff Details</h3>
<br><br><br><br><br>
<table style="width:100%">
<tr>
<th>Employee Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Contact Number</th>
<th>Salary</th>
<th>Designation</th>
<th>Permanent Address</th>
<th>Correspondance Address</th>
<th>Login Type</th>
<th>Update</th>
</tr>
<%
	if (msg!=null) {
%>
	<tr>
			<td colspan="8">No Record Found...</td>
		</tr>	
		<%
			} else {
				for (Courier c : list) {
		%>
		<tr>
			<td><%=c.getEmployeeId()%></td>
			<td><%=c.getFirstName()%></td>
			<td><%=c.getLastName()%></td>
			<td><%=c.getEmail()%></td>
			<td><%=c.getContactNumber()%></td>
			<td><%=c.getSalary()%></td>
			<td><%=c.getDesignation()%></td>
			<td><%=c.getPermanentAddress()%></td>
			<td><%=c.getCorrespondanceAddress()%></td>
			<td><%=c.getLoginType() %></td>
			<!--  <td><input type="submit" value="Click to Update"></td> -->
		</tr>
		<%
			}
			}
		%>
</table>
</div>
</body>
</html>