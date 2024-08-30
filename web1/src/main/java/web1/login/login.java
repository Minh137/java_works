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
		
		//요청으로 받은 값을 utf-8 로 인코딩 (한글 깨짐 방지)
	      request.setCharacterEncoding("UTF-8");
	      //응답의 Content-type의 인코딩 
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
			out.println("<p>"+ uname +"님 반갑습니다. 로그인 되었습니다. </p>");
		}else {
			out.println("<p>아이디 또는 비밀번호가 틀렸습니다. http://localhost:8080/web1/login.html </p>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
