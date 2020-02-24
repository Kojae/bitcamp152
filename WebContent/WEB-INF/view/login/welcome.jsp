<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style>
	.moveThat{position: relative;top:100px;text-align: center;}
</style>
<title>Welcome Page</title>
</head>
<body>
	<div class="container">
		<div class="moveThat">
		<h3> Welcome Page</h3>
		<h3> 웰컴론이셈 </h3>
			<p/><p/><p/><p/><p/><p/>
		   <h4>${member.nickName}님 환영합니다</h4>
		    <h4>장바구니엔 ${member.cartCount }개가 담겨있습니다.</h4>
			<button class="btn btn-primary" id="updateUser" onclick="updateUser()" >정보수정</button>
			<button class="btn btn-primary" id="selectUser" onclick="selectUser()" >유저목록</button>
			<button class="btn btn-primary" id="login" onclick="logOut()" >로그아웃</button>
			<button class="btn btn-primary" id="deleteUser" onclick="deleteUser()" >회원 탈퇴</button>
			<script>
				function updateUser(){
					document.location.href = '/updateUser';
				}
				function selectUser(){
					document.location.href = '/user.do?control=selectUser';
				}
				function logOut() {
					var logoutForm = document.createElement("form");
					document.body.appendChild(logoutForm);
					logoutForm.setAttribute("action","/logout.do");
					logoutForm.setAttribute("method","post");
					logoutForm.submit();
				}
				function deleteUser() {
					if(confirm("진짜 삭제하시겠습니까 ? ")) {
						 document.location.href = '/user.do?control=deleteUser'; 
						}
				}
			</script>
			</div>
	</div>
	
</body>



</html>