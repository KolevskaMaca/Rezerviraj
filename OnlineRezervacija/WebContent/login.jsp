<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: #f76a6a">
	<div class="login-form-1">
		<form id="login-form" class="text-left" method="post" action="Login">
			<div class="login-form-main-message"></div>
			<div class="col-lg-4"></div>
			<div class="col-lg-4">
				<div class="panel panel-info">
					<div class="panel-body">
						<div class="main-login-form">
							<div class="login-group">
								<div class="form-group">
									<label for="lg_username" class="sr-only">Username</label> <input
										type="text" class="form-control" id="lg_username" name="email"
										placeholder="email">
								</div>
								<div class="form-group">
									<label for="lg_password" class="sr-only">Password</label> <input
										type="password" class="form-control" id="lg_password"
										name="password" placeholder="password">
								</div>


							</div>
							<button type="submit" class="btn-default">
								<i class="fa fa-chevron-right">Logiraj</i>
							</button>
							<a href="registracija.jsp"> Registriraj se! </a>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>







</body>
</html>