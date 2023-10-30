<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Grocery</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar bg-primary" data-bs-theme="dark">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
			<li class="nav-item"><a class="nav-link active" href="Grocery.jsp">Grocery</a></li>
		</ul>
	</nav>
	<h1 style="font-style: italic;">This is Grocery Page...!</h1>
	<form action="grocery" class="row g-3" method="post">
		<div class="col-md-6">
			<label for="name" class="form-label">Item Name</label> 
			<input type="text" class="form-control" id="name" name="name">
		</div>
		<div class="col-md-6">
			<label for="type" class="form-label">Item Type</label> 
			<input type="text" class="form-control" id="type" name="type">
		</div>
		<div class="col-md-6">
			<label for="price" class="form-label">Price</label> 
			<input type="number" class="form-control" id="price" name="price">
		</div>
		<div class="col-md-6">
			<label for="quantity" class="form-label">Quantity</label> 
			<input type="number" class="form-control" id="quantity" name="quantity">
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary">Add to Cart</button>
		</div>
	</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>