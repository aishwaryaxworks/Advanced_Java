<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
<h1 style="font-style: italic;">This is Login Page...!</h1>
	<form action="cart" class="row g-3" method="post"> 
		<div class="col-md-3">
			<label for="userId" class="form-label">User Id</label> 
			<input type="text" class="form-control" id="userId" name="userId">
		</div>
		<div class="col-md-3">
			<label for="password" class="form-label">Password</label> 
			<input type="password" class="form-control" id="password" name="password">
		</div>
		<div class="col-auto">
			<button type="submit" class="btn btn-primary">Login</button>
		</div>
	</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>