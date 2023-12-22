<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chocolate</title>
</head>
<body>
	<h1>Enter chocolate data</h1>
	<form action="chocolate/save" method="post">
		<input type="text" name="name" placeholder="Chocolate Name"> <input
			type="number" name="price" placeholder="Chocolate Price"> <input
			type="number" name="quantity" placeholder="Chocolate Quantity">
		<input type="text" name="manufacturer"
			placeholder="Chocolate Manufacturer">
		<button type="submit">Save</button>
	</form>
	<h2>${exists}</h2>
	<br>

	<form action="chocolate/find" method="get">
		Enter Id to find : <input type="number" name="id" placeholder="Chocolate Id">
		<button type="submit">Find</button>
	</form>
	<br>

	<form action="chocolate/read" method="get">
		<button type="submit">Read All</button>
	</form>

	<br>
	<form action="chocolate/findByName" method="get">
		<input type="text" name="name" placeholder="Enter a name to find" />
		<button type="submit">Search</button>
	</form>
	
	<h2>${nameNotFound}</h2>
	<h2>${nameNotValid}</h2>
	
	<br>
	<h2>${dto.name }</h2>
	<h2>${dto.price }</h2>
	<h2>${dto.quantity }</h2>
	<h2>${dto.manufacturer }</h2>
	
	<br>
	<h2>Update Quantity by name</h2>
	<form action="chocolate/update" method="post">
		<input type = "number" name = "quantity" placeholder = "Quantity">
		<input type = "text" name = "name" placeholder = "Chocolate Name">
		<button type="sumbit">Update</button>
	</form>
	<h2>${isUpdated}</h2>
	
	<form action="chocolate/delete" method="post">
		<input type="text" name="name" placeholder="Name to delete"/>
		<button type="sumbit">Delete</button>
	</form>
	<h2>${deleteStatus}</h2>


</body>
</html>

