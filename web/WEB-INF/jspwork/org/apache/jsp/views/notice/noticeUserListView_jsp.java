/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-04-04 12:08:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import notice.model.vo.Notice;

public final class noticeUserListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/notice/../common/header.jsp", Long.valueOf(1554379421092L));
    _jspx_dependants.put("/views/notice/../common/ufooter.jsp", Long.valueOf(1554369102143L));
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
      out.write("    \r\n");

	ArrayList<Notice> nsList = (ArrayList<Notice>)request.getAttribute("nslist");
	int allSearchListCount = ((Integer)request.getAttribute("allSearchListCount")).intValue();
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
	int startPage = ((Integer)request.getAttribute("startPage")).intValue();
	int endPage = ((Integer)request.getAttribute("endPage")).intValue();
	int maxPage = ((Integer)request.getAttribute("maxPage")).intValue();
	String searchTitle = (String)request.getAttribute("searchTitle");
	String nOption = (String)request.getAttribute("noption");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Jua\" rel=\"stylesheet\">\r\n");
      out.write("<title>공지사항목록페이지</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/math/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
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
      out.write("          \t<h1>공지사항</h1>\r\n");
      out.write("            <h3 class=\"title text-center\">목록보기</h3>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"main main-raised\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"section text-center\">\r\n");
      out.write("<table class=\"table table-striped table-hover\">\r\n");
      out.write("\t<tr class=\"table-success\">\r\n");
      out.write("\t\t<th>글번호</th>\r\n");
      out.write("\t\t<th>제목</th>\r\n");
      out.write("\t\t<th>작성자</th>\r\n");
      out.write("\t\t<th>등록일자</th>\r\n");
      out.write("\t\t<th>조회수</th>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 for(int n = 0; n < nsList.size(); n++){ 
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>");
      out.print(nsList.get(n).getNoticeNo() );
      out.write("</td>\r\n");
      out.write("\t\t<td><a href=\"/math/nudetail?no=");
      out.print(nsList.get(n).getNoticeNo());
      out.write("&page=");
      out.print(currentPage);
      out.write('"');
      out.write('>');
      out.print(nsList.get(n).getNoticeTitle() );
      out.write("</a></td>\r\n");
      out.write("\t\t<td>");
      out.print(nsList.get(n).getWriterName() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(nsList.get(n).getNoticeDate() );
      out.write("</td>\r\n");
      out.write("\t\t<td>");
      out.print(nsList.get(n).getNoticeCount() );
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
 } 
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<nav aria-label=\"Page navigation example\">\r\n");
      out.write("<ul class=\"pagination pagination-info\" style=\"justify-content: center;\">\t\r\n");
      out.write("\t");
 if(currentPage <= 1){ 
      out.write("\r\n");
      out.write("\t<li class=\"page-item\">\r\n");
      out.write("\t\t<a class=\"page-link\"> [맨처음] </a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t");
 }else if(searchTitle != null){ 
      out.write("\r\n");
      out.write("\t<li class=\"page-item\">\r\n");
      out.write("\t\t<a href=\"/math/nuslist?page=1&title=");
      out.print(searchTitle);
      out.write("&noption=");
      out.print(nOption);
      out.write("\" class=\"page-link\">[맨처음]</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t");
 }else{ 
      out.write("\r\n");
      out.write("\t<li class=\"page-item\">\r\n");
      out.write("\t\t<a href=\"/math/nuslist?page=1\" class=\"page-link\">[맨처음]</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t");
} if((currentPage - 5) <= startPage && (endPage - 5) >= 1){ 
      out.write("\r\n");
      out.write("\t<li class=\"page-item\">\r\n");
      out.write("\t\t<a href=\"/math/nuslist?page=");
      out.print( (startPage - 5) + 4   );
      out.write("&title=");
      out.print(searchTitle);
      out.write("&noption=");
      out.print(nOption);
      out.write("\" class=\"page-link\">[이전]</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t");
 }else{
      out.write("\r\n");
      out.write("\t<li class=\"page-item\">\r\n");
      out.write("\t\t<a class=\"page-link\"> [이전] </a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t");
} for(int p = startPage; p <= endPage; p++){ 
			if(p == currentPage){
      out.write("\r\n");
      out.write("\t\t\t<li class=\"page-item\">\r\n");
      out.write("\t\t\t\t<a class=\"page-link\"> <font>");
      out.print(p);
      out.write("</font> </a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t");
}else if(searchTitle != null && nOption != null){ 
      out.write("\r\n");
      out.write("\t\t\t<li class=\"page-item\">\r\n");
      out.write("\t\t\t\t<a href=\"/math/nuslist?page=");
      out.print(p);
      out.write("&title=");
      out.print(searchTitle);
      out.write("&noption=");
      out.print(nOption);
      out.write("\" class=\"page-link\">");
      out.print(p);
      out.write("</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"page-item\">\r\n");
      out.write("\t\t\t\t<a href=\"/math/nuslist?page=");
      out.print(p);
      out.write("\" class=\"page-link\">");
      out.print(p);
      out.write("</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t");
 }} 
      out.write('\r');
      out.write('\n');
      out.write('	');
 if((startPage + 5) <= maxPage && (currentPage + 5) >= startPage){ 
      out.write("\r\n");
      out.write("\t<li class=\"page-item\">\r\n");
      out.write("\t\t<a href=\"/math/nuslist?page=");
      out.print(startPage+5);
      out.write("&title=");
      out.print(searchTitle );
      out.write("&noption=");
      out.print(nOption);
      out.write("\" class=\"page-link\">[다음]</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t");
}else{ 
      out.write("\r\n");
      out.write("\t<li class=\"page-item\">\r\n");
      out.write("\t\t<a class=\"page-link\"> [다음] </a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t");
} 
      out.write('\r');
      out.write('\n');
      out.write('	');
 if(currentPage >= maxPage){ 
      out.write("\r\n");
      out.write("\t<li class=\"page-item\">\r\n");
      out.write("\t\t<a class=\"page-link\"> [마지막] </a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t");
 }else if(searchTitle != null){ 
      out.write("\r\n");
      out.write("\t<li class=\"page-item\">\r\n");
      out.write("\t\t<a href=\"/math/nuslist?page=");
      out.print(maxPage);
      out.write("&title=");
      out.print(searchTitle);
      out.write("&noption=");
      out.print(nOption);
      out.write("\" class=\"page-link\">[마지막]</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t");
 }else{ 
      out.write("\r\n");
      out.write("\t<li class=\"page-item\">\r\n");
      out.write("\t\t<a href=\"/math/nuslist?page=");
      out.print(maxPage);
      out.write("\" class=\"page-link\">[마지막]</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<form action=\"/math/nuslist?page=1\" method=\"post\" class=\"form-inline ml-auto\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<select name=\"noption\" class=\"form-control\">\r\n");
      out.write("\t\t<option value=\"\" >선택</option>\r\n");
      out.write("\t\t<option name=\"ntitle\" value=\"ntitle\" >제목</option>\r\n");
      out.write("\t\t<option name=\"ntContent\" value=\"ntContent\">제목+내용</option>\r\n");
      out.write("\t</select>\r\n");
      out.write("\t&nbsp;\r\n");
      out.write("                    <input type=\"text\" name=\"title\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("\t<button type=\"submit\" class=\"btn btn-black btn-raised btn-fab btn-round\">\r\n");
      out.write("                    <i class=\"material-icons\">search</i>\r\n");
      out.write("                  </button>\r\n");
      out.write("                  </div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
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