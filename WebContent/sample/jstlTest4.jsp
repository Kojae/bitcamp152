<%@page import="model.bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL연습 #2</title>
</head>
<body>

	<h3>session :  ${sessionMember}</h3>
	<h3>session :  ${sessionMember.id}</h3>
	<h3>session :  ${sessionMember.nickName}</h3>
   <h4>${member.nickName}님 환영합니다</h4>
    <h6>장바구니엔 ${member.cartCount }개가 담겨있습니다.</h6>


</body>
</html>