<%--
  Created by IntelliJ IDEA.
  User: mp
  Date: 29/08/2022
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



        <tiles:insertDefinition name="template">
            <tiles:putAttribute name="body">
                <h1>Login to Application</h1>
                <c:if test="${not empty error}">
                    <div class="error">${error}</div>
                </c:if>
                <form method="post" action="/login">
                                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <input type="text" name="j_username" placeholder="Username"/>
                    <input type="password" name="j_password" placeholder="Password"/>
                    <input type="submit" name="commit" value="Login">
                </form>
            </tiles:putAttribute>
        </tiles:insertDefinition>
</body>
</html>
