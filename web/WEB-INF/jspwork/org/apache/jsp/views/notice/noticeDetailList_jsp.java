/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-03-14 16:13:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import notice.model.vo.Notice;

public final class noticeDetailList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/notice/../common/Adminheader.jsp", Long.valueOf(1552578472112L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("notice.model.vo.Notice");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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

      out.write("\r\n");
      out.write("    \r\n");

	Notice notice = (Notice)request.getAttribute("notice");

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>감성수학 관리자 상세보기창</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("window.onpageshow = function(event) {\r\n");
      out.write("    if (event.persisted) {\r\n");
      out.write("        document.location.reload();\r\n");
      out.write("    }\r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
 String userId = (String)session.getAttribute("userId"); 
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>감성수학</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(\".hover\").mouseleave(\r\n");
      out.write("        function () {\r\n");
      out.write("          $(this).removeClass(\"hover\");\r\n");
      out.write("        }\r\n");
      out.write("      );\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("@import url(https://fonts.googleapis.com/css?family=Work+Sans);\r\n");
      out.write(".snip1485 {\r\n");
      out.write("  font-family: 'Work Sans', Arial, sans-serif;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("  font-weight: 400;\r\n");
      out.write("}\r\n");
      out.write(".snip1485 *,\r\n");
      out.write(".snip1485 *:after {\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  -webkit-transition: all 0.2s linear;\r\n");
      out.write("  transition: all 0.2s linear;\r\n");
      out.write("}\r\n");
      out.write(".snip1485 li {\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  list-style: outside none none;\r\n");
      out.write("  margin: 0.5em 0.6em;\r\n");
      out.write("  -webkit-perspective: 50em;\r\n");
      out.write("  perspective: 50em;\r\n");
      out.write("}\r\n");
      out.write(".snip1485 a {\r\n");
      out.write("  backface-visibility: hidden;\r\n");
      out.write("  color: #ffffff;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  line-height: 2.2em;\r\n");
      out.write("  padding: 0 1.4em;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  -webkit-transform-style: preserve-3d;\r\n");
      out.write("  transform-style: preserve-3d;\r\n");
      out.write("  background-color: #667273;\r\n");
      out.write("  -webkit-transform-origin: 50% 50%;\r\n");
      out.write("  -ms-transform-origin: 50% 50%;\r\n");
      out.write("  transform-origin: 50% 50%;\r\n");
      out.write("}\r\n");
      out.write(".snip1485 a:after {\r\n");
      out.write("  background-color: #5c122e;\r\n");
      out.write("  color: transparent;\r\n");
      out.write("  content: attr(data-hover);\r\n");
      out.write("  bottom: 100%;\r\n");
      out.write("  line-height: 2.2em;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  -webkit-transform: translateY(0%) rotateX(90deg);\r\n");
      out.write("  transform: translateY(0%) rotateX(90deg);\r\n");
      out.write("  -webkit-transform-origin: 50% 100%;\r\n");
      out.write("  -ms-transform-origin: 50% 100%;\r\n");
      out.write("  transform-origin: 50% 100%;\r\n");
      out.write("}\r\n");
      out.write(".snip1485 li:hover a,\r\n");
      out.write(".snip1485 li.current a {\r\n");
      out.write("  -webkit-transform: translateY(50%) rotateX(-90deg);\r\n");
      out.write("  transform: translateY(50%) rotateX(-90deg);\r\n");
      out.write("  background-color: #363c3d;\r\n");
      out.write("  color: transparent;\r\n");
      out.write("}\r\n");
      out.write(".snip1485 li:hover a:after,\r\n");
      out.write(".snip1485 li.current a:after {\r\n");
      out.write("  background-color: #b12358;\r\n");
      out.write("  color: #ffffff;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".box{\r\n");
      out.write("   width:5px;\r\n");
      out.write("   height:5px;\r\n");
      out.write("   float:left;\r\n");
      out.write("   z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<ul class=\"snip1485\">\r\n");
      out.write("  <div class=\"box\" >\r\n");
      out.write("  </div>\r\n");
      out.write("  <li class=\"current\"><a href=\"#\" data-hover=\"Home\">감성수학</a></li>\r\n");
      out.write("  <li><a href=\"/math/nlist?page=1\"  data-hover=\"Notice\">공지사항</a></li>\r\n");
      out.write("  <li><a href=\"#\" data-hover=\"FAQ\">FAQ</a></li>\r\n");
      out.write("  <li><a href=\"#\" data-hover=\"QnA\">QnA</a></li>\r\n");
      out.write("  <li><a href=\"#\" data-hover=\"Matter\">문제</a></li>\r\n");
      out.write("  <li><a href=\"#\" data-hover=\"My Page\">마이페이지</a></li>\r\n");
      out.write("  <li><a href=\"#\" data-hover=\"logout\">로그아웃</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<h1 align=\"center\">");
      out.print(notice.getNoticeNo() );
      out.write("번 상세보기페이지</h1>\r\n");
      out.write("<form action=\"\" method=\"post\" >\r\n");
      out.write("\t<table border=\"1\" cellspacing=\"0\" width=\"600\"  height=\"200\" align=\"center\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t<td>");
      out.print(notice.getNoticeTitle() );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t<td>");
      out.print(notice.getWriterName());
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>글내용</th>\r\n");
      out.write("\t\t\t<td>");
      out.print(notice.getNoticeContent().replaceAll("\r\n", "<br>") );
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>첨부파일</th>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t");
 if(notice.getOriginalFileName() != null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href=\"/math/nfdown?ofile=");
      out.print(notice.getOriginalFileName() );
      out.write("&rfile=");
      out.print(notice.getRenameFileName());
      out.write('"');
      out.write('>');
      out.print(notice.getOriginalFileName() );
      out.write("</a>\r\n");
      out.write("\t\t\t\t");
 }else { 
      out.write("\r\n");
      out.write("\t\t\t\t\t첨부파일없음\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t<a href=\"/math/nupview?no=");
      out.print(notice.getNoticeNo() );
      out.write("\">글수정</a>\r\n");
      out.write("\t\t\t\t<a href=\"/math/ndelete?no=");
      out.print(notice.getNoticeNo());
      out.write("\">글삭제</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form> \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
