<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<meta charset="UTF-8">
<style>
 #join{float : left; margin-right : 30px;}
 #rollback{float : right; position : relative;}
</style>
<title>SighUp</title>
</head>
<body>
<div style="float:left; position:relative;left:50px;">
<form action = "/user.do" method = "post"> 
	
	<h5>아이디: <input class="form-control"  type="text" name = "id" ></h5>
	<h5>비밀번호: <input  class="form-control"   type="password" name = "password"></h5>
	<h5>닉네임: <input class="form-control"  type="text" name = "nickName" ></h5>
	<h5>주소: <input  class="form-control"   type="textg" name = "address"></h5>
			<input type="hidden" name="control" value ="signUp"/>
	
	<button class="btn btn-primary" id="join" type="submit">가입하기</button>
</form>
	<button class="btn btn-primary" id="rollback" onclick="rollback()" >돌아가기</button>
</div>


<script>
function rollback(){
	document.location.href='/'; 
}
</script>


</body>
</html>