<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: kienr
  Date: 8/26/2022
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1><i>Name: ${student.name}</i><form:errors path="name"></h1>
    <br>
    <h1><i>Age: ${student.age} Tuổi</i><form:errors path="name"> </h1>
</body>
</html>
