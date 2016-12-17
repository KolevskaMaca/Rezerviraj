<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Online Резервација</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
<body>

<div class="jumbotron">
  <div class="container text-center">
    <h1>Online Резервација</h1>      
    <p>Резервирај маса, Резервирај соба & Избери мени</p>
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="index.jsp">Почетна</a>
      <a class="navbar-brand" href="Masi">Резервирај маса</a>
      <a class="navbar-brand" href="rsoba.jsp">Резервирај соба</a>
      <a class="navbar-brand" href="RezervirajMeni">Мени</a>
    </div>
    
      <ul class="nav navbar-nav navbar-right">
     <li><a style='color: #f2f2f2;'>Welcome
        ${korisnik.getIme()} ${korisnik.getPrezime() }</a></li>
				
        <li><a href="registracija.jsp"><span class="glyphicon glyphicon-user"></span> Регистрација</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Резервирај</a></li>
      </ul>
    </div>
</nav>


<div class="container">    
  <div class="row">
   
    <div class="col-lg-12"> 
      <div class="panel panel-danger">
      
        <div class="panel-body"><img src="sliki/rsoba.png" class="img-responsive" style="width:100%"></div>
    
      </div>
    </div>
   
  </div>
</div><br>

</body>
</html>
