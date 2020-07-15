<%@ include file="WEB-INF/AdminDesign.html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Package Registration</title>
<script type="text/javascript" src="js/PackageForm.js"></script>
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
<h2>Package Registration Form </h2>
<form action="PackageRegistration" method="get">

<div class="form-group">
<label for="ConsignmentIdtxt">Consignment Id</label>
<span id="ConsignmentIdError" style="color:red"></span>
<input type="text"  class="form-control" name="ConsignmentIdtxt" id="ConsignmentIdtxt" maxlength="8" onblur="ConsignmentIdValidation()">
</div>

<div class="form-group">
<label for="AcceptDatetxt">Accept Date</label>
<span id="AcceptDateError" style="color:red"></span>
<input type="date"  class="form-control" name="AcceptDatetxt" id="AcceptDatetxt"  value=current-date() onblur="AcceptDateValidation()">
</div>

<div class="form-group">
<label for="PackageWeighttxt">Package Weight</label>
<span id="PackageWeightError" style="color:red"></span>
<input type="text"  class="form-control" name="PackageWeighttxt" id="PackageWeighttxt" maxlength="8" onblur="PackageWeightValidation()">
</div>

<div class="form-group">
<label for="Costtxt">Cost</label>
<span id="CostError" style="color:red"></span>
<input type="text"  class="form-control" name="Costtxt" id="Costtxt" onblur="CostValidation()" >
</div>

<div class="form-group">
<label for="SenderAddresstxt">Sender Address</label>
<span id="SenderAddressError" style="color:red"></span>
<input type="text"  class="form-control" name="SenderAddresstxt" id="SenderAddresstxt"  maxlength="100" >
</div>

<div class="form-group">
<label for="ReceiverAddresstxt">Receiver Address</label>
<span id="ReceiverAddressError" style="color:red"></span>
<input type="text"  class="form-control" name="ReceiverAddresstxt" id="ReceiverAddresstxt"  maxlength="100" onblur="ReceiverAddressValidation()">
</div>

<div class="form-group">
<label for="EmployeeIdtxt">Employee Id</label>
<span id="EmployeeIdError" style="color:red"></span>
<input type="text"  class="form-control" name="EmployeeIdtxt" id="EmployeeIdtxt" maxlength="8" onblur="EmployeeIdValidation()">
</div>

<div class="form-group">
<label for="CustomerIdtxt">Customer Id</label>
<span id="CustomerIdError" style="color:red"></span>
<input type="text"  class="form-control" name="CustomerIdtxt" id="CustomerIdtxt" maxlength="8" onblur="CustomerIdValidation()">
</div>

<div class="form-group">
<label for="CurrentLocationtxt">Current Location</label>
<span id="CurrentLocationError" style="color:red"></span>
<input type="text"  class="form-control" name="CurrentLocationtxt" id="CurrentLocationtxt"  maxlength="100" onblur="CurrentLocationValidation()">
</div>

<div class="form-group">
<label for="PackageStatustxt">Package Status</label>
<span id="PackageStatusError" style="color:red"></span>
     <select id="PackageStatustxt" class="form-control" name="PackageStatustxt" onblur="PackageStatusValidation()">
     <option value="select">--select--</option>
     <option value="Booking">Booking</option>
     <option value="In_Transit">In Transit</option>
     <option value="Delivered">Delivered</option>
     
     </select>

</div>
<input  type="submit" value="Submit" onclick="return SubmitValidation()">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input  type="reset" value="Reset">
<span id="SubmitError" style="color:red"></span><br>
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