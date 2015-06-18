<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html>
<html lang="en">
<head>
<!-- <meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0"> -->

<title><tiles:insertAttribute name="title" /></title>

<!-- <link href="http://getbootstrap.com/dist/css/bootstrap.css"
	rel="stylesheet">

<link href="http://getbootstrap.com/examples/jumbotron/jumbotron.css"
	rel="stylesheet"> -->
	<style type="text/css">
	.container{
	width:960px;
	margin: 0px auto;
	background-color: #ccc;
	border: 1px solid black;
	}</style>

</head>

<body>

	<div class="container">
 <div class="header">
			<%-- <ul class="nav nav-pills pull-right">
				<tiles:insertAttribute name="navigation" />
			</ul> --%>
			<h3 class="text-muted">Assessment System</h3>
		</div>
		<div >
			<h1>
				<tiles:insertAttribute name="heading" />
			</h1>
			<%-- <p>
				<tiles:insertAttribute name="tagline" />
			</p> --%>
		</div>

		<div class="row">
			<tiles:insertAttribute name="content" />
		</div>

		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>

	</div>
</body>
</html>
