<%--
  Created by IntelliJ IDEA.
  User: EzraWilliams
  Date: 11/18/2024
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title> Failure page </title>
</head>
<body>
<h1><%= "Failure Page" %>
</h1>
<h2> <%=request.getAttribute("username")%> is incorrect . Please try again</h2>
</body>
</html>
