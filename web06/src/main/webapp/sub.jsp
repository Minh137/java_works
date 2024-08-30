<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file= "header.jsp" %>
	<div class="main">서브페이지</div>
	<form name="form" action="main.jsp" method="get">
		<input type="text" name="username" value="홍길동">
		<input type="text" value=" 전 송 " />
	</form>
	<a href="main.jsp?username=홍길동">홍길동전송</a>
	
	<%@ include file="footer.jsp" %>
</body>
</html>