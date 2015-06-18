<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"> -->
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
	
<div class="wrapper">
	<form:form modelAttribute="assessment" 
		 method="post">
		<fieldset>
			<legend>Add New Assessment</legend>


			<form:errors path="*" cssStyle="color : red;" />
			<div >
				<label  for="nameAssessment">
					Assessment Name</label>
				<div c>
					<form:input id="nameAssessment" path="nameAssessment" type="text"
						 value="${assessment.nameAssessment}"/>
					<form:errors path="nameAssessment" cssStyle="color : red;"  />
				</div>
			</div>


			<div >
				<label 
					for="descriptionAssessment"> Assessment Description</label>
				<div >
					<form:input id="descriptionAssessment" path="descriptionAssessment"
						type="text"  value="${assessment.descriptionAssessment}"/>
					<form:errors path="descriptionAssessment" cssStyle="color : red;"  />
				</div>
			</div>
			
 			<div >
				<label 
					for="dateAssessment"> Date </label>
				<div >
					<form:input id="dateAssessment" path="dateAssessment"
						type="text" value="${assessment.dateAssessment}"/>
					<form:errors path="dateAssessment" cssStyle="color : red;" />
				</div>
			</div> 

			<div align="right">

				<input type="submit" id="btnAdd" value="Save" />

			</div>

		</fieldset>
	</form:form>
	</div>

</body>
</html>