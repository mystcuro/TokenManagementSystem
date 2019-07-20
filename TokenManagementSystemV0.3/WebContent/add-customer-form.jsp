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
			<h2> Token Management</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Add Customer</h3>
		
		<form action="CustomerControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="ADD" />
			
			<table>
				<tbody>
					<tr>
						<td><label>Token no : </label></td>
						<td><input type="text" name="token" /></td>
					</tr>

					<tr>
						<td><label>Name:</label></td>
						<td><input type="text" name="name" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="CustomerControllerServlet">Back to List</a>
		</p>
	</div>
</body>

</html>











