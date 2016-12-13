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
<c:set var="korisnik" value="${sessionScope.korisnik}"></c:set>
<c:if test="${korisnik == null }">
 <c:out value="You are not logged in!"></c:out>
 <%
  if (true)
    return;
   boolean t;
 %>
</c:if>
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
					class="navbar-brand" href="rmeni.jsp">Мени</a>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="login.jsp"><span
						class="glyphicon glyphicon-user"></span> Логирај се</a></li>
				<li><a href="registracija.jsp"><span
						class="glyphicon glyphicon-user"></span> Регистрација</a></li>
				<li><a href="#"><span
						class="glyphicon glyphicon-shopping-cart"></span> Резервирај</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">Ресторан</div>
					<div class="panel-body">
						<img
							src="https://cdns.klimg.com/merdeka.com/i/w/news/2012/10/23/106465/670x335/6-restoran-dengan-pelayanan-unik-di-berbagai-belahan-dunia.jpg"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">За ресторанот...</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-danger">
					<div class="panel-heading">Хотел</div>
					<div class="panel-body">
						<img
							src="http://www.capitalhill.com/wp-content/gallery/home/reception-10x8-low-res.jpg"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">За хотелот...</div>
				</div>
			</div>
			
			<div class="col-sm-4">
				<div class="panel panel-success">
					<div class="panel-heading">Мени</div>
					<div class="panel-body">
						<img
							src="http://www.modernhousedad.com/wp-content/uploads/2013/08/photo-1.jpg"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">За менито...</div>
				</div>
			</div>
		</div>
	</div>
	<br>
	<footer class="container-fluid text-center">
		<p>Online Rezervacija</p>
		<form class="form-inline">
			Додај забелешки: <input type="email" class="form-control" size="50"
				placeholder="Email Address">
			<button type="button" class="btn btn-danger">Испрати</button>
		</form>
	</footer>

</body>
</html>
