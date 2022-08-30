<%--
  Created by IntelliJ IDEA.
  User: mp
  Date: 29/08/2022
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellpadding="2" cellspacing="2" align="center">
    <tr>
        <td height="30" colspan="2" align="center">
            Welcome to java spring clazz
        </td>
    </tr>
    <tr>
        <td>
            <a href="/">Trang chu</a>
            <sec:authorize access="hasAnyRole('ROLE_USER')">
                <a href="/login" style="margin-left: 30px">Dang nhap</a>
            </sec:authorize>
            <sec:authorize access="!hasAnyRole('ROLE_USER')">
                <a href="/nguoi-dung" style="margin-left: 30px">Nguoi dung</a>
                <a href="/logout" style="margin-left: 30px">Dang xuat</a>
            </sec:authorize>
        </td>
        <td><tiles:insertAttribute name="body"/></td>
    </tr>
</table>
</body>
</html>
