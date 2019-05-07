/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-04-09 03:22:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.faq;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import faq.model.vo.Faq;
import admin.model.vo.Admin;

public final class faqUpdateView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/faq/../common/footer.jsp", Long.valueOf(1554369093895L));
    _jspx_dependants.put("/views/faq/../common/Adminheader.jsp", Long.valueOf(1554387633288L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("admin.model.vo.Admin");
    _jspx_imports_classes.add("faq.model.vo.Faq");
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

	Faq faq = (Faq)request.getAttribute("faq");
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" name=\"viewport\" />\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("  <!--     Fonts and icons     -->\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\r\n");
      out.write("  <!-- Material Kit CSS -->\r\n");
      out.write("  <link href=\"/math/resources/assets/css/material-dashboard.css?v=2.1.1\" rel=\"stylesheet\" />\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Jua\" rel=\"stylesheet\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>감성수학</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/math/SE2/js/HuskyEZCreator.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/math/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var oEditors = [];\r\n");
      out.write("$(function(){\r\n");
      out.write("      nhn.husky.EZCreator.createInIFrame({\r\n");
      out.write("          oAppRef: oEditors,\r\n");
      out.write("          elPlaceHolder: \"con1\", //textarea에서 지정한 id와 일치해야 합니다. \r\n");
      out.write("          //SmartEditor2Skin.html 파일이 존재하는 경로\r\n");
      out.write("          sSkinURI: \"/math/SE2/SmartEditor2Skin.html\",  \r\n");
      out.write("          htParams : {\r\n");
      out.write("              // 툴바 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("              bUseToolbar : true,             \r\n");
      out.write("              // 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("              bUseVerticalResizer : true,     \r\n");
      out.write("              // 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("              bUseModeChanger : true,      \r\n");
      out.write("              bSkipXssFilter : true,\r\n");
      out.write("              fOnBeforeUnload : function(){\r\n");
      out.write("                   \r\n");
      out.write("              }\r\n");
      out.write("          }, \r\n");
      out.write("          fOnAppLoad : function(){\r\n");
      out.write("              //기존 저장된 내용의 text 내용을 에디터상에 뿌려주고자 할때 사용\r\n");
      out.write("              oEditors.getById[\"con1\"].exec(\"PASTE_HTML\",[\"\"]);\r\n");
      out.write("          },\r\n");
      out.write("          fCreator: \"createSEditor2\"\r\n");
      out.write("      });\r\n");
      out.write("      \r\n");
      out.write("      //저장버튼 클릭시 form 전송\r\n");
      out.write("      $(\"#save\").click(function(){\r\n");
      out.write("          oEditors.getById[\"con1\"].exec(\"UPDATE_CONTENTS_FIELD\", []);\r\n");
      out.write("          var title = $(\"#title\").val();\r\n");
      out.write("          var con1 = $(\"#con1\").val();\r\n");
      out.write("          \r\n");
      out.write("          if(title == \"\" || title == null || title == \"&nbsp;\" || title == \"<p>&nbsp;</p>\" || title == \"<br>\"){\r\n");
      out.write("    \t\t  alert(\"제목을 입력해주세요.\");\r\n");
      out.write("    \t\t  $(\"#title\").focus();\r\n");
      out.write("    \t\t  return false;\r\n");
      out.write("    \t  }else if(con1 == \"\" || con1 == null || con1 == \"&nbsp;\" || con1 == \"<p>&nbsp;</p>\" || con1 == \"<br>\"){\r\n");
      out.write("    \t\t  alert(\"내용을 입력해주세요.\");\r\n");
      out.write("    \t\t  oEditors.getById[\"con1\"].exec(\"FOCUS\");\r\n");
      out.write("    \t\t  return false;\r\n");
      out.write("    \t  }\r\n");
      out.write("          \r\n");
      out.write("          $(\"#nform\").submit();\r\n");
      out.write("      });\r\n");
      out.write("      document.addEventListener(\"keydown\", function(event) {\r\n");
      out.write("  \t\tif (event.keyCode === 13) {\r\n");
      out.write("  \t\t\tevent.preventDefault();\r\n");
      out.write("  \t\t\t}\r\n");
      out.write("  \t\t}, true);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function faqList(){\r\n");
      out.write("\tlocation.href=\"/math/fslist?page=\"+");
      out.print(currentPage);
      out.write(";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("#d1{\r\n");
      out.write("\tfont-family: 'Jua', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
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
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
	String admin = (String)session.getAttribute("admin");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>adminheader</title>\r\n");
      out.write(" <meta charset=\"utf-8\">\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" name=\"viewport\" />\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("  <!--     Fonts and icons     -->\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\r\n");
      out.write("  <!-- Material Kit CSS -->\r\n");
      out.write("  <link href=\"/math/resources/assets/css/material-dashboard.css?v=2.1.1\" rel=\"stylesheet\" />\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Black+Han+Sans\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Do+Hyeon\" rel=\"stylesheet\">\r\n");
      out.write("  <script type=\"text/javascript\" src=\"/math/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function logout() {\r\n");
      out.write("\t\r\n");
      out.write("\tif(confirm(\"로그아웃 하시겠습니다.\")){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\tlocation.href=\"/math/alogout\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"wrapper \">\r\n");
      out.write("    <div class=\"sidebar\" data-color=\"purple\" data-background-color=\"white\">\r\n");
      out.write("      <!--\r\n");
      out.write("      Tip 1: You can change the color of the sidebar using: data-color=\"purple | azure | green | orange | danger\"\r\n");
      out.write("\r\n");
      out.write("      Tip 2: you can also add an image using data-image tag\r\n");
      out.write("  -->\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("        <a href=\"#\" class=\"simple-text logo-normal\" style=\"font-family: Black Han Sans;\">\r\n");
      out.write("          감성수학\r\n");
      out.write("        </a>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"sidebar-wrapper\">\r\n");
      out.write("        <ul class=\"nav\">\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/math/nslist\" style=\"font-family: Black Han Sans;\">\r\n");
      out.write("              <i class=\"material-icons\">dashboard</i>\r\n");
      out.write("              <p>공지사항</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("           <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/math/fslist\" style=\"font-family: Black Han Sans;\">\r\n");
      out.write("              <i class=\"material-icons\">description</i>\r\n");
      out.write("              <p>FAQ</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("           <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/math/qslist\" style=\"font-family: Black Han Sans;\">\r\n");
      out.write("              <i class=\"material-icons\">toc</i>\r\n");
      out.write("              <p>QnA</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/math/plist\" style=\"font-family: Black Han Sans;\">\r\n");
      out.write("              <i class=\"material-icons\">style</i>\r\n");
      out.write("              <p>팝업관리</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("           <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/math/views/question/adminQuestionPrint.jsp\" style=\"font-family: Black Han Sans;\">\r\n");
      out.write("              <i class=\"material-icons\">import_contacts</i>\r\n");
      out.write("              <p>문제관리</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("           <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/math/clist\" style=\"font-family: Black Han Sans;\">\r\n");
      out.write("              <i class=\"material-icons\">ondemand_video</i>\r\n");
      out.write("              <p>강의관리</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("           <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/math/mmanager\" style=\"font-family: Black Han Sans;\">\r\n");
      out.write("              <i class=\"material-icons\">people</i>\r\n");
      out.write("              <p>회원관리</p>\r\n");
      out.write("            </a>\r\n");
      out.write("            </li>\r\n");
      out.write("          <!-- your sidebar here -->\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main-panel\">\r\n");
      out.write("      <!-- Navbar -->\r\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top \">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <div class=\"navbar-wrapper\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\" style=\"font-family: Black Han Sans;\">Admin</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"navbar-toggler-icon icon-bar\"></span>\r\n");
      out.write("            <span class=\"navbar-toggler-icon icon-bar\"></span>\r\n");
      out.write("            <span class=\"navbar-toggler-icon icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          ");
if(admin!=null){ 
      out.write("\r\n");
      out.write("          <div class=\"collapse navbar-collapse justify-content-end\">\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" onclick=\"logout();\" style=\"font-family: Black Han Sans; cursor:pointer;\">\r\n");
      out.write("                  <i class=\"material-icons\">power_settings_new</i> logout\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- your navbar here -->\r\n");
      out.write("            </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
}else{ 
      out.write("\r\n");
      out.write("                      <div class=\"collapse navbar-collapse justify-content-end\">\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("              <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"/math/admin.jsp\" style=\"font-family: Black Han Sans; cursor:pointer;\">\r\n");
      out.write("                  <i class=\"material-icons\">power_settings_new</i> login\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <!-- your navbar here -->\r\n");
      out.write("            </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("              <div class=\"card\">\r\n");
      out.write("                <div class=\"card-header card-header-primary\">\r\n");
      out.write("                  <h4 class=\"card-title \">FAQ 글쓰기</h4>\r\n");
      out.write("                  <p class=\"card-category\"> ");
      out.print(faq.getFaqNo() );
      out.write("번 수정페이지</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                  <div class=\"table-responsive\">\r\n");
      out.write("<form id=\"nform\" action=\"/math/fupdate\" method=\"post\" >\r\n");
      out.write("<input type=\"hidden\" name=\"no\" value=\"");
      out.print(faq.getFaqNo());
      out.write("\">\r\n");
      out.write("<input  type=\"hidden\" name=\"writer\" value=\"");
      out.print(faq.getAdminId() );
      out.write("\">\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("<tr>\r\n");
      out.write("</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>제목</th>\r\n");
      out.write("\t\t<td><input type=\"text\"  id=\"title\" name=\"title\"  value=\"");
      out.print(faq.getQuestionContent() );
      out.write("\" class=\"form-control\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>내용</th>\r\n");
      out.write("\t\t<td><textarea row=\"10\" cols=\"30\" id=\"con1\" name=\"content\" style=\"width:100%; height: 350px;\">");
      out.print(faq.getAnswerContent() );
      out.write("</textarea></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div align=\"center\" id=\"d1\">\r\n");
      out.write("<input type=\"button\" id=\"save\" value=\"수정하기\" class=\"btn btn-default btn-sm\">\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" name=\"viewport\" />\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("  <!--     Fonts and icons     -->\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\r\n");
      out.write("  <!-- Material Kit CSS -->\r\n");
      out.write("  <link href=\"/math/resources/assets/css/material-dashboard.css?v=2.1.1\" rel=\"stylesheet\" />\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Jua\" rel=\"stylesheet\">\r\n");
      out.write("    <title>감성수학</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\tfooter{\r\n");
      out.write("\t\tfont-family: 'Jua', sans-serif;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("      <footer class=\"footer\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <nav class=\"float-left\">\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                  감성수학\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </nav>\r\n");
      out.write("          <div class=\"copyright float-right\">\r\n");
      out.write("            &copy;\r\n");
      out.write("            <script>\r\n");
      out.write("              document.write(new Date().getFullYear())\r\n");
      out.write("            </script>, made with <i class=\"material-icons\">favorite</i> by\r\n");
      out.write("            <a href=\"#\" target=\"_blank\">감성수학</a> for a better web.\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- your footer here -->\r\n");
      out.write("        </div>\r\n");
      out.write("      </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"/math/resources/assets/js/core/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"/math/resources/assets/js/core/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"/math/resources/assets/js/core/bootstrap-material-design.min.js\"></script>\r\n");
      out.write("  <script src=\"/math/resources/assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\r\n");
      out.write("  <!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->\r\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js\"></script>\r\n");
      out.write("  <!-- Library for adding dinamically elements -->\r\n");
      out.write("  <script src=\"/math/resources/assets/js/plugins/arrive.min.js\"></script>\r\n");
      out.write("  <!-- Chartist JS -->\r\n");
      out.write("  <script src=\"/math/resources/assets/js/plugins/chartist.min.js\"></script>\r\n");
      out.write("  <!--  Notifications Plugin    -->\r\n");
      out.write("  <script src=\"/math/resources/assets/js/plugins/bootstrap-notify.js\"></script>\r\n");
      out.write("  <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->\r\n");
      out.write("  <script src=\"/math/resources/assets/js/material-dashboard.js?v=2.1.1\" type=\"text/javascript\"></script>\r\n");
      out.write("  <!-- Material Dashboard DEMO methods, don't include it in your project! -->\r\n");
      out.write("  <script src=\"/math/resources/assets/demo/demo.js\"></script>\r\n");
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
