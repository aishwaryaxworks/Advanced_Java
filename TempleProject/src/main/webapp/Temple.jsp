<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Temple</title>
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
			<li class="nav-item"><a class="nav-link active" href="total">Temple</a></li>
		</ul>
	</nav>
	<h1 style="font-style: italic;">This is Temple Page...!</h1>
	<form action="visit" class="row g-3" method="post">
		<div class="col-md-3">
			<label for="name" class="form-label">Name</label> 
			<input type="text" class="form-control" id="name" name="name">
		</div>
		<br/>
		<div class="col-md-3">
			<label for="place" class="form-label">Place</label> 
			<input type="text" class="form-control" id="place" name="place">
		</div>
		<div class="col-md-3">
			<label for="mainGod" class="form-label">Main God</label> 
			<input type="text" class="form-control" id="mainGod" name="mainGod">
		</div>
		<div class="col-md-3">
			<label for="constYear" class="form-label">Year</label> 
			<input type="number" class="form-control" id="constYear" name="constYear">
		</div>
		<div class="col-md-3">
			<label for="constBy" class="form-label">Constructed By</label> 
			<input type="text" class="form-control" id="constBy" name="constBy">
		</div>
		<div class="col-auto">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form>
	
	Total : ${total } entries
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>