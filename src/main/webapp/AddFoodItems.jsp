<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${msg}</h1>
<form action="saveitem">
<pre>
    Itemname        :<input type="text" name="itemName">
    Price           :<input type="text" name="price">
    img             :<input type="text" name="img">
    restaurantName  :<input type="text" name="restaurantName">
    itemCategory    :<input type="text" name="itemCategory">
                <input type="submit"  value="save">
</pre>

</form>

</body>
</html>