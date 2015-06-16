<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Assessment</title>
</head>
<body>
	<p align="right">
		<button type=button onclick=window.location.href="<spring:url value="/createAssessment/addAssessmentForm/" />">
			Add Assessment</button>
	</p>
	<h3>List of Assessments</h3>
	
	<div class="form-group">
					<div class="col-lg-10">
<%-- 						${assessment.nameAssessment} --%>
					
					</div>
				</div>
	
	
	
</body>
</html>