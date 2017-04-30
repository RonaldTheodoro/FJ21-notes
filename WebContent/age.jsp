<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <c:import url="header.jsp"/>
    <p>Entry your age</p>
    <form action="showAge.jsp" method="POST">
        <p>Age: <input type="text" name="age"></p>
        <p><input type="submit" value="Send"></p>
    </form>
</body>
</html>
