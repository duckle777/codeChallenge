<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Search</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <h1 style="border-bottom: solid #EAEDED;">Search</h1>
  <form action="searchAllProducts" method="post">
  <table class="table">
   <tbody>
    <!--  
     <tr>
      <td>Id:</td>
      <td><input type="text" name="id"/></td>
     </tr>
      -->
     <tr>
      <td>Product:</td>
      <td><input type="text" name="name"/></td>
     </tr>
     <tr>
      <td>Description:</td>
      <td><input type="text" name="description"/></td>
     </tr>
     <tr>
      <td>Last Sold:</td>
      <td><input type="date" name="lastsold"/></td>
     </tr>
     <tr>
      <td>Shelf Life:</td>
      <td><input type="text" name="shelflife"/></td>
     </tr>
     <tr>
      <td>Department:</td>
      <td><input type="text" name="department"/></td>
     </tr>
     <tr>
      <td>Price:</td>
      <td><input type="text" name="price"/></td>
     </tr>
     <tr>
      <td>Unit:</td>
      <td><input type="text" name="unit"/></td>
     </tr>
     <tr>
      <td>xFor:</td>
      <td><input type="text" name="xfor"/></td>
     </tr>
     <tr>
      <td>Cost:</td>
      <td><input type="text" name="cost"/></td>
     </tr>
   </tbody>
  </table>
  	<p>
  	<input type="submit" text="Search" name="search"/>
  	<input type="reset" text="Clear"/>
  	</p>
  </form>
  <footer class="text-center">
  <p style="background-color: #EAEDED;">Presented by Aileen Fernandez</p>
  </footer>
 </div>
</body>
</html>