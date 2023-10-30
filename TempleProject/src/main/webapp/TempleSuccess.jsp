<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Temple Success</title>
</head>
<body>
	<nav class="navbar bg-info" data-bs-theme="Light">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link" href="TempleSuccess.jsp">Temple Success</a></li>
			<li class="nav-item"><a class="nav-link" href="Temple.jsp">Temple</a></li>
			<li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
		</ul>
	</nav>
	<h2>This is temple success page...</h2>

	Name is ${Key1}
	</br> Place is ${Key3}
	</br> Main God name is ${Key2}
	</br> Constructed in Year ${Key4}

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>