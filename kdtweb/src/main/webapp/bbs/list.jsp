<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<h1 class="text-center mb-5">
   게시판
</h1>
   <table class="bbslist table-hover">
      <colgroup>
        <col width="10%">
        <col width="50%">
        <col width="15%">
        <col width="15%">
        <col width="10%">
      </colgroup>
      <thead>
       <tr>
         <th>번호</th>
         <th>제목</th>
         <th>작성자</th>
         <th>날짜</th>
         <th>조회수</th> 
       </tr>
      </thead>
      <tbody>
        <c:forEach begin="0" end="14" step="1">
        <!-- 루프 -->
        <tr>
           <td>10</td>
           <td>제목이랍니다. 끌끌제목이랍니다. 끌끌제목이랍니다.  </td>
           <td>홍길동</td>
           <td>2024.10.10</td>
           <td>11</td>
        </tr>
        <!-- /루프 -->
        </c:forEach>
      </tbody>
   </table>
