<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Assessment</title>
<style type="text/css">
.wrapper {
	margin: 0px auto;
	width: 500px;
	padding-top: 50px;
	/*border: 1px solid;*/
	margin-top: 30px;
}

table {
	border: 1px solid;
	width: 500px;
}

tr {
	border: 1px solid;
}

td {
	width: 100px;
}

tr:nth-child(odd) {
	background: #b8d1f3;
}
</style>
</head>
<body>
	<div class="wrapper">
		<p align="right">
			<button type=button onclick=window.location.href='<spring:url value="addAssessmentForm" />'>
				Add Assessment</button>
		</p>
		<h3>List of Assessments</h3>

		<div class="form-group">
			<div >

				<div id="message" style="color: red;">
					<br /> ${message} <br />
				</div>
				<table>

					<c:forEach items="${assessment}" var="assessment">
						<tr>
							<td>
								<%-- 					<a href="<c:url value="addQuestions" />">Edit</a> --%>
								<button type="button" onclick=window.location.href='<spring:url value="/QuestionAnswer/createQuestion/${assessment.id}"/>'>
									<c:out value="${assessment.nameAssessment}" />
							</td>

							<td><a
								href="<c:url value="assessmentEdit/${assessment.id}" />">Edit</a>|
								<a href="<c:url value="assessmentDelete/${assessment.id}" />">Delete</a>

							</td>

						</tr>
					</c:forEach>

				</table>
			</div>
		</div>

	</div>

</body>
</html>