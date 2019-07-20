<!DOCTYPE html>
<html>

<head>
	<title>Add </title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/customer-style.css">	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2> Admin Login </h2>
		</div>
	</div>
	
	<div id="container">
		<h3></h3>
		
		<form action="CustomerControllerServlet" method="POST">
			
			<table>
				<tbody>
					<tr>
						<td><label>Username : </label></td>
						<td><input type="text" name="user" /></td>
					</tr>

					<tr>
						<td><label>Password :</label></td>
						<td><input type="password" name="pass" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="LOGIN" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form>
		
		<div style="clear: both;"></div>
		
	</div>
</body>

</html>











