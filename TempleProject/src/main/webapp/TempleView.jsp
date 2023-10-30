<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Temple View</title>
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
	<div>
		<%-- <h1>${view}</h1> --%>
		<table>
			<tr>
				<th>Name</th>
				<th>Place</th>
				<th>Main God</th>
				<th>Constructed Year</th>
			</tr>
			<tr>
				<td>${dto.name }</td>
				<td>${dto.place }</td>
				<td>${dto.mainGod }</td>
				<td>${dto.constYear }</td>
			</tr>
		</table>
		<jstl:forEach items="${view }" var="dto">
		${dto.name } ${dto.place }
		<%-- ${dto} --%>
		<br />
		</jstl:forEach>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>