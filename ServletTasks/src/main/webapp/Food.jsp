<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Home</title>
<style type="text/css">
body {
	background:
		url("https://img.freepik.com/free-photo/vegetables-set-left-black-slate_1220-685.jpg?w=900&t=st=1694759068~exp=1694759668~hmac=e92d8ffe363ae2f4b6e673bf17920b0735a8c877052b3979ee942d0815b46a21");
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
	<nav class="navbar bg-dark border-bottom border-body"
		data-bs-theme="dark">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="index.html">Home</a></li>
			<li class="nav-item"><a class="nav-link active" href="Food.jsp">Food</a></li>
		</ul>
	</nav>
	<h1 class="white">Welcome to Food page...</h1>
	<form action="food" method="post" class="white">
		<div class="mb-3">
			<label for="name" class="form-label">Name</label> 
			<input type="text" class="form-control" id="name" name="name" /><br>
		</div>
		<div class="input-group mb-3">
			<label for="vnv" class="input-group-text">Vegetarian or Non-Vegetarian</label> 
			<select class="form-select" id="vnv" name="vnv">
				<option selected>Choose...</option>
				<option value="1">Vegetarian</option>
				<option value="2">Non-Vegetarian</option>
			</select>
		</div>
		<div class="input-group mb-3">
			<label for="hotel" class="input-group-text">Hotel Name</label> 
			<select class="form-select" id="hotel" name="hotel">
				<option selected>Choose...</option>
				<option value="1">Mavalli Tiffin Room (MTR)</option>
				<option value="2">Vidyarthi Bhavan</option>
				<option value="3">Brahmin's Coffee Bar</option>
				<option value="4">Shree Sagar (CTR)</option>
				<option value="5">Taaza Thindi</option>
			</select>
		</div>
		<div class="input-group mb-3">
			<label for="price" class="form-label">Price</label> 
			<input type="text" class="form-control" id="price" name="price" /><br>
		</div>
		<div class="input-group mb-3">
			<label for="quantity" class="input-group-text">Quantity</label> 
			<select class="form-select" id="quantity" name="quantity">
				<option selected>Choose...</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
			</select>
		</div>
		<div class="form-check">
  			<input class="form-check-input" type="checkbox" value="accept" id="flexCheckDefault" name="accept">
  			<label class="form-check-label" for="accept">
    			Accept Agreement
 			</label>
		</div>
		<input type="submit" value="Send" class="btn btn-primary">
	</form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>