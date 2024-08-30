$(function(){

  // 관리자 로그인 검증
   $("#adminform").submit(function(e){  
      //입력필드
      let adminname = $("#adminname").val();
      let adminpass = $("#adminpass").val();

      if(adminname == "" || adminpass == ""){
         alert("관리자 아이디 또는 비밀번호를 입력하세요.");   
         e.preventDefault();    
      }
   });


});