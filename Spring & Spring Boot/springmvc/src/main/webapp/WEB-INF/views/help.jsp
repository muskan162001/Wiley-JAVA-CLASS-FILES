<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

<%
	String name = (String)request.getAttribute("name");

%>

<h1>Hello My name is <%=name %></h1>
<h1>This is help page</h1>

</body>
</html>