package web1.chpt3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/act")
public class FormResult extends HttpServlet {


   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //��û���� ���� ���� utf-8 �� ���ڵ� (�ѱ� ���� ����)
      request.setCharacterEncoding("UTF-8");
      //������ Content-type�� ���ڵ� 
      response.setContentType("text/html;charset=utf-8");
      
      PrintWriter out = response.getWriter();
      out.println("<html><header></header><body>");
      out.println("<p>�̸� " + request.getParameter("username") + "</p>");
      out.println("</body></html>");
      out.close();
    }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}
