<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Add Assessment</title>
</head>
<body>
	<h3>Add Your Assessment Here</h3>



	<form:form modelAttribute="assessment" class="form-horizontal" action="createAssessment/add" method="POST">
		<fieldset>
			<legend>New Assessment</legend>

			<%-- 				<form:errors path="*" cssClass="alert alert-danger" element="div"/> --%>
			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="nameAssessment">
					Assessment Name </label>
				<div class="col-lg-10">
					<form:input id="nameAssessment" path="nameAssessment" type="text"
						class="form:input-large" />
					<form:errors path="nameAssessment" cssClass="text-danger" />
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2"
					for="descriptionAssessment"> Assessment Description </label>
				<div class="col-lg-10">
					<form:input id="descriptionAssessment" path="descriptionAssessment"
						type="text" class="form:input-large" />
					<form:errors path="descriptionAssessment" cssClass="text-danger" />
				</div>
			</div>

			<div class="form-group">
				<div class="col-lg-offset-2 col-lg-10">
					<input type="submit" id="btnAdd" class="btn btn-primary"
						value="Add" />
				</div>
			</div>

		</fieldset>
	</form:form>

</body>
</html>