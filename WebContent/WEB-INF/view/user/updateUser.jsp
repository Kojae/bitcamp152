<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style>
 #updateUser{float : left; margin-right : 30px;}
 #rollback{float : right; position : relative;}
</style>
<title>Update page</title>
</head>
<body>
<div class="container">
	<div class="col-md-3">
		<form action = "/user.do" method = "post">
			<h2> 회원 검증 </h2>
			<h5>아이디: <input class="form-control"  type="text" name = "id" ></h5>
			<h5>비밀번호: <input  class="form-control"   type="password" name = "password"></h5>
			<p/><p/><p/><p/><p/><p/>
			
		 	<h2> 바꾸고 싶은 정보</h2>
			<h5>닉네임:<input class="form-control"  type="text" name = "nickName" ></h5>
			<h5>주소: <input  class="form-control"   type="text" name = "address"></h5>
			
			<input type="hidden" name="control" value ="updateUser"/>
				<button class="btn btn-primary" id="updateUser" type="submit">수정하기</button>
		</form>
				<button class="btn btn-primary" id="rollback" onclick="goWelcome()" >돌아가기</button>
				<script>
				function goWelcome(){
					document.location.href='/welcome'; 
				}
				</script>
	</div>
</div>
</body>
</html>