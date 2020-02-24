<%@page import="model.bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL연습 #1</title>
</head>
<body>
<c:set var="id" scope="session" value="kim123"/>
<c:set var="id2" scope="session"/> 
<%-- <%
MemberBean id2 = null; 
session.setAttribute("id2", id2);
%> --%>


<%=session.getAttribute("id2") %>
<br/>${id }
<br/>${sessionScope.id }

<br/><c:out value="789+456"/>
<br/><c:out value="${789+456}"/>

<br/><c:out value="id"  default="55555"/>
<br/><c:out value="${id}"  default="55555"/>
<br/><h6>null값</h6> <c:out value="${id2}"  default="윽엑"/>

</body>
</html>