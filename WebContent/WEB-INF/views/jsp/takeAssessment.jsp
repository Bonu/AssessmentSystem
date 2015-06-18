<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Take Assessment</title>
</head>
<body>

<div class="wrapper">
	<form:form modelAttribute="/submitassessment" cssClass="form-horizontal" method="post">
		<fieldset>
			<legend>Take Assessment</legend>

			<div class="form-group">
				<label  for="nameAssessment">
					Assessment Name: </label> <c:out value="${takeAssessment.assessmentName}"></c:out>
				<div class="col-lg-10">
				<label  for="nameAssessment">
				Student Name </label>
					<c:out value="${takeAssessment.studentName}"></c:out>
				</div>
			</div>
			
			<table border="1">
			
			<c:forEach items="${takeAssessment.squestions}" var="squestions">
			<tr>
				<td>
					<c:out value="${squestions.questionId}"/>
				</td>
				<td>
					<c:out value="${squestions.description}"/>
				</td>
				<td>
					<c:forEach items="${squestions.answers}" var="sanswers">
						<c:out value="${sanswers.answerId}"/>
						-
						<c:out value="${sanswers.description}"/>
					</c:forEach>
				</td>
			</tr>
			</c:forEach>
			


			</table>

			<div align="right">
				<input type="submit" id="btnAdd" value="Submit" />
			</div>

		</fieldset>
	</form:form>
	</div>

</body>
</html>