<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<%@ page pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to the Assessment Management System</title>
</head>

<body>
<a href="?language=en">English</a>| <a href="?language=es">Spanish</a>
<spring:message code="home.hello.lable" /> 
	<div class="pull-right" style="padding-right: 50px">
		
		<security:authorize access="isAuthenticated()">
  			Welcome <security:authentication property="principal.username" />
  			<a href="<spring:url value='/logout' />"> Logout</a>
		</security:authorize>
	</div>

	
	<H2>Welcome to the Assessment Management System</H2>
	
	
	<!-- Show assessments with result + assessments open -> show assess -->
	<table>
	<tr><td>
	<div class="pull-left" style="padding-right: 50px">
		<a href="<spring:url value="/login"/>">Home</a>
		
	</div>
	</td></tr>
	<tr><td>
	<div class="pull-right" style="padding-right: 50px">
		
		<security:authorize access="isAuthenticated()">
  			Welcome <security:authentication property="principal.username" />
  			<a href="<spring:url value='/logout' />"> Logout</a>
		</security:authorize>
		
		<security:authorize access="isAnonymous()">
			<a href="<spring:url value='/login' />"> Login</a><br/>
			<a href="<spring:url value='/register' />">Register</a>
		</security:authorize>
	</div>
	</td></tr>
	<tr><td><a href="#">Student-Assessment</a></td></tr>
	<tr><td><a href="/AssessmentSystem/showAssessments">Student show Assessments</a></td></tr>
	<tr><td><a href="/AssessmentSystem/register">Register New User</a></td></tr>
	<tr><td><a href="#">Professor-Manage Existing Assessment(open/close/delete)</a></td></tr>
	<tr><td><a href="createAssessment/">Create Assessment</a></td></tr>
	<tr><td><a href="QuestionAnswer/createQuestion/1">Create Question</a></td></tr>
	<tr><td><a href="#">Professor-</a></td></tr>
	</table>
	
	<!--Edited by @Bharat Thapa-->
	  <%-- <div>
		 <ul>	
		 	<li>
				<tiles:insertAttribute name="navigation" />
			</li>
		 </ul>
	</div>  --%>

</body>
</html>