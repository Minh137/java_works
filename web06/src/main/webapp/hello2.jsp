<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="helloBean" class="works.HelloBean" scope="page" />  
<jsp:setProperty property="name" name="helloBean" value="우정컴퓨터"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=helloBean.getName() %>
<jsp:getProperty property="name" name="helloBean"/>
</body>
</html>