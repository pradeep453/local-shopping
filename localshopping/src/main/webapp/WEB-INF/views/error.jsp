<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Local Shopping -${title}</title>
<script>
	window.menu = '${title}';

	window.contextRoot = '${contextRoot}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap cerulean theme CSS -->
<link href="${css}/bootstrap.cerulean.theme.css" rel="stylesheet">


<!-- Bootstrap DataTables -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>


	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="${contextRoot}/home">Local Shopping
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

		</div>
	</nav>

	<!-- Page Content -->
	<div class="content">
		<div class="container">
			<div class="row">
				<div class="col-xs-12">
					<div class="jumbotron">
						<h1>${errorTitle}</h1>
						<hr/>
						<blockquote style="word-wrap:break-word">
							${errorDescription}
						</blockquote>
					</div>				
				
				</div>
			</div>
		</div>


	</div>
	<!-- Footer comes here -->
	<%@include file="./shared/footer.jsp"%>



	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>


	<!-- DataTable Plugin-->
	<script src="${js}/jquery.dataTables.js"></script>

	<!-- DataTable bootstrap js -->
	<script src="${js}/dataTables.bootstrap.js"></script>


	<!-- Self coded javascript -->
	<script src="${js}/myapp.js"></script>

</body>

</html>
