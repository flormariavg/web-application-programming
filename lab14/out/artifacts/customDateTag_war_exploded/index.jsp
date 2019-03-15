<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 14/03/2019
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="mct" uri="curr" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>My First Tag Demo</title>
</head>
<body>
  <p>With 2 params: color:blue size:20px <mct:CurrDate color="Blue" size="20px"/></p>
  <p>With 1 params: color:red <mct:CurrDate color="Red"/></p>
  <p>With no params: <mct:CurrDate /> </p>
</body>
</html>