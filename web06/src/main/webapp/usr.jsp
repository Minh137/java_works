<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	//폼 데이터 받기
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	String postcode = request.getParameter("postcode");
	String address = request.getParameter("address");
	String detailAddress = request.getParameter("detailAddress");
	String extraAddress = request.getParameter("extraAddress");
	String[] hob = request.getParameterValues("hobbies");
	
	int nAge = 0;
	if(age != null && !age.trim().isEmpty()){
		try{
			nAge = Integer.parseInt(age);
		}catch(NumberFormatException e){
			nAge = 0;
		}
	}else{
		nAge = 0;
	}
	String addr = "["+postcode+"]" + address + detailAddress + "(" + extraAddress + ")";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>이름 : <%=name %></p>
	<p>나이 : <%=nAge %></p>
	<p>주소 : <%=addr %></p>
	<p>취미 : 
	<% if (hob != null) {
            for (String hobby : hob) {
                out.println("<span>" + hobby + " </span>");
            }
        } else {
            out.println("<span>선택한 취미가 없습니다.</span>");
        }
    %>
    </p>
</body>
</html>