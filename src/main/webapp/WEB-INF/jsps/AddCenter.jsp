<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1 align="center">Welcome To COVID-19 Vaccination portal</h1>
</head>
<body bgcolor="pink">
 <div align="center">
  <h1>Vaccine Center Detail  Form</h1>
  
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<f:form action="AddCenterResult" method="post" modelAttribute="CenterData" >
  
  
   <table style="with: 80%">

    <tr>
     <td>Center Name</td>
     <td><f:input path="centerName" /> <f:errors path="centerName"/></td>
    </tr>
    <tr>
     <td>City</td>
     <td><f:input path="city" /> <f:errors path="city"/></td>
    </tr>
    <tr>
     <td>Pincode</td>
     <td><f:input path="pincode" /> <f:errors path="pincode"/></td>
    </tr>
    <tr>
     <td>No of slots for Covaxin</td>
     <td><f:input path="covaxin" /> <f:errors path="covaxin"/></td>
    </tr>
    <tr>
     <td> No of slots for Covishield</td>
     <td><f:input path="covishield" /> <f:errors path="covishield"/></td>
    </tr>
   </table></br>
   <input type="submit" value="Register Center" /></br>
  </f:form>
 </div>

</body>
</html>
