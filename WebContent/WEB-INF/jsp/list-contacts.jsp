<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <c:forEach var="contact" items="${contacts}">
        <ul>
            <li>${contact.name}</li>
            <li><a href="mailto:${contact.email}">${contact.email}</a></li>
            <li>${contact.address}</li>
            <li><fmt:formatDate value="${contact.birthDate.time}" pattern="dd/MM/yyyy"/></li>
            <li><a href="mvc?logic=RemoveContactLogic&id=${contact.id}">Remove</a></li>
        </ul>
    </c:forEach>
</body>
</html>
