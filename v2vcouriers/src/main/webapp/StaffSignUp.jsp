<%@ include file="WEB-INF/AdminDesign.html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User SignUp Page</title>
<script type="text/javascript" src="js/StaffSignUp.js"></script>
<meta charset="utf-8">
  
</head>
<%
	String stat = null;
	if(request.getAttribute("stat")!=null)
	{
		stat = request.getAttribute("stat").toString();
	}
%>
<body>
<%if(session.getAttribute("uname")==null) 
{
	response.sendRedirect("StaffLogin.jsp");
}%>

<div class="container">
<h2>Staff Registration Form </h2>
<form action="StaffSignUp" method="get">
<div class="form-group">
<label for="FirstNametxt">First Name</label>
<span id="FirstNameError" style="color:red"></span>
<input type="text"  class="form-control" name="FirstNametxt" id="FirstNametxt" maxlength="50" onblur="FirstNameValidation()">
</br>
</div>

<div class="form-group">
<label for="LastNametxt">Last Name</label>
<span id="LastNameError" style="color:red"></span>
<input type="text" class="form-control" name="LastNametxt" id="LastNametxt" maxlength="50" onblur="LastNameValidation()">
</br>
</div>

<div class="form-group">
<lable for="Gender"><b>Gender</b></lable>
<span id="GenderError" style="color:red"></span>
<select id="Gender" class="form-control" name="Gender" onblur="GenderValidation()">
<option value="select">--select--</option>
<option value="Male">Male</option>
<option value="Female">Female</option>
</select></br>
</div>

<div class="form-group">
<label for="Emailtxt">Email</label>
<span id="EmailError" style="color:red"></span>
<input type="email" class="form-control" name="Emailtxt" id="Emailtxt" maxlength="50" onblur="EmailValidation()">
</br>
</div>

<div class="form-group">
<label for="ContactNumbertxt">Contact Number</label>
<span id="ContactNumberError" style="color:red"></span>
<input type="text"  class="form-control" name="ContactNumbertxt" id="ContactNumbertxt" maxlength="10" onblur="ContactNumberValidation()">
</br>
</div>

<div class="form-group">
<label for="UserIdtxt">UserId</label>
<span id="UserIdError" style="color:red"></span>
<input type="text" class="form-control" name="UserIdtxt" id="UserIdtxt" maxlength="15" onblur="UserIdValidation()">
</br>
</div>


<div class="form-group">
<label for="Passwordtxt" >Password</label>
<span id="PasswordError" style="color:red"></span>
<input type="password" class="form-control" name="Passwordtxt" id="Passwordtxt" maxlength="15" onblur="PasswordValidation()">
</br>
</div>

<div class="form-group">
<label>Confirm Password</label>
<span id="ConfirmPasswordError" style="color : red"></span>
<input type="password"  class="form-control" name="Confirmpasswordtxt" id="Confirmpasswordtxt" maxlength="15"   onblur="ConfirmPasswordValidation()">
</br>
</div>

<div class="form-group">
<label for="Salarytxt">Salary</label>
<span id="SalaryError" style="color:red"></span>
<input type="text"  class="form-control" name="Salarytxt" id="Salarytxt"  onblur="SalaryValidation()">
</br>
</div>

<div class="form-group">
<label for="Designationtxt">Designation</label>
<span id="DesignationError" style="color:red"></span>
<input type="text"  class="form-control" name="Designationtxt" id="Designationtxt"  maxlength="15" onblur="DesignationValidation()">
</br>
</div>

<div class="form-group">
<label for="PermanentAddresstxt">Permanent Address</label>
<span id="PermanentAddressError" style="color:red"></span>
<input type="text"  class="form-control" name="PermanentAddresstxt" id="PermanentAddresstxt"  maxlength="100" onblur="PermanentAddressValidation()">
</br>
</div>

<div class="form-group">
<label for="CorrespondanceAddresstxt">Correspondance Address</label>
<span id="CorrespondanceAddressError" style="color:red"></span>
<input type="text"  class="form-control" name="CorrespondanceAddresstxt" id="CorrespondanceAddresstxt"  maxlength="100" onblur="CorrespondanceAddressValidation()">
</br>
</div>

<div class="form-group">
<label for="LoginTypetxt">Login Type</label>
<span id="LoginTypeError" style="color:red"></span>
<!-- <input type="text"  placeholder="A-Admin/S-Staff" class="form-control" name="LoginTypetxt" id="LoginTypetxt"  maxlength="1"onblur="LoginTypeValidation()"> -->
<select id="LoginTypetxt" class="form-control" name="LoginTypetxt" onblur="GenderValidation()">
<option value="select">--select--</option>
<option value="A">Admin</option>
<option value="S">Staff</option>
</select>
</br>
</div>

<input type="submit" class="btn btn-default" value="Submit" name="Submit" onclick="return SubmitValidation()">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" class="btn btn-default" value="Reset">
<span id="SubmitError" style="color:red"></span>
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
