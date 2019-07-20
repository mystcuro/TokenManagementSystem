<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title> Token Management App </title>
	
<link type="text/css" rel="stylesheet" href="css/style.css">

</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>    Admin Page  </h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
			
			<table>
			
				<tr>
					<th>Token</th>
					<th>Name</th>
				</tr>
				
				<c:forEach var="tCustomer" items="${CUSTOMERS_LIST}">
					
					<tr>
						<td> ${tCustomer.id} </td>
						<td> ${tCustomer.cName} </td>
					</tr>
				
				</c:forEach>				
			</table>
		
		</div>
	
	</div>
	<form action="CustomerControllerServlet" method="GET" >
	
	<input type="hidden" name="command" value="DELETE"/>
	<input type="submit" value="Bring Next Customer On Top" class="save"/>
	
	</form>
</body>


</html>