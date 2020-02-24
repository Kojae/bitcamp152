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

	<c:forEach var="member" items="${members}" varStatus="status">
	
	${member }
	</c:forEach>
<p/><p/><p/><p/><p/>
	<c:forEach var="member" items="${members}" varStatus="status">
		<c:choose>
			<c:when test="${member.cartCount >= 10}">
				<c:out value="골드 등급" />
				.  닉네임 : <c:out value="${member.nickName}" />
				.  cart 수는  : <c:out value="${member.cartCount}" />
				<p/>
			</c:when>
			
			<c:when test="${member.cartCount >= 5 && member.cartCount < 10}">
				<c:out value="실버 등급" />
				.  닉네임  : <c:out value="${member.nickName}" />
				.  cart 수는  : <c:out value="${member.cartCount}" />
				<p/>
			</c:when>
			<c:when test="${member.cartCount >= 1 && member.cartCount < 5}">
				<c:out value="동 등급" />
				.  닉네임  : <c:out value="${member.nickName}" />
				.  cart 수는  : <c:out value="${member.cartCount}" />
				<p/>
			</c:when>
			
			<c:when test="${empty member }">
					없는 고객쓰
					<c:out value="${member}" default="없는고객"/>
			<p/>
			</c:when>
			
			
			<c:otherwise>
				<c:out value="관심대상입니다." />
				<p/>
			</c:otherwise>

		</c:choose>
	</c:forEach>
</body>
</html>