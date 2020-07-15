<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<title>Courier Services | Home</title>
<script type="text/javascript" src="js/StaffLogin.js"></script>
<style>
body {
  font-family: Arial;
  padding: 20px;
  background: #f1f1f1;
}

.leftcolumn {   
  float: left;
  width: 75%;
}
/* Right column */
.rightcolumn {
  float: left;
  width: 25%;
  padding-left: 20px;
}
/* Add a card effect for articles */
.card {
   background-color: white;
   padding: 20px;
   margin-top: 20px;
}

</style>
</head>
<%
	String stat = null;
	if(request.getAttribute("stat")!=null)
	{
		stat = request.getAttribute("stat").toString();
	}
%>
<body>
<center><h1>ABC Courier Services</h1></center>
  <div class="row">
  <div class="leftcolumn">
  	<img src="img/img.jpg" alt="ABC couriers" width="1910" height="860">
  </div>
  <div class="rightcolumn">
    <div class="card">
<h2>Login </h2>
<form action="Login" method="post">
<div class="form-group">
<label for="UserIdtxt">UserId</label>
<span id="idError" style="color:red"></span>
<input type="text" class="form-control" name="useridtxt" id="useridtxt" maxlength="15" onblur="idValidation()">
</div>

<div class="form-group">
<label for="Passwordtxt" >Password</label>
<span id="PasswordError" style="color:red"></span>
<input type="password" class="form-control" name="passwordtxt" id="passwordtxt" maxlength="15" onblur="passValidation()">
</div>


<input type="submit" value="Login" onclick="return validate()">
<br><br>
<span id="validationError" style="color: red"></span>
<span style = "color:red"><%if(stat !=null)
			{ 
				out.print(stat);
			}
		%>
		</span>
<br>
<label>New User?</label>
<a href = "SignUp.jsp">SignUp Here...</a>
<br>
<a href = "StaffLogin.jsp">Staff Login Here...</a>
</form>
</body>
</html>