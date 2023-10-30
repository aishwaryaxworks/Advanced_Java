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

<title>Vendor Success Page</title>
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

	<h1>Vendor details sent successfully.....!!</h1>

	Name is ${Key1}
	<br> GST No is ${Key2}
	<br> Owner is ${Key3}
	<br> Location is ${Key4}

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>