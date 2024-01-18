<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
   .h1{
   
     display:flex;
     height:10vh;
     justify-content:space-between;
     align-items:center;
     background-color: #00ffff;
   }
   .header{
   display:flex;
   justify-content:space-between;
   align-items:center;
 }
 a{
  text-decoration:none ;
			align-content: center;
			padding: 10px;
			text-align: center;
			margin: 10px auto;
			width: 160px;
			background-color: whitesmoke;
			display: inline-block;
			text-transform: uppercase;
			border-radius: 20px;
 }
</style>
</head>
<body>
<header>
<div class="h1">
  <img src="C:\Users\AtluriMukesh\Downloads\logo.jpeg" alt="Description of the image">

<div class="header">
   <a href="Home.jsp">Home</a>
   <a href="About.jsp">About</a>
   <a href="fooditems.jsp">fooditems</a>
   <a href="userdetails.jsp">user detials</a>
</div>
</div>
<h1>${msg.name}</h1>
<h1>${msg.email}</h1>


</header>
<h1>User details</h1>

<form action="find">
<pre>
  enter name    :<input type="text" name="name">
  
  enter email    :<input type="email" name="email">
  enter password :<input type="password" name="passwords">
  enter number    :<input type="text" name="num">
  enter address    :<input type="text" name="address">
                  <input type="submit">
  
            
 </pre>
</form>

</body>
</html>