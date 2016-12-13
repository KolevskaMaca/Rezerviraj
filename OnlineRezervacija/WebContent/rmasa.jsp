<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Online Резервација</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Remove the navbar's default rounded borders and increase the bottom margin */
.navbar {
	margin-bottom: 50px;
	border-radius: 0;
}

/* Remove the jumbotron's default bottom margin */
.jumbotron {
	margin-bottom: 0;
}

/* Add a gray background color and some padding to the footer */
footer {
	background-color: #f2f2f2;
	padding: 25px;
}
</style>
</head>

<body>


	<div class="jumbotron">
		<div class="container text-center">
			<h1>Online Rezervacija</h1>
			<p>Закажи маса, Закажи соба & Избери мени</p>
		</div>
	</div>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="rmasa.jsp">Резервирај маса</a> <a
					class="navbar-brand" href="rsoba.html">Резервирај соба</a> <a
					class="navbar-brand" href="rmeni.html">Мени</a>
			</div>

			<ul class="nav navbar-nav navbar-right">
			<li><a style='color: black;'>Welcome
        ${korisnik.getIme()} ${korisnik.getPrezime() }</a></li>
				<li><a href="login.jsp"><span
						class="glyphicon glyphicon-user"></span> Логирај се</a></li>
				<li><a href="registracija.jsp"><span
						class="glyphicon glyphicon-user"></span> Регистрација</a></li>
				<li><a href="#"><span
						class="glyphicon glyphicon-shopping-cart"></span>Резервирај</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">

		<div class="row">

			<div class="col-lg-12">
				<div class="panel panel-danger">

					<div class="panel-body">
						<img src="sliki/rmasa.jpg" class="img-responsive" alt="Image"
							id="image" />
					</div>
					<form method="get" action="RezervirajMasa">
					
					<a href="<c:url value='RezervirajMasa?masi=1&imeto=${korisnik.getIme()}'/>">1</a>
						
						<button class="submit">vnesi</button>
						 <!-- <a href="RezervirajMasa?masi=1">1</a> -->
					</form>
				</div>
			</div>

		</div>

	</div>
	<br>
	<!-- <script>
		function getXY(event) {

			var x = event.pageX - this.offsetLeft;
			var y = event.pageY - this.offsetTop;
			alert('(' + x + ',' + y + ')');
			// Use AJAX to send data to server.

		}
		document.getElementById('image').addEventListener('click', getXY);
	</script> -->
</body>
</html>
