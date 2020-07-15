<%@ include file="WEB-INF/AdminDesign.html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
<style>
.left {
  display: block;
  width: 10%;
  
  border: none;
  background-color: #172081;
  color: white;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
  text-align: center;
}
.right {
  display: block;
  width: 10%;
  
  border: none;
  background-color: #172081;
   position: absolute;
   right: 0;
  color: white;
  padding: 14px 28px;
  font-size: 16px;
  cursor: pointer;
  text-align: center;
}

.block:hover {
  background-color: #ddd;
  color: black;
}
</style>

</head>
<%
	String name = null;
	if(request.getAttribute("username")!=null)
	{
		name = request.getAttribute("username").toString();
	}
%>
<body>

<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
//response.setHeader("Pragma","no-cache");
//response.setHeader("Expires","0");
if(session.getAttribute("uname")==null) 
{
	response.sendRedirect("StaffLogin.jsp");
}%>
<center><p><h3>The beginning : 1986 - A year of glory for the Directors of this company because it was the year in which they were united and ventured in to Courier Business.
</h3></p></center>
   <h2>Welcome <%if(name!=null) {out.print(name); } %></h2>
<br><br><br><br>
  <form action="StaffSignUp.jsp">
	<button class="left">Staff Registration</button>
  </form>
  <form action="">
  <button class="right">View/Update Staff Details</button>
  </form>
  <br><br><br><br>
  <form action="PackageRegistration.jsp">
    <button class="left">Register Package</button>
  </form>
  <form action="">
     <button class="right">View/Update Package Details</button>
  </form></br></br></br></br>
  <form action="">
     <button class="left">Rules/Policies</button>
  </form>
</body>
</html>