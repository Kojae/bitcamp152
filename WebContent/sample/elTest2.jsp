<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL Test</title>
</head>
<body>
<h3> el test.jsp</h3>	<br>
값이 왔나욤 bean1 : ${bean1} <br>
값이 왔나욤 bean2 : ${bean2}	<br>
값이 왔나욤 bean3 : ${bean3}	<br><br><br>

bean1 nickName : ${bean1.nickName}	<br>
bean1 password : ${bean1.password}	<br>
bean1 pwform : ${bean1.pwForm}	<br>
bean1 cartCount : ${bean1.cartCount }<br>

<jsp:useBean id="bean1" class="model.bean.MemberBean" scope="request" />
<jsp:setProperty property="*" name="bean1"/>
<br> useBean - bean 1:  <jsp:getProperty property="nickName" name="bean1"/>
<br>
///////////////////////////////////////////////////////////////////////
<br> list : ${members}
<br> list : ${members[0]}
<br> list : ${members[0].nickName}
<br>
////////////////////////////////////////////////////////////////////
<br><br> map전체 : ${memberMap}
<br><br> map Gold  : ${memberMap.Gold}
<br><br> map Gold NickName: ${memberMap.Gold.nickName }
<br> map Silver NickName : ${memberMap.Silver.nickName }

</body>
</html>