<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to the Assessment Management System</title>
</head>

<body>

<div class="pull-right" style="padding-right:50px">
	<a href="?language=en">English</a>|
	<a href="?language=es">Spainsh</a>
</div>

<div class="pull-left" style="padding-right:50px">
	<a href="<spring:url value="/login"/>">Home</a>
</div>
	<H2>Welcome to the Assessment Management System</H2>
	
	<!-- Show assessments with result + assessments open -> show assess -->
	<a href="#">Student-Assessment</a>
	
	<a href="#">Professor-Create Assessment</a>
	<a href="#">Professor-Manage Existing Assessment(open/close/delete)</a>
	<a href="#">Professor-</a>
	
</body>
</html>