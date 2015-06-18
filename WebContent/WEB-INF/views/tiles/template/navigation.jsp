<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<div class="pull-right" style="padding-right: 50px">
		<a href="?language=en">English</a>| <a href="?language=es">Spanish</a>
		<security:authorize access="isAuthenticated()">
  			Welcome <security:authentication property="principal.username" />
  			<a href="<spring:url value='/logout' />"> Logout</a>
		</security:authorize>
		
		<security:authorize access="isAnonymous()">
			<a href="<spring:url value='/login' />"> Login</a>
			<a href="<spring:url value='/register' />">Register</a>
		</security:authorize>

<li><a href="<spring:url value="createAssessment/"/>">Home</a></li>
<li><a href="<spring:url value="/addAssessmentForm"/>">Add
		Assessment</a></li>
<li><a href="<spring:url value="/assessmentDelete/id"/>">Delete</li>
<li><a href="<spring:url value="/assessmentEdit/id"/>">Edit</li>
<%-- <li><a href="<spring:url value="/assessmentDelete/id"/>">Delete Assessment</a></li> --%>

