package web1.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//��û���� ���� ���� utf-8 �� ���ڵ� (�ѱ� ���� ����)
	      request.setCharacterEncoding("UTF-8");
	      //������ Content-type�� ���ڵ� 
	      response.setContentType("text/html;charset=utf-8");
	      
	      ServletContext context = this.getServletContext();
	      //getInitParameter(name)
	      String userid = context.getInitParameter("userid");
	      String userpass = context.getInitParameter("userpass");
	      
	      PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		boolean ok = false;
		
		String htmlHeader = "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ " <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\">\r\n"
				+ " <style>\r\n"
				+ " .loginForm{\r\n"
				+ "    margin:30px auto;\r\n"
				+ "    width:60%;\r\n"
				+ "    border:1px solid #ddd;\r\n"
				+ "    padding:50px;\r\n"
				+ " }\r\n"
				+ " </style>\r\n"
				+ "  <script src=\"//cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js\"></script>\r\n"
				+ "  <script src=\"//cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n"
				+ "  <script src=\"//cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
				+ "</head>\r\n"
				+ "<body>";
		
		if(uname.equals(userid) && upass.equals(userpass)) {
			out.println("<p>"+ uname +"�� �ݰ����ϴ�. �α��� �Ǿ����ϴ�. </p>");
		}else {
			out.println("<p>���̵� �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�. http://localhost:8080/web1/login.html </p>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
