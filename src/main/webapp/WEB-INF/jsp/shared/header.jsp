<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>${title}</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/bootstrap-editable.css" rel="stylesheet">
<link href="assets/css/site.css" rel="stylesheet">
<link href="assets/css/jquery.typeahead.css" rel="stylesheet">
<style>
body {
	padding-top: 60px; /* 60px to make the container go all the way
      to the bottom of the topbar */
}
</style>
<!-- <link href="assets/css/bootstrap-responsive.css" rel="stylesheet"> -->
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      </script>
    <![endif]-->
</head>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
     <div class="container">
       <div class="navbar-header">
         <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
           <span class="sr-only">Toggle navigation</span>
           <span class="icon-bar"></span>
           <span class="icon-bar"></span>
           <span class="icon-bar"></span>
         </button>
         <a class="navbar-brand" href="#">Business Lab</a>
       </div>
       <div id="navbar" class="collapse navbar-collapse">
         <ul class="nav navbar-nav">
           <li><a href="clients.html" class="active">Clients</a></li>
           <li><a href="projects.html">Projects</a></li>
         </ul>
       </div><!--/.nav-collapse -->
     </div>
</nav>