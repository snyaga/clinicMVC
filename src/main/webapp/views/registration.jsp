<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: susan
  Date: 5/7/15
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>

<form action="<c:url value='/register' />" method='POST'>

  <input type="text" placeholder="first name" name="firstName" >
  <input type="text" placeholder="last name" name="lastName" >
  <input type="date" placeholder="date of birth" name="dob" >


  <button> Submit</button>

</form>
<body>

</body>
</html>
