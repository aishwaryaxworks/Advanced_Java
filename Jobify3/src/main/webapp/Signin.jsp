<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign In</title>
    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        /* Move background styling to a separate wrapper */
        .background-wrapper {
            background-image: url("./images/bgimage.jpg");
            background-size: 80% 80%;
            background-position: center;
            background-repeat: no-repeat;
            height: 100vh; /* Set the height to cover the entire viewport */
            display: flex;
            align-items: center;
            justify-content: center;
        }

        body {
            margin: 0; /* Remove default body margin */
            color: black; /* Set default text color to white */
        }

        .container {
            margin-top: -30px;
        }

        .card {
            width: 100%;
            max-width: 400px; /* Set a maximum width for larger screens */
            margin: 0 auto;
            background-color: rgba(255, 255, 255, 0.8); /* Add a background color with some transparency */
            color: #000; /* Set text color to black */
            border-radius: 10px;
        }

        .card-body {
            padding: 0px; /* Adjust the padding as needed */
            
        }

        /* Custom styling for the sign-in button */
        .btn-small {
            width: 80px;
            height: 30px;
            font-size: 12px;
        }

        .signup-header {
        background-color: #007bff;
        color: #ffffff;
        text-align: center;
        padding: 10px; /* Adjust the padding as needed */
        border-top-right-radius: 10px;
        border-top-left-radius: 10px;
        }

        .signup-header h5 {
            font-size: 24px; /* Adjust the font size as needed */
            margin: 0;
            font-family:Arial, Helvetica, sans-serif /* Add your preferred font family */
        }

        .form-group {
        padding-right: 20px; /* Adjust the padding as needed */
        padding-left: 20px;
        padding-top: 5px;
        }
        .footer{
            text-align: center;
        }


        
    </style>
</head>
<body>

<!-- Navigation bar with grey background -->
<nav class="navbar navbar-expand-lg navbar-light bg-secondary">
    <a class="navbar-brand" href="#">Jobify</a>
</nav>

<!-- Background wrapper -->
<div class="background-wrapper">
    <div class="container">
        <div class="card">
            <div class="card-body">
                <div class="signup-header">
                <h5 class="card-title text-center">Sign In</h5>
                </div>
                <form>
                    <div class="form-group">
                        <label for="inputEmail">Email ID</label>
                        <input type="email" class="form-control" id="email" placeholder="&#9993; Email">
                    </div>
                    <div class="form-group">
                        <label for="inputPassword">Password</label>
                        <input type="password" class="form-control" id="password" placeholder="&#128272; Password">
                    </div>
                    <div class="form-group text-center">
                        <!-- Center the button within the form -->
                        <button type="submit" class="btn btn-primary btn-small">Sign In</button>
                    </div>
                    <div class="form-group text-center">
                        <label for="signin">Don't have an account? <a href="Jobify.jsp">Sign up</a></label>
                    </div>
                </form>
            </div>
        </div>
    </div>    
</div>
<footer>
    <div class="footer">
          <p>
            Developed by: Sarvesh &copy;
            2023 All rights reserved
          </p>
          </div>
</footer>

<!-- Bootstrap JS and Popper.js CDN -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>



</body>
</html>

    