<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: susan
  Date: 5/7/15
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form action="<c:url value='/drugs' />" method='POST'>

  <input type="number" placeholder="patientId" name="patientId" >
  <input type="text" placeholder="drug name" name="drugName" >

  <button> Submit</button>

</form>
</body>
</html>
