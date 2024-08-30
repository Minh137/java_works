package web02.sec01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/scget")
public class ServletContextGet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청과 응답의 인코딩을 설정
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;utf-8");
		
		// ServletContext 객체를 가져와 속성 값을 읽어옴
		ServletContext context = getServletContext();
		PrintWriter out = response.getWriter();
		
		String hero = (String) context.getAttribute("hero");
		String city = (String) context.getAttribute("city");
		
		// hero와 city 값을 클라이언트에 출력
		out.print(hero + ":" + city);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST 요청도 GET 메소드로 처리
		doGet(request, response);
	}

}
