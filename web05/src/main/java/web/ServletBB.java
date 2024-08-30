package web;

import jjv.jav;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sb")
public class ServletBB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		jav user = (jav) request.getAttribute("user");
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("Name :" + user.getName());
		response.getWriter().println("age :" + user.getAge());
		response.getWriter().println("address :" + user.getAddress());
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
