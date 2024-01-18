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



</header>
<h1>food items</h1>
<ul>
    <li>biryani price=98</li>
    <li>kabab price=50
    </li>
    <li>egg rice price=50</li>
    <li>dosa price=20</li>
    <li>idly price=30</li>
</ul>

</body>
</html>