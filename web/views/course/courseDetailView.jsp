<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="course.model.vo.Course" %>
<%
	Course course = (Course)request.getAttribute("course");
	int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>감성수학</title>

<!-- css -->
	<link href="/math/resources/assets/css/material-dashboard.css" rel="stylesheet" />
  <link href="/math/resources/assets/css/reset.css" rel="stylesheet" />
  <link href="/math/resources/assets/css/course/courseDetailView.css" rel="stylesheet" />
  
<script type="text/javascript">
	function courseUpdate(){
		location.href="/math/cupview?no=" + <%=course.getCourseNo()%>;
	}
	
	function courseDelete(){
		if(confirm("정말 삭제하시겠습니까?") == true){
			location.href="/math/cdelete?no="+<%=course.getCourseNo()%>;
		}else{
			return;
		}
	}
	
	function courseList(){
		location.href="/math/clist?page="+<%=currentPage%>;
	}
	
	window.onload = function(){
		$(document).bind("contextmenu",function(){   return false;}); //우클릭방지
		$(document).bind('selectstart',function() {return false;}); //선택방지
		$(document).bind('dragstart',function(){return false;}); //드래그방지	
	}
</script>
</head>
<body>
<%@ include file="../common/Adminheader.jsp" %>
<div class="content">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-12">
              <div class="card">
                <div class="card-header card-header-primary">
                  <h4 class="card-title ">강의</h4>
                  <p class="card-category"> <%=course.getCourseNo() %>번글 상세페이지 </p>
                </div>
                <div class="card-body">
                  <div class="table-responsive">
                    <table class="table table-striped table-hover">
                    <tr></tr>
	<tr>
		<th>제목</th>
		<td><%=course.getCourseTitle() %></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><%=course.getCourseContent() %></td>
	</tr>
</table>
<div align="center" id="d1">
<button onclick="courseUpdate();" class="btn btn-default btn-sm">수정하기</button>
<button onclick="courseDelete();" class="btn btn-default btn-sm">삭제하기</button>
<button onclick="courseList();" class="btn btn-default btn-sm">목록으로가기</button>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
<%@ include file="../common/footer.jsp" %>
<script src="/math/resources/assets/js/core/jquery.min.js"></script>
  <script src="/math/resources/assets/js/core/popper.min.js"></script>
  <script src="/math/resources/assets/js/core/bootstrap-material-design.min.js"></script>
  <script src="/math/resources/assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js"></script>
  <!-- Library for adding dinamically elements -->
  <script src="/math/resources/assets/js/plugins/arrive.min.js"></script>
  <!-- Chartist JS -->
  <script src="/math/resources/assets/js/plugins/chartist.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="/math/resources/assets/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="/math/resources/assets/js/material-dashboard.js?v=2.1.1" type="text/javascript"></script>
  <!-- Material Dashboard DEMO methods, don't include it in your project! -->
  <script src="/math/resources/assets/demo/demo.js"></script>
</body>
</html>