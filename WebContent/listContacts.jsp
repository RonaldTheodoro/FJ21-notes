<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="contactDAO" class="br.com.caelum.model.dao.ContactDAO"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List contacts</title>
</head>
<body>
    <c:import url="header.jsp"/>
    <c:forEach var="contact" items="${contactDAO.listContacts}" varStatus="id">
        <ul>
            <li>${id.count}</li>
            <li>${contact.name}</li>
            <li><a href="mailto:${contact.email}">${contact.email}</a></li>
            <li>${contact.address}</li>
            <li><fmt:formatDate value="${contact.birthDate.time}" pattern="dd/MM/yyyy"/></li>
        </ul>
    </c:forEach>
</body>
</html>
