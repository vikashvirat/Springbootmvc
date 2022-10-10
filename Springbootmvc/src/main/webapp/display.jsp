<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Springboot using MVC</title>
</head>
<body>
I am in jsp page
Hello my name is:<%=request.getAttribute("name") %>
My name is ${name}
</body>
</html>