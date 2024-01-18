<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
      <div class="center">
          <h1>Login</h1>
          
          <form action="findadmin" method="POST">
              <div class="txt_field">
                  <input type="text" name="email" required>
                  <span></span>
                  <label>Username</label>
              </div>
              <div class="txt_field">
                  <input type="password" name="passwords" required>
                  <span></span>
                  <label>Password</label>
              </div>
              <div class="pass">Forget Password?</div>
              <input name="submit" type="Submit" value="Login">
              <div class="signup_link">
              <h1>${msg}</h1>
                  Not a Member ? <a href="Adminregister.jsp">Signup</a>
              </div>
          </form>
      </div>
    </div>

</body>
</html>