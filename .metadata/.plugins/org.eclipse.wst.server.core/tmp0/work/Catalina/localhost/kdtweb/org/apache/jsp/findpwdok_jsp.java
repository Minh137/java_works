/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2024-08-30 06:56:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class findpwdok_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/include/footer.jsp", Long.valueOf(1724823152000L));
    _jspx_dependants.put("/include/header.jsp", Long.valueOf(1724997463083L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("    ");

    	String sessionUserid =(String) session.getAttribute("userid");
    
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>관리자모드</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fonts.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/remixicon.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"js/photo-gallery.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/pycs-layout.jquery.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("    <script src=\"js/script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container position-relative pl-300\">\r\n");
      out.write("       <header class=\"position-absolute\">\r\n");
      out.write("          <div class=\"logo\"><a href=\"#\"><img src=\"images/logo.png\" alt=\"kdt community\"></a></div>\r\n");
      out.write("          ");

          	if(sessionUserid == null){
          
      out.write("\r\n");
      out.write("          <form id=\"loginform\" class=\"login\" method=\"post\" action=\"loginok\">\r\n");
      out.write("             <input type=\"text\" class=\"form-control\" name=\"userid\" id=\"userid\" placeholder=\"아이디\">\r\n");
      out.write("             <input type=\"password\" class=\"form-control\" name=\"userpass\" id=\"userpass\" placeholder=\"비밀번호\">\r\n");
      out.write("             <div class=\"text-right\"><label><input type=\"checkbox\" name=\"rid\" id=\"rid\" value=\"ok\" /> 아이디 저장</label></label></div>\r\n");
      out.write("             <button type=\"submit\" class=\"btn btn-success btn-block\">로 그 인</button>\r\n");
      out.write("          </form>\r\n");
      out.write("          <div class=\"d-flex justify-content-between px-2 mb-5\">\r\n");
      out.write("            <a href=\"findidpass.jsp\">아이디/비밀번호 찾기</a>\r\n");
      out.write("            <a href=\"register.jsp\">회원가입</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          ");

          }else{
          
      out.write("\r\n");
      out.write("          <div id=\"loginform\" class=\"login\">\r\n");
      out.write("          	<h5 class=\"text-center\">\r\n");
      out.write("          		");
      out.print(sessionUserid );
      out.write("님 로그인\r\n");
      out.write("          	</h5>\r\n");
      out.write("          	<p class=\"text-center\">\r\n");
      out.write("          	 	<a href=\"logout.jsp\">로그아웃</a>\r\n");
      out.write("          	</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          ");
} 
      out.write("\r\n");
      out.write("          <div>이미지배너</div>\r\n");
      out.write("       </header>");
      out.write('\r');
      out.write('\n');
      kdtweb.dao.MySqlConnect connBean = null;
      connBean = (kdtweb.dao.MySqlConnect) _jspx_page_context.getAttribute("connBean", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (connBean == null){
        connBean = new kdtweb.dao.MySqlConnect();
        _jspx_page_context.setAttribute("connBean", connBean, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');

	Connection conn = null;
	PreparedStatement pstmt =null;
	ResultSet res = null;
	
	String email = request.getParameter("useremail");
	String userid = request.getParameter("userid");
	
	if( ( email !=null && !email.isEmpty()) && ( userid !=null && !userid.isEmpty()) ){
	
		try{
			conn = connBean.getConn();
			String sql = "select id from members where useremail=? and userid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, userid);
			
			res = pstmt.executeQuery();
			
			if(res.next()){
				//이메일과 아이디가 일치해 페이지 출력이 가능함
				/*
					1. 이메일 과 아이디가 일치하는 id 번호를 가져옴
					2. 랜덤으로 6자리 정도의 비밀번호를 만듬
					3. id를 이용해 db를 업데이트 함.
					4. 새로만든 비밀번호를 이메일이나 카카오톡 메시지로 알려줌
				*/
				int id =res.getInt("id");
				String newPass ="";
				String chars = "ABCDEFGHIJKLMNOPQRSTUWZabcdefghijklmnopqrstuwz0123456789";
				for(int i=0;i<7;i++){
					newPass += chars.charAt((int)(Math.random()*chars.length()));
				}
				sql = "Update members SET userpass = ?  WHERE id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, newPass);
				pstmt.setInt(2, id);
				
				int uc = pstmt.executeUpdate();
				//이메일 전송
				String html ="<div class=\"row\">\r\n"
						+ "  <div class=\"col-12\">\r\n"
						+ "     <div class=\"bg-white rg findidpass\">\r\n"
						+ "       <h1 class=\"text-center py-5\">아이디 찾기</h1>\r\n"
						+ " \r\n"
						+ "       \r\n"
						+ "       <div id=\"findidform\">\r\n"
						+ "          <ul class=\"registerul py-5\">\r\n"
						+ "             <li class=\"text-center py-5\">\r\n"
						+ "                 aaa 님의 비밀번호는 <strong>"+newPass+"</strong>입니다.\r\n"
						+ "             </li>    \r\n"
						+ "          </ul>\r\n"
						+ "       </form>\r\n"
						+ "       \r\n"
						+ "      </div>\r\n"
						+ "     </div>\r\n"
						+ "  </div>\r\n"
						+ "</div>\r\n"
						+ "</div>";
					out.print(html);
			}else{
				String alert = "<script>alert('이메일 또는 아이디가 일치하지 않아요');location.href='findidpass.jsp'</script>";
				out.print(alert);
			}
			
		}catch(SQLException | ClassNotFoundException e){
			out.println("접속에러 : "+ e.getMessage());
		}finally{
			if(res != null) try {res.close();}catch(SQLException e) {}
			if(pstmt != null) try {pstmt.close();}catch(SQLException e) {}
			if(conn != null) try {conn.close();}catch(SQLException e) {}
		}
	
	}else{
	
      out.write("\r\n");
      out.write("			<script>\r\n");
      out.write("				alert('");
      out.print(email );
      out.write("은 등록되어 있지 않았습니다.');\r\n");
      out.write("				location.href=\"findidpass.jsp\";\r\n");
      out.write("			</script>\r\n");
      out.write("	");
 
	}
 
      out.write("\r\n");
      out.write(" <!--  \r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("  <div class=\"col-12\">\r\n");
      out.write("     <div class=\"bg-white rg findidpass\">\r\n");
      out.write("       <h1 class=\"text-center py-5\">아이디 찾기</h1>\r\n");
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("       <div id=\"findidform\">\r\n");
      out.write("          <ul class=\"registerul py-5\">\r\n");
      out.write("             <li class=\"text-center py-5\">\r\n");
      out.write("                 aaa 님의 아이디는 000입니다.\r\n");
      out.write("             </li>    \r\n");
      out.write("          </ul>\r\n");
      out.write("       </form>\r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("     </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("       <footer>\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("             <div class=\"row\">\r\n");
      out.write("                <h4 class=\"text-center\">Copyright</h4>\r\n");
      out.write("             </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </footer>\r\n");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
