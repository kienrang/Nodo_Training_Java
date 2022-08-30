<%--
  Created by IntelliJ IDEA.
  User: mp
  Date: 29/08/2022
  Time: 09:18
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<tiles:insertDefinition name="template">
<tiles:putAttribute name="body">
<h2>${message}</h2>
</tiles:putAttribute>
</tiles:insertDefinition>
</body>
</html>
