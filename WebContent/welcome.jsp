<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String message = "Welcome";
%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><% out.println(message); %></title>
</head>
<body>
    <c:import url="header.jsp"/>
    <h1><% out.println(message); %></h1>
    <h1><%=message %></h1>
</body>
</html>
