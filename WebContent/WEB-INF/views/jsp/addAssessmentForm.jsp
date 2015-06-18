<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Add Assessment</title>
<style type="text/css">
.wrapper{
margin:0px auto;
width:500px;
padding:10px;
border: 1px solid;
margin-top: 50px;

}
</style>
</head>
<body>
	<h3>Add Your Assessment Here</h3>


<div class="wrapper">
	<form:form modelAttribute="assessment" cssClass="form-horizontal"
		 method="post">
		<fieldset>
			<legend>New Assessment</legend>


			<form:errors path="*" cssClass="alert alert-danger" element="div" />
			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2" for="nameAssessment">
					Assessment Name</label>
				<div class="col-lg-10">
					<form:input id="nameAssessment" path="nameAssessment" type="text"
						class="form:input-large" value="${assessment.nameAssessment}"/>
					<form:errors path="nameAssessment" cssStyle="color : red;"  />
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2"
					for="descriptionAssessment"> Assessment Description</label>
				<div class="col-lg-10">
					<form:input id="descriptionAssessment" path="descriptionAssessment"
						type="text" class="form:input-large" value="${assessment.descriptionAssessment}"/>
					<form:errors path="descriptionAssessment" cssStyle="color : red;"  />
				</div>
			</div>
			
 			<div class="form-group">
				<label class="control-label col-lg-2 col-lg-2"
					for="dateAssessment"> Date </label>
				<div class="col-lg-10">
					<form:input id="dateAssessment" path="dateAssessment"
						type="text" class="form:input-large" value="${assessment.dateAssessment}"/>
					<form:errors path="dateAssessment" cssStyle="color : red;" />
				</div>
			</div> 

			<div align="right">

				<input type="submit" id="btnAdd" class="btn btn-primary" value="Save" />

			</div>

		</fieldset>
	</form:form>
	</div>

</body>
</html>