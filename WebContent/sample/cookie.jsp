<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie jsp</title>
</head>
<body>
<%-- 
<%
Cookie[] cookies = request.getCookies();
for(Cookie cookie : cookies)
	if(cookie.getName() != null){
		out.println( cookie.getName() );
		out.println( cookie.getValue() );
	}
%> --%>

//////////////////////////////<br/>
쿠키쿠키   
${cookie.userId.value}
<c:import url="${dic}">

</c:import>

</body>
</html>