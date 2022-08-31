<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Spring MVC</title>
</head>
<body>
    <h2>Please Input Student Information</h2>
    <%--@elvariable id="student" type=""--%>
    <form:form method="post" action="/student/save" modelAttribute="student">
        <table>
            <tr>
                <td>Name: </td>
                <td><form:input path="name" type="text"/></td>
            </tr>
            <tr>
                <td>Age: </td>
                <td><form:input path="age" type="text"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Submit"/>
                </td>
            </tr>
        </table>
    </form:form >
</body>
</html>