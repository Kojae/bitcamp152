<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Login UI</title>
</head>
<body>
<h3> 어서오라굿 </h3>

<form action = "/login.do" method = "post"> 
	<div style="float:left; position:relative;left:50px;">
	<h5>아이디: <input class="form-control"  type="text" name = "id" value="${member.id}"></h5>
	<h5>암&nbsp;&nbsp;&nbsp;호: <input  class="form-control"   type="password" name = "password"></h5>
	
	<button class="btn btn-primary" id="login" type="submit">로그인</button>
	</div>
</form>



</body>
</html>