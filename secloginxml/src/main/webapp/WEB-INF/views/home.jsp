<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<c:choose>
	<c:when test="${not empty param.logout }">
		<p>성공적으로 로그아웃 되었습니다.</p>
	</c:when>
	<c:when test="${not empty param.error }">
		<p>아이디 또는 비밀번호가 틀렸습니다.</p>
	</c:when>
</c:choose>
<p>
	<a href="${pageContext.request.contextPath }/login">로그인</a> | <a href="${pageContext.request.contextPath }/logout">로그아웃</a>
</p>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
