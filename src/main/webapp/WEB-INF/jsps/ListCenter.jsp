<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Center Details</title>


<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1 align="center">All Center Details </h1>

<hr>




<table class="table">
  <thead>
    <tr>
      <th scope="col">Center ID</th>
      <th scope="col">Center Name</th>
      <th scope="col">City</th>
      <th scope="col">Pin Code</th>
      <th scope="col">Covaxin</th>
      <th scope="col">Covishield</th>
      <th scope="col">Vaccinator ID</th>

    </tr>
  </thead>
  <tbody>
    
  
    
    <c:forEach var="center" items="${ListCenter}">
    
    <tr>
      <th scope="row"><c:out value="${center.centerId }"></c:out></th>
      <td><c:out value="${center.centerName }"></c:out> </td>
      <td><c:out value="${center.city }"></c:out> </td>
   	  <td><c:out value="${center.pincode }"></c:out> </td>
   	  <td><c:out value="${center.covaxin }"></c:out> </td>
   	  <td><c:out value="${center.covishield }"></c:out> </td>
   	  <td><c:out value="${center.vaccinaterId }"></c:out> </td>
   	  <td> <a class="btn btn-success" href="updateCenter/${center.centerId }">Update</a> <a class="btn btn-danger" href="deleteCenter?centerId=${center.centerId }"  onclick=" return confirm('Are You Sure ?')" >Delete</a></td>
    </tr>
    
    
  
    
    </c:forEach>
    
    
  </tbody>
</table>




</body>
</html>