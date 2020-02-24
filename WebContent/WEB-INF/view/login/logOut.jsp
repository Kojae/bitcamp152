<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout UI</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
<h3> success Logout</h3>
<h3> 너는 로그아웃했다 ! </h3>
<button class="btn btn-primary" onclick="submit()"  >로그인</button>
<script>
function submit(){
	document.location.href='/'; 
}
</script>

</body>
</html>