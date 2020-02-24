<%@page import="javax.servlet.annotation.MultipartConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
    <%@page import="model.bean.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL Test</title>
</head>
<body>
  

<%
List<MemberBean> list = new ArrayList<MemberBean>();

list = (ArrayList<MemberBean>) request.getAttribute("members");

HashMap<String, HashMap<String, MemberBean>> map = new HashMap<String, HashMap<String, MemberBean>>();

map.put("memberMap", (HashMap<String, MemberBean>)request.getAttribute("memberMap"));
%>

<br/><br/>map  전체
<%= map.get("memberMap")  %>
<br/><br/>map  Gold
<%= map.get("memberMap").get("Gold")  %>
<br/><br/>map  silver
<%= map.get("memberMap").get("Silver") %>

<br/><br/><br/><br/><br/><br/>
list 전체 :<br/> 
<%= list %>
<br/><br/>list.get(0) : 
<%= list.get(0) %>
<br/><br/>list.get(1) :
<%= list.get(1)%>
<br/><br/>list.get(2)
<%= list.get(2) %>
<br/>
///////////////////////////////////////////////////////////////////////
<br/><br/>
${header.host }

<!--  useBean 생성     아무 의미 x-->
<jsp:useBean id="bean1" class="model.bean.MemberBean" scope="request" />
<jsp:setProperty property="*" name="bean1"/>

</body>
</html>