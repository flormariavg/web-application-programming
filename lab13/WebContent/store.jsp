<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<h1>Book Store</h1>
		<table>
			<thead>
				<tr>
					<th></th>
					<th>Description</th>
					<th>Price</th>
					<th>Quantity</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products}" var="item">
					<tr>
						<td></td>
						<td>${item.id}</td>
						<td>${item.name}</td>
						<td>${item.unitPrice}</td>
						<td><button onclick="">Add Cart</button> </td>
						
					</tr>
				</c:forEach>
		</table>

	</div>


</body>
</html>