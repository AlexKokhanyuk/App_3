<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" ; charset="utf-8">
    <title>$Title$</title>
</head>
<body>

<div class="box" align='center'>
    <p class="text1">My App</p>
    <%--<form class="test" action="index.html" method="post">--%>
    <%--<div class="message">--%>
    <%--</div>--%>
    <%--<button type="submit" name="submit">Open Cookies</button>--%>
    <%--</form>--%>

    <form action="/controller"  method="post">
        First Name:
        <input value="" size="20" name="firstname" type="text">
        <br>
        Last Name:
        <input value="" size="20" name="lastname" type="text">
        <br>
        <input type="submit">
    </form>
</div>
</body>
</html>
