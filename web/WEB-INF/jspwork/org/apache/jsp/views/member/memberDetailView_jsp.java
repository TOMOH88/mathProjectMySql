/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-04-04 12:14:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Semester;
import java.util.ArrayList;
import member.model.vo.Member;

public final class memberDetailView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/member/../common/ufooter.jsp", Long.valueOf(1554369102143L));
    _jspx_dependants.put("/views/member/../common/header.jsp", Long.valueOf(1554379421092L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
    _jspx_imports_classes.add("member.model.vo.Semester");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 Member member = (Member)request.getAttribute("member");
	ArrayList<Semester> mypermi = (ArrayList<Semester>)request.getAttribute("permission");
	ArrayList<Semester> slist = (ArrayList<Semester>)request.getAttribute("semester");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Jua\" rel=\"stylesheet\">\r\n");
      out.write("<title>감성수학</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/math/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("$(function() {\r\n");
      out.write("\t$(\"#password1\").blur(function() {\r\n");
      out.write("\t\tconsole.log(\"포커스 사라짐\");\r\n");
      out.write("\t\tvar pwd1 = $(\"#password\").val();\r\n");
      out.write("\t\tvar pwd2 = $(\"#password1\").val();\r\n");
      out.write("\t\tif(pwd1 != pwd2){\r\n");
      out.write("\t\t\talert(\"암호와 암호 확인이 일치하지 않습니다.\\n\"\r\n");
      out.write("\t\t\t\t\t+\"다시 입력하십시요.\");\r\n");
      out.write("\t\t\t$(\"#password\").select();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("function goSubmit() {\r\n");
      out.write("\tif(confirm(\"적용하시겠습니까?\")){\r\n");
      out.write("\t\tconsole.log(\"확인\");\r\n");
      out.write("\t\t$(\"#myinfoporm\").submit();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tconsole.log(\"노\");\r\n");
      out.write("\t\twindow.location.reload();\r\n");
      out.write("\t\treturn; \r\n");
      out.write("\t}\r\n");
      out.write("    \r\n");
      out.write("}; \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("table{\r\n");
      out.write("\tfont-family: 'Jua', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div > h4{\r\n");
      out.write("\tfont-family: 'Jua', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div > p{\r\n");
      out.write("\tfont-family: 'Jua', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul {\r\n");
      out.write("\tfont-family: 'Jua', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#d1{\r\n");
      out.write("\tfont-family: 'Jua', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
 String userId = (String)session.getAttribute("userId"); 
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>유저헤더</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" name=\"viewport\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("    <!--     Fonts and icons     -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\r\n");
      out.write("    <!-- Material Kit CSS -->\r\n");
      out.write("    <link href=\"/math/resources/assets/css/material-kit.css?v=2.0.5\" rel=\"stylesheet\" />\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Black+Han+Sans\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Do+Hyeon\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Jua\" rel=\"stylesheet\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/math/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function logout() {\r\n");
      out.write("\tif(confirm(\"로그아웃 하시겠습니다.\")){\r\n");
      out.write("\t\tlocation.href=\"/math/logout\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"navbar navbar-color-on-scroll navbar-transparent fixed-top navbar-expand-lg\" color-on-scroll=\"100\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"navbar-translate\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"/math/main.jsp\" style=\"font-family: Black Han Sans; font-size:30pt;\">\r\n");
      out.write("         \t<i class=\"material-icons\" >account_balance</i> 감성수학 </a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"collapse navbar-collapse\">\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"/math/nuslist\" class=\"nav-link\" style=\"font-family: 'Do Hyeon', sans-serif; font-size:20pt;\">\r\n");
      out.write("              <i class=\"material-icons\">dashboard</i> 공지사항\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"/math/fulist\" class=\"nav-link\" style=\"font-family: 'Do Hyeon', sans-serif; font-size:20pt;\">\r\n");
      out.write("              <i class=\"material-icons\">description</i> FAQ\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"/math/qmuslist?userId=");
      out.print(userId );
      out.write("\" class=\"nav-link\" style=\"font-family: 'Do Hyeon', sans-serif; font-size:20pt;\">\r\n");
      out.write("              <i class=\"material-icons\">toc</i> QnA\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\" >\r\n");
      out.write("            <a href=\"/math/views/question/questionPrint.jsp\" class=\"nav-link\" style=\"font-family: 'Do Hyeon', sans-serif; font-size:20pt;\">\r\n");
      out.write("              <i class=\"material-icons\">import_contacts</i> 문제\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"/math/culist?userId=");
      out.print(userId );
      out.write("\" class=\"nav-link\" style=\"font-family: 'Do Hyeon', sans-serif; font-size:20pt;\"> \r\n");
      out.write("              <i class=\"material-icons\">ondemand_video</i> 강의\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"/math/myinfo\" class=\"nav-link\" style=\"font-family: 'Do Hyeon', sans-serif; font-size:20pt;\">\r\n");
      out.write("              <i class=\"material-icons\">person</i> 마이페이지\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          ");
if(userId != null){ 
      out.write("\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a onclick=\"logout();\" class=\"nav-link\" style=\"font-family: 'Do Hyeon', sans-serif; font-size:20pt; cursor:pointer;\">\r\n");
      out.write("              <i class=\"material-icons\">power_settings_new</i> 로그아웃\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          ");
}else{ 
      out.write("\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"/math/views/common/login.jsp\" class=\"nav-link\" style=\"font-family: 'Do Hyeon', sans-serif; font-size:20pt; cursor:pointer;\">\r\n");
      out.write("              <i class=\"material-icons\">power_settings_new</i> 로그인\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          ");
} 
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("<script src=\"/math/resources/assets/js/core/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"/math/resources/assets/js/core/popper.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"/math/resources/assets/js/core/bootstrap-material-design.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"/math/resources/assets/js/plugins/moment.min.js\"></script>\r\n");
      out.write("<script src=\"/math/resources/assets/js/material-kit.js?v=2.0.5\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"/math/resources/assets/js/plugins/bootstrap-datetimepicker.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"/math/resources/assets/js/plugins/nouislider.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script async defer src=\"https://buttons.github.io/buttons.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"page-header header-filter\" data-parallax=\"true\" style=\"background-image: url('/math/resources/images/math-3986758_1920.jpg')\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-8 ml-auto mr-auto\">\r\n");
      out.write("          <div class=\"brand text-center\">\r\n");
      out.write("\t        ");
if(userId != null){ 
      out.write("\r\n");
      out.write("\t        <h1>마이페이지</h1>\r\n");
      out.write("            <h3 class=\"title text-center\">회원정보수정</h3>\r\n");
      out.write("\t        ");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t<h1>로그인해주세요</h1>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
if(userId != null){ 
      out.write("\r\n");
      out.write("   <div class=\"main main-raised\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"section text-center\">\r\n");
      out.write("<form action=\"/math/mupdate\" method=\"post\" id=\"myinfoporm\" onsubmit=\"false check()\">\r\n");
      out.write("<table class=\"table\"> \r\n");
      out.write("<tr><th>아이디</th><th><input type=\"text\" id=\"userid\" name=\"userid\" value=\"");
      out.print(member.getUserId());
      out.write("\" readonly=\"readonly\" class=\"form-control\"></th></tr>\r\n");
      out.write("<tr><th>비밀번호</th><th><input type=\"password\" id=\"password\" name=\"password\" value=\"");
      out.print(member.getUserPwd());
      out.write("\" class=\"form-control\"></th></tr>\r\n");
      out.write("<tr><th>비밀번호</th><th><input type=\"password\" id=\"password1\" value=\"");
      out.print(member.getUserPwd());
      out.write("\" class=\"form-control\"></th></tr>\r\n");
      out.write("<tr><th>이름</th><th><input type=\"text\" name=\"username\" value=\"");
      out.print(member.getUserName());
      out.write("\" class=\"form-control\"></th></tr>\r\n");
      out.write("<tr><th>전화번호</th><th><input type=\"text\" name=\"phone\" value=\"");
      out.print(member.getPhone());
      out.write("\" class=\"form-control\"></th></tr>\r\n");
      out.write("<tr><th>가입일</th><th><input type=\"text\" value=\"");
      out.print(member.getRegistDate());
      out.write("\" readonly=\"readonly\" class=\"form-control\"></th></tr>\r\n");
 if(member.getMemberLevel().equals("1")){ 
      out.write("\r\n");
      out.write("<tr><th>회원 등급</th><td>정회원</td></tr>\r\n");
}else{ 
      out.write("\r\n");
      out.write("<tr><th>회원 등급</th><td>준회원</td></tr>\r\n");
} 
      out.write("\r\n");
      out.write("<tr><th>문제집 권한목록</th>\r\n");
      out.write("<td>\r\n");
      out.write("<div id=\"permission\"></div>\r\n");
 if(mypermi.size()==0){ 
      out.write("\r\n");
      out.write("가지고있는 권한이 없습니다.\r\n");
}else if(slist.size()==mypermi.size()){
      out.write("\r\n");
      out.write("모든 권한을 가지고 있습니다.\r\n");
}else{ 
	for(int i =0 ; i<mypermi.size();i++){

      out.write('\r');
      out.write('\n');
      out.print(mypermi.get(i).getSemesterName() );
      out.write('\r');
      out.write('\n');
if((i+1)%4==0){
	out.print("<br>");
}}}

      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr><th colspan=\"2\"><input type=\"button\" onclick=\"goSubmit();\" value=\"변경하기\" class=\"btn btn-default btn-sm\"></th></tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Jua\" rel=\"stylesheet\">\r\n");
      out.write("<title>감성수학</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\tfooter{\r\n");
      out.write("\t\tfont-family: 'Jua', sans-serif;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write(" <footer class=\"footer footer-default\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <nav class=\"float-left\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("              감성수학\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </nav>\r\n");
      out.write("      <div class=\"copyright float-right\">\r\n");
      out.write("        &copy;\r\n");
      out.write("        <script>\r\n");
      out.write("          document.write(new Date().getFullYear())\r\n");
      out.write("        </script>, made with <i class=\"material-icons\">favorite</i> by\r\n");
      out.write("        <a href=\"#\" target=\"blank\">감성수학</a> for a better web.\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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
