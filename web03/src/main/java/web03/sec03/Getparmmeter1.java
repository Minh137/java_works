package web03.sec03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/gparam")
public class Getparmmeter1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//파라미터 추출 (파라미터 값을 추출하여 아래 태그에 입력하세요.)
		//단, 정수는 정수형으로 실수는 실수형으로 변환하여 출력하세요.
		
		int num = Integer.parseInt(request.getParameter("num"));
		String name = request.getParameter("name");
		double avg = Double.parseDouble(request.getParameter("avg"));
		
		out.println("<html><head><title>웁스</title></head><body>");
		out.println("<p> 번호 : " +num+"</p>");
		out.println("<p> 이름 : " +name+"</p>");
		out.println("<p> 평균 : " +avg+"</p>");
		out.println("</body></html>");
		out.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
