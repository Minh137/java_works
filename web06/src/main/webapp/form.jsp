<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	request.setCharacterEncoding("utf8");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="login" method="post" action="fwdFormResultTo.jsp">
	아이디 : <input type="text" name="uid"><br>
	비밀번호 : <input type="text" name="upw"><br>
	<input type="submit" value="로그인">
</form>
</body>
</html>