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
		// ��û�� ������ ���ڵ��� ����
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;utf-8");
		
		// ServletContext ��ü�� ������ �Ӽ� ���� �о��
		ServletContext context = getServletContext();
		PrintWriter out = response.getWriter();
		
		String hero = (String) context.getAttribute("hero");
		String city = (String) context.getAttribute("city");
		
		// hero�� city ���� Ŭ���̾�Ʈ�� ���
		out.print(hero + ":" + city);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST ��û�� GET �޼ҵ�� ó��
		doGet(request, response);
	}

}