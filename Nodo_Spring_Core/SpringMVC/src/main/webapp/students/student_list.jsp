
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ListStudent</title>
</head>
<body>
<table border="1">
    <thead>
        <th>Id</th>
        <th>Name</th>
        <th>Age</th>
    </thead>
    <tbody>
        <c:forEach items="${lsSt}" var="st">
            <tr>
                <td>${st.id}</td>
                <td>${st.name}</td>
                <td>${st.age}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
