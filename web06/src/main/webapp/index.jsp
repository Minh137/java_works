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
	<div class="main">
		<table>
			<tr>
				<th>프로토클 정보</th>
				<td><%= request.getProtocol() %></td>
			</tr>
			<tr>
				<th>클라이언트 IP</th>
				<td><%= request.getRemoteAddr() %></td>
			</tr>
			<tr>
				<th>서버이름</th>
				<td><%= request.getServerName() %></td>
			</tr>
			<tr>
				<th>요청방식</th>
				<td></td>
			</tr>
			<tr>
				<th>URL정보</th>
				<td><%= request.getMethod() %></td>
			</tr>
			<tr>
				<th>프로토클 정보</th>
				<td><%= request.getContextPath() %></td>
			</tr>
			<tr>
				<th>프로토클 정보</th>
				<td><%= request.getServletPath() %></td>
			</tr>
		</table>
	</div>
	<form name="form" action="main.jsp" method="get">
		<input type="text" name="username" value="홍길동">
		<input type="text" value=" 전 송 " />
	</form>
	<a href="main.jsp?username=홍길동">홍길동전송</a>
	
	<%@ include file="footer.jsp" %>
</body>
</html>