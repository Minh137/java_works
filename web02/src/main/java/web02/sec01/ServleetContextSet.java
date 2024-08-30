package web02.sec01;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/scset")
public class ServleetContextSet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청과 응답의 인코딩을 설정
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;utf-8");
		
		// ServletContext 객체를 가져와서 데이터를 설정
		ServletContext context = getServletContext();
		context.setAttribute("hero", "Lee sunsin");
		context.setAttribute("city", "gimpo-si");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST 요청도 GET 메소드로 처리
		doGet(request, response);
	}
}

