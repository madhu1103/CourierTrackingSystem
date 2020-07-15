<%@ include file="WEB-INF/UserDesign.html"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.Vo.RulesVo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Rules</title>
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
</body>
</html>