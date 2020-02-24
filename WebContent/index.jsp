<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
 <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style>
 #login{float : left; margin-right : 30px;}
 #logout{float : right; position : relative;}
</style>
<meta charset="UTF-8">
<title>home</title>
</head>
<body>
<h3>&nbsp;&nbsp;&nbsp; 방가방가</h3>
<div>
	<div style="float:left; position:relative;left:50px;">
	<form action = "/login.do" method = "post">
	<h5>아이디: <input class="form-control"  type="text" name = "id"  value="${member.id}"></h5>
	<h5>암&nbsp;&nbsp;&nbsp;호: <input  class="form-control"   type="password" name = "password"></h5>
	
	<button class="btn btn-primary"  id="login" type="submit">로그인</button>
	</form>
	<button class="btn btn-primary" id="siguUp" onclick="sighUp()">회원가입</button>
	</div>
</div>
<script >
function sighUp(){
	document.location.href='/sighUp'; 
}
</script>



</body>
</html>