package web1.chpt2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet({ "/Life" })
public class LifeCycle extends HttpServlet {
	
	public void init() throws ServletException{
		super.init();
		System.out.println("������ ó�� �ε�� �� �ʱ�ȭ �۾� ����");
	}
       
	public void	service(HttpServletRequest repuest, HttpServletResponse reponse) throws ServletException{
		System.out.println("service �޼��尡 �����");
		//super.service(repuest, reponse);
	}
       
	public void destory() {
		//������ ����Ǳ� ������ �ʿ��� ���� �۾� ����
		System.out.println("���� ���� destory()");
		super.destroy();
	}
	
	
	//GET��û ó�� �޼���
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("GET request");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post��û
		doGet(request, response);
	}

}
