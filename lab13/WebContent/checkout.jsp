<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Checkout</title>
<link href="./resouces/css/store.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div class="left">
		<div id="div1">
			<p class="border-bottom">
				<strong>1. Shipping Address</strong>
			</p>
			<table>
				<tr>
					<td>Name:</td>
					<td><input name="name"></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input name="address"></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><input name="city"></td>
				</tr>
				<tr>
					<td>State:</td>
					<td><input name="state"></td>
				</tr>
				<tr>
					<td>ZipCode:</td>
					<td><input name="zipcode"></td>
				</tr>
			</table>

			<p class="border-bottom">
				<strong>2. Payment Method</strong>
			</p>
			<table>
				<tr>
				<label><input type="radio" name="payment" value="credit"> CreditCard</label><br>
				</tr>
				<tr>
				<label><input type="radio" name="payment" value="debit"> DebitCard</label><br>
				</tr>
				<tr>
				<label><input type="radio" name="payment" value="other"> Other</label>
				</tr>
			</table>
			<p class="border-bottom">
				<strong>3. Billing Address</strong>
			</p>
			<table>
				<tr>
					<td>Name:</td>
					<td><input name="namebill"></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input name="addressbill"></td>
				</tr>
				<tr>
					<td>City:</td>
					<td><input name="citybill"></td>
				</tr>
				<tr>
					<td>State:</td>
					<td><input name="statebill"></td>
				</tr>
				<tr>
					<td>ZipCode:</td>
					<td><input name="zipcodebill"></td>
				</tr>
			</table>
		</div>
	</div>

	<div class="right">
		<div id="div2">
			<p class="border-bottom">Order confirmation</p><br>
			<p>Products </p>
			<p class="border-bottom"><strong>Total of the order</strong></p>
		</div>
		<div id="div3">
			    <form action="/login" method="post">  
        <button>Proceed</button><br>
    </form>
		</div>
	</div>
</body>
</html>