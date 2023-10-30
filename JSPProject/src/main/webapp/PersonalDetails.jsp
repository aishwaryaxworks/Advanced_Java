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

<title>Personal Details</title>
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
</head>
<body>
<nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="Player.jsp">Player</a></li>
			<li class="nav-item"><a class="nav-link" href="PersonalDetails.jsp">Personal Details</a></li>
		</ul>
	</nav>
	<form action="vendor" method="post" class="white">
		<div class="mb-3">
			<label for="father" class="form-label">Father</label> 
			<input type="text" class="form-control" id="father" name="father" /><br>
		</div>
		<div class="mb-3">
			<label for="mother" class="form-label">Mother</label> 
			<input type="text" class="form-control" id="mother" name="mother" /><br>
		</div>
		<div class="mb-3">
			<label for="wife" class="form-label">Wife</label> 
			<input type="text" class="form-control" id="wife" name="wife" /><br>
		</div>
		<div class="mb-3">
			<label for="age" class="form-label">Age</label> 
			<input type="text" class="form-control" id="age" name="age" /><br>
		</div>
		<div class="mb-3">
			<label for="alive" class="form-label">Alive</label> 
			<input type="text" class="form-control" id="alive" name="alive" /><br>
		</div>
		<div class="mb-3">
			<label for="married" class="form-label">Married</label> 
			<input type="text" class="form-control" id="married" name="married" /><br>
		</div>
		<div class="mb-3">
			<label for="dob" class="form-label">Date of Birth</label> 
			<input type="text" class="form-control" id="dob" name="dob" /><br>
		</div>
			<input type="submit" value="Send" class="btn btn-primary">
	</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>