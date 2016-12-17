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
body {
  margin: 0;
  padding-left: 10px;
  font: 20px Arial, sans-serif;
  line-height: 30px;
}
a:hover {
  color: red;
}
a{
color:white;	
}
#overlay-blocking,
#overlay-passing{
  position: absolute;
  height: 30px;
  width: 10em;
  left: 0;
}

#overlay-blocking {
  top: 30px;
  background: rgba(0,100,0, .2);    
  pointer-events: none;
}
#overlay-passing {
  top: 0;
  background: rgba(100,0,0, .2);    
}
a:hover { 
    background-color: yellow;
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
				<li><a style='color: #f2f2f2;'>Welcome ${korisnik.getIme()}
						${korisnik.getPrezime() }</a></li>

				<li><a href="registracija.jsp"><span
						class="glyphicon glyphicon-user"></span> Регистрација</a></li>
				<li><a href="#"><span
						class="glyphicon glyphicon-shopping-cart"></span> Резервирај</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
	
		<div class="row">

			<div class="col-lg-12">
				<div class="panel panel-danger">

					<div class="panel-body">
						<!-- <img src="sliki/rmasa.jpg" class="img-responsive" alt="Image"
							id="image" /> -->
					</div>
					<form method="post" action="RezervirajMasa">

						
<div style="background-image:url('sliki/rmasa.jpg');width:1000px;height:480px">
<div style="width:100px;height:100px;background-color:${list.get(0)};margin-top:0px;margin-left:10px;position:absolute;opacity:.5;text-align: center;
vertical-align: middle; line-height: 100px; ">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=1&imeto=${korisnik.getIme()}'/>">1</a>
</div>

<div style="text-align: center; vertical-align: middle; line-height: 130px;width:100px;height:130px;background-color:${list.get(1)};margin-top:0px;margin-left:110px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=2&imeto=${korisnik.getIme()}'/>">2</a>
</div>

<div style="text-align: center; vertical-align: middle; line-height: 130px;width:100px;height:130px;background-color:${list.get(2)};margin-top:0px;margin-left:210px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=3&imeto=${korisnik.getIme()}'/>">3</a>
</div>

<div style="text-align: center;vertical-align: middle; line-height: 80px;width:100px;height:80px;background-color:${list.get(3)};margin-top:100px;margin-left:10px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=4&imeto=${korisnik.getIme()}'/>">4</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 60px;width:100px;height:80px;background-color:${list.get(4)};margin-top:180px;margin-left:10px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=5&imeto=${korisnik.getIme()}'/>">5</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 90px;width:65px;height:130px;background-color:${list.get(5)};margin-top:130px;margin-left:110px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=6&imeto=${korisnik.getIme()}'/>">6</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 90px;width:65px;height:130px;background-color:${list.get(6)};margin-top:130px;margin-left:175px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=7&imeto=${korisnik.getIme()}'/>">7</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 130px;width:65px;height:130px;background-color:${list.get(7)};margin-top:130px;margin-left:240px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=8&imeto=${korisnik.getIme()}'/>">8</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 100px;width:80px;height:100px;background-color:${list.get(8)};margin-top:260px;margin-left:10px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=9&imeto=${korisnik.getIme()}'/>">9</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 100px;width:80px;height:100px;background-color:${list.get(9)};margin-top:360px;margin-left:10px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=10&imeto=${korisnik.getIme()}'/>">10 </a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 100px;width:80px;height:75px;background-color:${list.get(10)};margin-top:260px;margin-left:90px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=11&imeto=${korisnik.getIme()}'/>">11</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 50px;width:80px;height:50px;background-color:${list.get(11)};margin-top:335px;margin-left:90px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=12&imeto=${korisnik.getIme()}'/>">12</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 65px;width:80px;height:75px;background-color:${list.get(12)};margin-top:385px;margin-left:90px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=13&imeto=${korisnik.getIme()}'/>">13</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 50px;width:80px;height:50px;background-color:${list.get(13)};margin-top:260px;margin-left:240px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=14&imeto=${korisnik.getIme()}'/>">14</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 90px;width:125px;height:100px;background-color:${list.get(14)};margin-top:360px;margin-left:310px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=15&imeto=${korisnik.getIme()}'/>">15</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 90px;width:125px;height:100px;background-color:${list.get(15)};margin-top:360px;margin-left:435px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=16&imeto=${korisnik.getIme()}'/>">16</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 90px;width:125px;height:100px;background-color:${list.get(16)};margin-top:360px;margin-left:560px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=17&imeto=${korisnik.getIme()}'/>">17</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 100px;width:80px;height:100px;background-color:${list.get(17)};margin-top:360px;margin-left:730px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=18&imeto=${korisnik.getIme()}'/>">18</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 130px;width:80px;height:130px;background-color:${list.get(18)};margin-top:330px;margin-left:810px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=19&imeto=${korisnik.getIme()}'/>">19</a>
</div>
<div style="text-align: center;vertical-align: middle; line-height: 150px;width:80px;height:150px;background-color:${list.get(19)};margin-top:310px;margin-left:890px;position:absolute;opacity:.5;">
<a style="display:block;width:100%;height:100%;" href="<c:url value='RezervirajMasa?masi=20&imeto=${korisnik.getIme()}'/>">20</a>
</div>
</div>

						<!-- <a href="RezervirajMasa?masi=1">1</a> -->
					</form>
				</div>
			</div>

		</div>

	</div>
	<br>
	
</body>
</html>
