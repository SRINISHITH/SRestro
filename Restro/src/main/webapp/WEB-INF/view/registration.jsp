<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body style="background-color:patchblue;">
<div class="w3-quarter w3-container">
<img src="logo.jpg" alt="Avatar" width=10% height=10%>
</div>
<center><h1 style="color:green;"><b>User Registeration Page</b></h1>


		<b>Username*</b> <br> <input type="Username" name="username" ><br><br>
		                <b>Password*  </b><br><input type="password" name="pwd" ><br><br>	
                                                       <b>Conform Password*  </b><br><input type="password" name="pwd" ><br><br>	
		                <b>FirstName*</b><br>  <input type="surname" name="surname" ><br><br>
		                <b>LastName*</b> <br> <input type="other names" name="names" ><br><br>
		                <b>Date of Birth*</b><br><input type="date of birth" name="dob" ><br><br>
		                <b>Email*</b><br>  <input type="email" name="email" ><br><br>
		                <b>Telephone*</b><br> <input type="telephone" name="tel" ><br><br>
		                <b>Address* </b><br> <input type="address" name="add" ><br><br>
		                <b>Zip Code*</b><br> <input type="postcode" name="zc" ></center><br>
<center>		                <h6>Already Registered       <a href="login.html">click here</a></h6>
 <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">submit</button>
<button type="button" class=" btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">cancle</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">User Registeration</h4>
        </div>
        <div class="modal-body">
          <p>Registeration completed</p>
        
<input type="submit" value="close" >
</div>
		
</center>				
</div>
	</form>


<p><h4 style="color:blue;">Note: Please make sure your details are correct before submitting form and all fields marked with * are mandiatory........!</h4></p>
</style>
</body>
<head>
</html>