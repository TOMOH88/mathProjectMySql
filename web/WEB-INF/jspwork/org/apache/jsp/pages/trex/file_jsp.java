/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-03-22 06:06:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.trex;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class file_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"\n");
      out.write("        \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<title>Daum에디터 - 파일 첨부</title> \n");
      out.write("<script src=\"/math/resources/js/popup.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"/math/resources/css/popup.css\" type=\"text/css\"  charset=\"utf-8\"/>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("// <![CDATA[\n");
      out.write("\t\n");
      out.write("\tfunction done() {\n");
      out.write("\t\tif (typeof(execAttach) == 'undefined') { //Virtual Function\n");
      out.write("\t        return;\n");
      out.write("\t    }\n");
      out.write("\t\t\n");
      out.write("\t\tvar _mockdata = {\n");
      out.write("\t\t\t'attachurl': 'http://cfile297.uf.daum.net/attach/207C8C1B4AA4F5DC01A644',\n");
      out.write("\t\t\t'filemime': 'image/gif',\n");
      out.write("\t\t\t'filename': 'editor_bi.gif',\n");
      out.write("\t\t\t'filesize': 640\n");
      out.write("\t\t};\n");
      out.write("\t\texecAttach(_mockdata);\n");
      out.write("\t\tcloseWindow();\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction initUploader(){\n");
      out.write("\t    var _opener = PopupUtil.getOpener();\n");
      out.write("\t    if (!_opener) {\n");
      out.write("\t        alert('잘못된 경로로 접근하셨습니다.');\n");
      out.write("\t        return;\n");
      out.write("\t    }\n");
      out.write("\t    \n");
      out.write("\t    var _attacher = getAttacher('file', _opener);\n");
      out.write("\t    registerAction(_attacher);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body onload=\"initUploader();\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<h1>파일 첨부</h1>\n");
      out.write("\t</div>\t\n");
      out.write("\t<div class=\"body\">\n");
      out.write("\t\t<dl class=\"alert\">\n");
      out.write("\t\t    <dt>파일 첨부 확인</dt>\n");
      out.write("\t\t    <dd>\n");
      out.write("\t\t    \t확인을 누르시면 임시 데이터가 파일첨부 됩니다.<br /> \n");
      out.write("\t\t\t\t인터페이스는 소스를 확인해주세요.\n");
      out.write("\t\t\t</dd>\n");
      out.write("\t\t</dl>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<p><a href=\"#\" onclick=\"closeWindow();\" title=\"닫기\" class=\"close\">닫기</a></p>\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li class=\"submit\"><a href=\"#\" onclick=\"done();\" title=\"등록\" class=\"btnlink\">등록</a> </li>\n");
      out.write("\t\t\t<li class=\"cancel\"><a href=\"#\" onclick=\"closeWindow();\" title=\"취소\" class=\"btnlink\">취소</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
