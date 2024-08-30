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
		// ��û�� ������ ���ڵ��� ����
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;utf-8");
		
		// ServletContext ��ü�� �����ͼ� �����͸� ����
		ServletContext context = getServletContext();
		context.setAttribute("hero", "Lee sunsin");
		context.setAttribute("city", "gimpo-si");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST ��û�� GET �޼ҵ�� ó��
		doGet(request, response);
	}
}

