<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Register</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Register</h1>

			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="user" class="form-horizontal">
			<fieldset>
				<legend>Add new member</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div" />
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="memberNumber">User
						Name</label>
					<div class="col-lg-10">
						<form:input id="userName" path="userName" type="text"
							class="form:input-large" />
						<form:errors path="userName" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="firstName">First
						Name</label>
					<div class="col-lg-10">
						<form:input id="firstName" path="firstName" type="text"
							class="form:input-large" />
						<form:errors path="firstName" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="lastName">Last
						Name</label>
					<div class="col-lg-10">
						<form:input id="lastName" path="lastName" type="text"
							class="form:input-large" />
						<form:errors path="lastName" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="password">Password</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:password id="password" path="password"
								class="form:input-large" />
							<form:errors path="password" cssClass="text-danger" />
						</div>
					</div>
				</div>


				<div class="form-group">
					<label class="control-label col-lg-2" for="verifyPassword">Verify
						Password</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:password path="verifyPassword" class="form:input-large" />
							<form:errors path="verifyPassword" cssClass="text-danger" />
						</div>
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Register" />
					</div>
				</div>

			</fieldset>
		</form:form>
	</section>
</body>
</html>
