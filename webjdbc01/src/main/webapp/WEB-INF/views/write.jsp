<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>write</h1>
<ul>
	<form name="form" action="write" method="post">
	<li><label>이름</label>
		<input type="text" name="name"/>
	</li>
	<li><label>이메일</label>
		<input type="text" name="email"/>
	</li>
	<button type="submit">전송</button>
	</form>
</ul>
</body>
</html>