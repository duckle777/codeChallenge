<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Product List - Code Challenge</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <h1 style="border-bottom: solid #EAEDED;">Code Challenge</h1>
  <p/>&nbsp;
  <h3>Requirements:</h3>
  <p>
  <ul>
  	<li>Given 20 products create a database of products (examples are: mongoDB, mySQL, Oracle DB)</li>
  		<ul><li>I used mySQL and mySQL workbench</li></ul>
  	<li>Create an application using Spring Framework</li>
  		<ul><li>I chose to try out Spring Boot with MVC and web starter</li></ul>
  	<li>Application should be secure with no vulnerability of simple SQL injection</li>
  		<ul><li>I used JPA queries with the Specification class</li></ul>
  	<li> Application should have a UI with a basic header, footer, search box, and table that will display the products returned by the search.</li>
  		<ul><li>This application uses JSP, Bootstrap 4 and HTML</li></ul>
  	<li>Do not use third-party search algorithms</li>
  		<ul><li>I did not use a 3rd party search algorithm</li></ul>
  	<li>Product can be searched by multiple criteria</li>
  		<ul><li>The search page has multiple text fields for searches</li></ul>
  </ul>
  
  <table class="table">
  	<tr>
  		<td><form action="/products/search" method="GET"><input type="submit" value="Search" name="search" style="float: left;"/></form></td>
  		<td><form action="/products/list" method="GET"><input type="submit" value="View All" name="list" style="float: right;"/></form></td>
  	</tr>
  </table>
  </p>
  <footer class="text-center">
  <p style="background-color: #EAEDED;">Presented by Aileen Fernandez</p>
  </footer>
 </div>
</body>
</html>