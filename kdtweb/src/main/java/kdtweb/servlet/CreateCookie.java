package kdtweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/createcookie")
public class CreateCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	   response.setContentType("text/html;charset=utf-8");
	   PrintWriter out = response.getWriter();
	   
       //쿠키생성
	   Cookie myCookie1 = new Cookie("userid", "홍길동");	

	   //쿠키를 브라우저로 전송
	   response.addCookie(myCookie1);
	   
	   out.println("쿠키가 생성됨");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
