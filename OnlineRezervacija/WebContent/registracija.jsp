<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Online Резервација</title>
<meta charset="utf-8" />
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
			<h1>Online Резервација</h1>
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
				<a class="navbar-brand" href="index.jsp">Почетна</a>
				<a class="navbar-brand" href="Masi">Резервирај маса</a> <a
					class="navbar-brand" href="rsoba.jsp">Резервирај соба</a> <a
					class="navbar-brand" href="RezervirajMeni">Мени</a>
			</div>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="registracija.jsp"><span
						class="glyphicon glyphicon-user"></span> Регистрација</a></li>
				<li><a href="#"><span
						class="glyphicon glyphicon-shopping-cart"></span> Резервирај</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">

		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Внесете ги податоците за регисрација:</h3>
					</div>
					<div class="panel-body">
						<form role="form" action="Registracija">
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<input type="text" name="ime" id="first_name"
											class="form-control input-sm" placeholder="Име">
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<input type="text" name="prezime" id="last_name"
											class="form-control input-sm" placeholder="Презиме">
									</div>
								</div>
							</div>

							<div class="form-group">
								<input type="email" name="email" id="email"
									class="form-control input-sm" placeholder="Email">
							</div>

							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<input type="text" name="telefon" id="telefon"
											class="form-control input-sm" placeholder="Телефон">
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<input type="password" name="password"
											id="password_confirmation" class="form-control input-sm"
											placeholder="Password">
									</div>
								</div>
							</div>

							<input type="submit" value="Регистрирај се"
								class="btn btn-info btn-block">

						</form>
					</div>
				</div>
			</div>
		</div>







		<div class="row">

			<div class="col-sm-6 col-lg-4 col-md-4"></div>
			<div class="col-sm-6 col-md-4"></div>
				<div class="panel panel-danger"></div>
			</div>

		</div>
	</div>
	<br>
	<footer class="container-fluid text-center">
		<p>Online Резервација</p>
		<form class="form-inline">
			Додај забелешки: <input type="email" class="form-control" size="50"
				placeholder="Email">
			<button type="button" class="btn btn-danger">Испрати</button>
		</form>
	</footer>

</body>
</html>
