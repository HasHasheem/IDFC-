<%@page import="dto.Stddto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Stddto dto=(Stddto)request.getAttribute("null"); %>
<%=dto.getStdid() %>
<%=dto.getStdname() %>
<%=dto.getStdemail() %>
<%=dto.getRollno() %>
</body>
</html>