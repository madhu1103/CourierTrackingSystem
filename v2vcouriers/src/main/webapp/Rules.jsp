<%@ include file="WEB-INF/AdminDesign.html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.Vo.RulesVo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rules | Policies</title>
<script type="text/javascript" src="js/UpdateRule.js"></script>
<script type="text/javascript" src="js/AddRule.js"></script>
</head>
<%
	String status = null;
	if (request.getAttribute("status") != null) {
		status = request.getAttribute("status").toString();
	}

	List<RulesVo> list = new ArrayList<RulesVo>();
	String msg = null;
	if (request.getAttribute("RulesData") != null) {
		list = (List) request.getAttribute("RulesData");
		//msg=null;
	} else if (request.getAttribute("empty") != null) {
		msg = request.getAttribute("empty").toString();

	}
%>
<body>
	<br>
	<h1>Terms and Conditions of ABC Courier Services</h1>
	<br>
	<p>On this page, you will find a standard version of the ABC
		Courier Services Website Terms and Conditions.</p>
	<br>
	<p>
		<b>The Terms and Conditions of use of the Blue Dart Website are as
			follows:</b>
	</p>
	<br>
	<%
		if (msg != null) {
	%>
	<label>No record found...</label>
	<%
		} else {
			for (RulesVo r : list) {
	%>
	<%=r.getNumber()%>
	<label>.</label>
	<%=r.getRule()%>
	<br>
	<br>
	<%
		}
		}
	%>
	<br>
	<br>
	<br>
	<br>

	<div class="container" align="center">
		<h2>To Update Policies</h2>
		<br> <br>
		<form action="UpdateRule" method="get">
			<div class="form-group">
				<input type="text" class="form-control" name="RuleNumbertxt" placeholder="Enter the Serial Number to Update Particular Policy"
					id="RuleNumbertxt"> <br> 
					<input type="text" class="form-control" name="Ruletxt" placeholder="Enter the Updated Policy" id="Ruletxt">
					 <br>
				<button type="submit" class="btn btn-info btn-lg" value="Update" onclick="return UpdateValidation()">Update</button>
				<span id="UpdateError" style="color:red"></span>
		</form>
		<br> <br>
		<h2>To Add New Policy</h2>
		<br>
		<form action="AddRule" method="get">
			<input type="text" class="form-control" name="NewRuletxt" placeholder="Enter the New Policy" id="NewRuletxt">
				<span id="AddError" style="color:red"></span> <br>
			<button type="submit" class="btn btn-info btn-lg" value="Add" onclick="return AddValidation()">Add</button>
			<span id="addStatus" style="color:green">
				<%
					if (status != null) {
						out.print(status);
					}
				%>
			</span> 
	</div>
	</form>
	</div>
</body>
</html>