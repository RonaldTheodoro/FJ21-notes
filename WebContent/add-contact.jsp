<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add contact</title>
    <link href="js/jquery-ui/jquery-ui.css" rel="stylesheet">
    <script src="js/jquery-ui/external/jquery/jquery.js"></script>
    <script src="js/jquery-ui/jquery-ui.js"></script>
</head>
<body>
    <form action="addContact" method="POST">
        <p>Name: <input type="text" name="name"></p>
        <p>Email: <input type="text" name="email"></p>
        <p>Address: <input type="text" name="address"></p>
        <p>Birth Date: <caelum:fieldDate id="birthDate"/></p>
        <p><input type="submit" name="Save"></p>
    </form>
</body>
</html>