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
<body class="white">
	<nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="index.html">Home</a></li>
			<li class="nav-item"><a class="nav-link active" href="Food.jsp">Food</a></li>
		</ul>
	</nav>
	<h1 class="white">This is Food Success page...</h1>
	<h1>Food Ordered successfully...!</h1>

	Name is ${Key1}
	<br> 
	Veg or Non-Veg is ${Key2}
	<br> 
	Hotel is ${Key3}
	<br>
	${Price}
	<br>
	${Quantity}


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>