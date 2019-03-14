<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>welcome</title>
<link href="../css/support.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<form id="form-1">
		<div class="logout">
			<a href="../logoutServlet">logout</a>
		</div>
		<h1>Welcome!!! ${user.username} </h1>
	</form>
<%
   Cookie[] cks=request.getCookies();
   for(Cookie ck:cks)
   {
      String cn=ck.getName();
      String cv=ck.getValue();
      
      %>
      Cookie name : <b><%=cn %> </b><br>
      Cookie Value : <b><%=cv %> </b><br>
      <%
   }
%>
</body>
</html>