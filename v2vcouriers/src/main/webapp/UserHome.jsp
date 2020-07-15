<%@ include file="WEB-INF/UserDesign.html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
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
.alignright {
     float: right;
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
	response.sendRedirect("Login.jsp");
}%>
<%
     String UserName=null;
if(session.getAttribute("username")!=null){
     UserName = session.getAttribute("username").toString();
}
String CustomerId=null;
if(session.getAttribute("CustomerId")!=null){
     CustomerId = session.getAttribute("CustomerId").toString();
}

%>
<h1><% out.print("Welcome     "+UserName);%></h1>

<h3> <p class="alignright"><%out.print("Customer Id  : "+CustomerId); %> </p></h3>


  <br><br><br><br>

<form action="UserViewPackages.jsp">
 <button class="left">View My Packages</button>
  </form>
  <form action="UserTrackPackages.jsp">
   <button class="right">Track Package Details</button>
  </form>
<br><br><br><br>

</body>
</html>