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
		url("https://img.freepik.com/free-vector/cartoon-people-throwing-out-rubbish-trash_74855-6289.jpg?w=826&t=st=1695110175~exp=1695110775~hmac=4d3b21b41e0f08e8390ec8b4ad73ea4ab9900c9cd0795150e4ed9157cde37b3b");
	background-repeat: no-repeat;
	background-size: cover;
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
			<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
		</ul>
	</nav>
	<h1>This is waste disposal page...</h1>
	<form action="save" method="post" >
		<div class="mb-3">
			<label for="name" class="form-label">Name</label> 
			<input type="text" class="form-control" id="name" name="name" /><br>
		</div>
		<div class="mb-3">
			<label for="type" class="form-label">Type</label> 
			<input type="text" class="form-control" id="type" name="type" /><br>
		</div>
		<div class="mb-3">
			<label for="weight" class="form-label">Weight</label> 
			<input type="text" class="form-control" id="weight" name="weight" /><br>
		</div>
		<input type="submit" value="Save" class="btn btn-primary">
	</form>

</body>
</html>