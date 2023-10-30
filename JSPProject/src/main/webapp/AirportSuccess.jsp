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

<title>AirportSuccess Page</title>
</head>
<body>
<nav class="navbar bg-success" data-bs-theme="dark">
<ul class="nav justify-content-end">
  <li class="nav-item">
    <a class="nav-link" href="index1.jsp">Home</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="airport.jsp">Airport</a>
  </li>
   <li class="nav-item">
    <a class="nav-link active" href="AirportSuccess.jsp">AirportSuccess</a>
  </li> 
</ul>
</nav>

<h1>Airport Details Sent Successfully......!</h1>

Name is ${Key1}
<br>
Country is ${Key2}
<br>
Type is ${Key3}
<br>
Capacity is ${Key4}
<br>
Width is ${Key5}
<br>
No of Terminals  ${Key6}
<br>
Open Date is ${Key7}
<br>
Operational ${Key8}
<br>
Inaugurated By ${Key9}


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>