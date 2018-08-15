<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Product List - No Results</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <h1 style="border-bottom: solid #EAEDED;">Products</h1>
  <p>
  No Results. Try Again.
  <table class="table">
  	<tr>
  		<td><form action="search" method="GET"><input type="submit" value="New Search" name="search" style="float: left;"/></form></td>
  		<td><form action="list" method="GET"><input type="submit" value="View All" name="list" style="float: right;"/></form></td>
  	</tr>
  </table>
  </p>
  <footer class="text-center">
  <p style="background-color: #EAEDED;">Presented by Aileen Fernandez</p>
  </footer>
 </div>
</body>
</html>