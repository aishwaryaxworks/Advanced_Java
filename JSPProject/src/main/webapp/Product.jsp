<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Product</title>
<style type="text/css">
body {
	background:
		url("https://images.pexels.com/photos/1666067/pexels-photo-1666067.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
	background-repeat: no-repeat;
	background-size: cover;
}

.white {
	font-style: italic;
	color: white;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="Product.jsp">Product</a></li>
			<li class="nav-item"><a class="nav-link" href="Vendor.jsp">Vendor</a></li>
		</ul>
	</nav>
	<h1 class="white">This is Product page...</h1>
	<form action="product" method="post" class="white">
		<div class="mb-3">
			<label for="name" class="form-label">Name</label> 
			<input type="text" class="form-control" id="name" name="name" /><br>
		</div>
		<div class="mb-3">
			<label for="price" class="form-label">Price</label> 
			<input type="text" class="form-control" id="price" name="price" /><br>
		</div>
		<div class="mb-3">
			<label for="type" class="form-label">Type</label> 
			<input type="text" class="form-control" id="type" name="type" /><br>
		</div>
		<div class="mb-3">
			<label for="quantity" class="form-label">Quantity</label> 
			<input type="text" class="form-control" id="quantity" name="quantity" /><br>
		</div>
			<input type="submit" value="Send" class="btn btn-primary">
	</form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>
