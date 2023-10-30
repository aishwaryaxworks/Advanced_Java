<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">

<title>Vendor Page</title>
<style type="text/css">
body {
	background:
		url("https://cdn.shopify.com/s/files/1/1246/6441/files/Vendor_sourcing.jpg?v=1644447534&width=1024");
	background-repeat: no-repeat;
	background-size: cover;
}

.white {
	font-style: italic;
	color: black;
}
</style>
</head>
<body>
	<nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="Product.jsp">Product</a></li>
			<li class="nav-item"><a class="nav-link" href="Vendor.jsp">Vendor</a></li>
		</ul>
	</nav>
	<h1>This is Vendor Page....</h1>
	<form action="vendor" method="post" class="white">
		<div class="mb-3">
			<label for="name" class="form-label">Name</label> 
			<input type="text" class="form-control" id="name" name="name" /><br>
		</div>
		<div class="mb-3">
			<label for="gst" class="form-label">GST</label> 
			<input type="text" class="form-control" id="gst" name="gst" /><br>
		</div>
		<div class="mb-3">
			<label for="owner" class="form-label">Owner</label> 
			<input type="text" class="form-control" id="owner" name="owner" /><br>
		</div>
		<div class="mb-3">
			<label for="location" class="form-label">Location</label> 
			<input type="text" class="form-control" id="location" name="location" /><br>
		</div>
			<input type="submit" value="Send" class="btn btn-primary">
	</form>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>