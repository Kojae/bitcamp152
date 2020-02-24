<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<title>userPage</title>
</head>
<body>

<h3> ------------- 유저 목록 --------------</h3>

<c:forEach var="users" items="${users}" varStatus="status">
	닉네임 :   <c:out value="${users.user.nickName}" />, &nbsp;&nbsp;&nbsp;
	주소 :     <c:out value="${users.user.address}" />, &nbsp;&nbsp;&nbsp;
	장바구니  :  <c:out value="${users.user.cartCount}" />, &nbsp;&nbsp;&nbsp;
	<p/><p/><p/><p/><p/><p/>
</c:forEach>
<button class="btn btn-primary" type ="button" onclick="goWelcome()">돌아가기</button>
</body>
<script>
function goWelcome(){
	document.location.href='/welcome'; 
}
</script>
</html>