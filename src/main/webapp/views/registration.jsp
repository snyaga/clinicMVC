<%--
  Created by IntelliJ IDEA.
  User: susan
  Date: 5/7/15
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>
<html>
<head>
    <title></title>
</head>
<body>

<c:if test="${not empty error}">
  <div class="error">${error}</div>
</c:if>
<c:if test="${not empty msg}">
  <div class="msg">${msg}</div>
</c:if>

<form action="<c:url value='/register' />" method='POST'>

  <input type="text" placeholder="first name" name="firstName" >
  <input type="text" placeholder="last name" name="lastName" >
  <input type="date" placeholder="dd/mm/yyyy" name="dateOfBirth" >


  <button> Submit</button>

</form>

</body>
</html>
