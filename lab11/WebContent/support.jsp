<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Support</title>
<link href="css/support.css" type="text/css" rel="stylesheet" />
</head>
<body>
<form action="support" method="post">
	<div class="thwo-column">
		<label>Name</label> <input name="name" /> <label>Email
			address</label> <input type="email" name="email" />
	</div>
	<div>
		<label>Problem</label> <input name="problem" />
	</div>

	<div>
		<fieldset>
			<legend>Problem description</legend>
			<textarea rows="" cols="100"></textarea>
		</fieldset>
	</div>
	<input type="submit" value="help" /> 
</form>
</body>
</html>