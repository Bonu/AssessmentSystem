<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Assessment List - Student View</title>
</head>
<body>

<!-- It will have 2 tables display -->
<div id="global">
<form:form modalAttribute="assessmentList" action="showAssessments" method="post">
    <fieldset>
        <legend>Assessment Open</legend>
        <!-- Iterate through the Assessment list and show all the fields in table format -->
        
        <!--  label -->
        <table border="1">
			<c:forEach items="${assessmentList}" var="assessment">
			<tr>
				<td><c:out value="${assessment.nameAssessment}"/></td>
				<td><c:out value="${assessment.descriptionAssessment}"/></td>
				<td><c:out value="${assessment.date}"/></td>
				<td><a href="<spring:url value="/takeAssessment/${username}/${assessment.id}"/>">Take Assessment</a></td>
			</tr>
			</c:forEach>
		</table>
    </fieldset>
</form:form>
<!-- Table 1: Assessments from Registered assessment table, Assessment is with open status show link to take assessment -->
</div>
</body>
</html>