package web;

import jjv.jav;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sa")
public class ServletAA extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//User객체 생성
		jav user = new jav();
		user.setName("John Doe");
		user.setAge(30);
		user.setAddress("gimpo city");
		
		request.setAttribute("user", user);
		
		RequestDispatcher dis = request.getRequestDispatcher("/sb");
		dis.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
