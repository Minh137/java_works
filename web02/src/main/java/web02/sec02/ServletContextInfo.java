package web02.sec02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/scinfo")
public class ServletContextInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		ServletContext sc = this.getServletContext();
		
		out.println("���� ���� : "+sc.getEffectiveMajorVersion()+"."+ sc.getEffectiveMinorVersion()+"<br>");
		out.println("�������� : "+sc.getServerInfo()+"<br>");
		out.println("���ø����̼� ��� : "+sc.getContextPath()+"<br>");
		out.println("������ ������ ��� : "+sc.getRealPath("/"));
		out.println("���ø����̼� �̸� : "+sc.getServletContextName());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
