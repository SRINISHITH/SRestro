<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<div class="w3-quarter w3-container">
<img src="logo.jpg" alt="Avatar" width=10% height=10%>
</div>
<style>
body {font-family: Arial;}
input[type=text], input[type=password] {
    width: 30%;
    padding: 12px 150px;
    
}

button {
    background-color: skyblue;
    color: white;
    width: 15%;
    height: 6%;

}
img.avatar {
    width: 25%;
    border-radius: 30%;
}

</style>
</head>
<body>
<form action="register.jsp">
<div class="w3-container w3-teal">
<div class="w3-quarter w3-container">
<img src="images1.png" alt="Avatar" width=20% height=5%>--!>
</div>
<div class="w3-rest w3-container">
<h2>Login  Page</h2>
</div></div>

 <center>
    <br>
    <img src="image.jpg" alt="Avatar" class="avatar"><br><br>
  
    <b>Username</b>
    <input type="text" placeholder="Enter Username" required><br><br>

    <b>Password</b>
    <input type="password" placeholder="Enter Password" required><br>
    <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
    </div>
  
     <h6>forget User Name or Password      <a href="forgetusername.html" >click here</a></h6>
     <h6>Not Register Yet ?     <a href="userregisteration.html" >click here</a></h6>
     <button type="submit">Login</button><br><br>

<a class="btn btn-block btn-social btn-google">
  <span class="fa fa-google"></span>
  Sign in with google
</a>
<a class="btn btn-social-icon btn-google">
  <span class="fa fa-google"></span>
</a> 
<a class="btn btn-block btn-social btn-facebook">
  <span class="fa fa-facebook"></span>
  Sign in with facebook
</a>
<a class="btn btn-social-icon btn-facebook">
  <span class="fa fa-facebook"></span>
</a>

  </center>
 <center>
  <footer>&copy; Copyright 2018 SRestro</footer>

<address>
      </center> 
      Visit us at:www.srestro.com<br>
                 T-Nagar<br>
                Chennai<br>
                 India
</address>

</form>
</body>
</html>
