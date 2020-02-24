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

<%-- <c:import url="https://dic.daum.net/search.do?">
	<c:param name="q" value="당나귀"></c:param>
</c:import>
 --%>
<c:redirect url="https://dic.daum.net/search.do?">
	<c:param name="q" value="당나귀"></c:param>
</c:redirect>
${daum }


</body>
</html>