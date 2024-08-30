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
		System.out.println("서블릿이 처음 로드될 때 초기화 작업 수행");
	}
       
	public void	service(HttpServletRequest repuest, HttpServletResponse reponse) throws ServletException{
		System.out.println("service 메서드가 실행됨");
		//super.service(repuest, reponse);
	}
       
	public void destory() {
		//서블릿이 종료되기 직전에 필요한 정리 작업 수행
		System.out.println("서블릿 종료 destory()");
		super.destroy();
	}
	
	
	//GET요청 처리 메서드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("GET request");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post요청
		doGet(request, response);
	}

}
