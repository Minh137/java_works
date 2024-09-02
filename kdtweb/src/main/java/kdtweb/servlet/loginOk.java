package kdtweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kdtweb.dao.KdtwebDao;


@WebServlet("/loginok")
public class LoginOk extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String userid = request.getParameter("userid");
		String userpass = request.getParameter("userpass");
		String rid = request.getParameter("rid");
		
		if(userid.equals("admin")) {
			//서블릿 콘텍스트로 검사
			ServletContext context = this.getServletContext();
			String adminPass = context.getInitParameter("userpass");
			
			if(userpass.equals(adminPass)) {
				//세션을 만들고 로그인 처리 쿠키도 만들기
				HttpSession session = request.getSession();
				session.setAttribute("userid", "admin");
				if("ok".equals(rid)) {
					Cookie userCookie = new Cookie("userid", userid);
					userCookie.setMaxAge(60*60*24*1);
					response.addCookie(userCookie);
				}
				
				response.sendRedirect("index.jsp");
				
			}else {
			   String alert = "<script>alert('아이디 또는 비밀번호가 틀렸습니다.'); location.href='index.jsp';</script>";
			   out.println(alert);
			}
			
		}else { 
			//db에서 검사
			String sql = "select * from members where userid=? and userpass=?";
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet  rs = null;
			//MySqlConnect dbcon = new MySqlConnect();
			KdtwebDao dbcon = new KdtwebDao();
			try {
				conn = dbcon.getConn();
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, userid);
				pstmt.setString(2, userpass);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					//검증성공
				    //세션 및 쿠키 생성
					HttpSession session = request.getSession();
					session.setAttribute("userid", userid);
					if("ok".equals(rid)) {
						Cookie userCookie = new Cookie("userid", userid);
						userCookie.setMaxAge(60*60*24*1);
						response.addCookie(userCookie);
					}
					
					response.sendRedirect("index.jsp");
					
				}else {
					//검증실패
					   String alert = "<script>alert('아이디 또는 비밀번호가 틀렸습니다.'); location.href='index.jsp';</script>";
					   out.println(alert);
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				if(rs != null) try {rs.close();}catch(SQLException e) {}
				if(pstmt != null) try {pstmt.close();}catch(SQLException e) {}
				if(conn != null) try {conn.close();}catch(SQLException e) {}
			}
			
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
