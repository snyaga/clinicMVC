<%--
  Created by IntelliJ IDEA.
  User: susan
  Date: 5/7/15
  Time: 9:49 AM
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

<form action="<c:url value='/drug' />" method='POST'>

  <!--<input type="number" placeholder="patientId" name="patientId" >-->
  <label>Patient ID</label>
  <select name="patientId" required class="form-control">
    <option></option>
    <c:forEach  var="option" items="${data}">
      <option>${option.patientId}</option>
    </c:forEach>
  </select>


  <input type="text" placeholder="drug name" name="drugName" >

  <button> Submit</button>

</form>

</body>
</html>
