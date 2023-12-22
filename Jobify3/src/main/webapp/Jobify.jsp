<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Signup Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8sh+WyZETRMOl3FXmEp/Se/5lZ5p5UVCyC2A"
          crossorigin="anonymous">
    <style>
    
        body {
            background-image:url("./images/bgimage.jpg");
            background-size: cover;
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 20;
            height: 100%;
            border-radius: 50%;
            border-color: black;
            
        }

        .container-fluid {
            padding: 50px;
        }
        
        .nav{
            padding-left: 40px;
            padding-bottom: 10px;
            background-color: grey;
            font-size: 20px;
            text-decoration: none;
        }

        .signup-container {
            background-color: rgba(255, 255, 255, 0.8);
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            overflow: hidden;
            max-width: 400px;
            margin: 0 auto;
        }

        .signup-header {
            background-color: #007bff;
            color: #ffffff;
            text-align: center;
            padding: 10px;
        }
        
        .signup-header a {
            text-decoration: none;
        }
        
        .signup-header h2 {
            font-size: 24px; /* Adjust the font size as needed */
            margin: 0;
            font-family:Arial, Helvetica, sans-serif /* Add your preferred font family */
        }

        .signup-form {
            padding: 20px;
        }

        .form-group {
            display: block;
            text-align: center;
            padding: 0%;
            margin-bottom: 20px;
        }
        input[type="text"],
        input[type="email"],
        input[type="tel"],
        input[type="password"] {
            width: 80%;
            padding: 5px; /* Increase padding as needed */
            box-sizing: border-box;
        }

        label {
            font-weight: normal;
        }

        .btn-signup {
            text-align: center;
            background-color: rgb(82, 192, 236);
            color: black;
            font-size: 16px; /* Adjust the font size as needed */
            padding: 5px 15px; /* Adjust the padding as needed */
            border: 1px solid #252424; /* Add this line to add a light border */
            border-radius: 5px; /* Optional: Add border-radius for rounded corners */
        }

        .footer{
            text-align: center;
        }
        
        .navbar-custom a {
            text-decoration: none;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-custom">
        <div class="nav">
          <div class="navbar-header">
            <a style="color:black;" href="#" >Jobify</a>
          </div>
        </div>
      </nav>


<div class="container-fluid">
    <div class="row justify-content-center">
        <div class="col-md-6 signup-container">
        
            <div class="signup-header">
                <h2>Sign Up</h2>
            </div>
            <div class="signup-form">
                <form action="save" method="post">
                    <div class="form-group">
                        <input type="text" id="name" name="name" placeholder="&#128100; Name">
                        <p style="color:Tomato;">${nameInvalid}</p>
                    </div>
                    <div class="form-group">
                        <input type="email" id="email" name="email" placeholder="&#9993; Email">
                        <p style="color:Tomato;">${emailInvalid}</p>
                        <p style="color:Tomato;">${emailExists}</p>
                    </div>
                    <div class="form-group">
                        <input type="tel" id="mobile" name="mobile" placeholder="&#128241; Mobile Number">
                        <p style="color:Tomato;">${mobileInvalid}</p>
                    </div>
                    <div class="form-group">
                        <input type="password" id="password" name="password" placeholder="&#128272; Password">
                        <p style="color:Tomato;">${passwordInvalid}</p>
                    </div>
                    <div class="form-group">
                        <input type="password" id="confirmPassword" name="confirmPassword" placeholder="&#128273; Re-type Password">
                        <p style="color:Tomato;">${confirmPasswordInvalid}</p>
                    </div>
                    <div class="form-group">
                        <input type="radio" id="jobseeker" name="account" value="Job Seeker">Job Seeker
                        <input type="radio" id="jobprovider" name="account" value="Job Provider">Job Provider
                    </div>
                    <div class="form-group">
                        <input type="checkbox" id="agree" name="agree">
                        <label for="agree" >I agree to all Terms and Conditions</label>
                    </div>
                    <div class="form-group">
                    <button type="submit" class="btn-signup">Sign Up</button>
                    </div>
                    
                    <div class="form-group">
                        <!-- <input type="" id="sigin" name="sigin"> -->
                        <label for="signin">Already have an account? <a href="Signin.jsp">Sign in</a></label>
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

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.8/dist/umd/popper.min.js"
        integrity="sha384-q6r8q8U7O+VgFYiDPy2A4PFLaRsz9L6c3KEK/zXqR2x/4pkZDwrOHcP+2BHcz9t0"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8sh+WyZETRMOl3FXmEp/Se/5lZ5p5UVCyC2A"
        crossorigin="anonymous"></script>
</body>
</html>
    