<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html>
<html lang="en">
<head>
<title><tiles:insertAttribute name="title" /></title>

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
			<h3 class="text-muted">Assessment System</h3>
		</div>
		<div >
			<h1>
				<tiles:insertAttribute name="heading" />
			</h1>
			
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
