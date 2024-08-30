package web04.sec01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/rnet")
public class ReqNetwork extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		out.println("프로토콜 : "+ request.getScheme()+"<br>");
		out.println("프로토콜과 버전" + request.getProtocol()+"<br>");
		out.println("클라이언트IP : " + request.getRemoteAddr()+"<br>");
		out.println("서버의IP : " + request.getLocalAddr()+"<br>");
		out.println("서버의 이름 : " + request.getServerName()+"<br>");
		out.println("서버의 port : " + request.getServerPort()+"<br>");
		out.println("요청방식 : " + request.getMethod()+"<br>");
		out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		out.close();
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
