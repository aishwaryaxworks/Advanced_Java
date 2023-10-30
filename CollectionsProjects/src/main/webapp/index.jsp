<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Vegetable Home Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous"/>
</head>
<body>
<nav class="navbar bg-primary" data-bs-theme="dark">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active" href="total">Veggies</a></li>
		</ul>
	</nav>
	<h2 style="font-style: italic;">This is Vegetable Home Page...!</h2>
	<form action="visit" class="form-horizontal" method="post">
		<div class="col-sm-3">
			<label for="id" class="form-label">Id</label> 
			<input type="number" class="form-control" id="id" name="id">
		</div>
		<br/>
		<div class="col-sm-3">
			<label for="name" class="form-label">Name</label> 
			<input type="text" class="form-control" id="name" name="name">
		</div>
		<div class="col-sm-3">
			<label for="price" class="form-label">Price</label> 
			<input type="number" class="form-control" id="price" name="price">
		</div>
		<div class="col-sm-3">
			<label for="weight" class="form-label">Weight</label> 
			<input type="number" class="form-control" id="weight" name="weight">
		</div>
		<div class="col-auto">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form>
	
	Total : ${total } entries
	

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>