<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList,course.model.vo.Course,course.model.vo.Semester, course.model.vo.Book" %>
<%
	Course course = (Course)request.getAttribute("course");
	ArrayList<Semester> semList = (ArrayList<Semester>)request.getAttribute("semList");
	ArrayList<Book> bList = (ArrayList<Book>)request.getAttribute("bList");
	String sName = (String)request.getAttribute("sName");
	String bName = (String)request.getAttribute("bName");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>감성수학</title>

<!-- css -->
	<link href="/math/resources/assets/css/material-dashboard.css" rel="stylesheet" />
  <link href="/math/resources/assets/css/reset.css" rel="stylesheet" />
  <link href="/math/resources/assets/css/course/courseUpdateView.css" rel="stylesheet" />
  
<script type="text/javascript" src="/math/SE2/js/HuskyEZCreator.js" charset="utf-8"></script>
<script type="text/javascript" src="/math/resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
var oEditors = [];
$(function(){
      nhn.husky.EZCreator.createInIFrame({
          oAppRef: oEditors,
          elPlaceHolder: "con1", //textarea에서 지정한 id와 일치해야 합니다. 
          //SmartEditor2Skin.html 파일이 존재하는 경로
          sSkinURI: "/math/SE2/SmartEditor2Skin.html",  
          htParams : {
              // 툴바 사용 여부 (true:사용/ false:사용하지 않음)
              bUseToolbar : true,             
              // 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
              bUseVerticalResizer : true,     
              // 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
              bUseModeChanger : true,      
              bSkipXssFilter : true,
              fOnBeforeUnload : function(){
                   
              }
          }, 
          fOnAppLoad : function(){
              //기존 저장된 내용의 text 내용을 에디터상에 뿌려주고자 할때 사용
              oEditors.getById["con1"].exec("PASTE_HTML",[""]);
          },
          fCreator: "createSEditor2"
      });
      
      //저장버튼 클릭시 form 전송
      $("#save").click(function(){
    	  oEditors.getById["con1"].exec("UPDATE_CONTENTS_FIELD", []);
    	  var title = $("#title").val();
          var con1 = $("#con1").val();
          
    	  if($("#sOption").val() == ""){
        	  alert("학기선택해주세요.");
        	  return;
          }else if($("#bOption").val() == ""){
        	  alert("교재선택해주세요.");
        	  return;
          }else if(title == "" || title == null || title == "&nbsp;" || title == "<p>&nbsp;</p>" || title == "<br>"){
    		  alert("제목을 입력해주세요."); 
    		  $("#title").focus();
    		  return false;
    	  }else if(con1 == "" || con1 == null || con1 == "&nbsp;" || con1 == "<p>&nbsp;</p>" || con1 == "<br>"){
    		  alert("내용을 입력해주세요.");
    		  oEditors.getById["con1"].exec("FOCUS");
    		  return false;
    	  }
    	 
          $("#nform").submit();
      	});
      	document.addEventListener("keydown", function(event) {
      		if (event.keyCode === 13) {
      			event.preventDefault();
      			}
      		}, true);
      	
      	$.ajax({
			url : "/math/semlist",
			type : "post",
			dataType : "json",
			success : function(data){
				var jsonStr = JSON.stringify(data);
				var json = JSON.parse(jsonStr);
				
				var option = "<option value=''>학기선택</option>";
				for(var s in json.list){
					if(decodeURIComponent(json.list[s].semester).replace(/\+/gi, " ") == "<%=sName%>"){
						option += "<option value='"+decodeURIComponent(json.list[s].semester).replace(/\+/gi, " ") +"' selected>"+decodeURIComponent(json.list[s].semester).replace(/\+/gi, " ")+"</option>"	
					}else{
						option += "<option value='"+decodeURIComponent(json.list[s].semester).replace(/\+/gi, " ") +"'>"+decodeURIComponent(json.list[s].semester).replace(/\+/gi, " ")+"</option>";
					}
				}
				$("#semlist").html(option);
			},
			error: function(jqXHR, textStatus, errorThrown){
				console.log("error: " + jqXHR + ", " + textStatus + ", " + errorThrown);
			}
			
		})
		
      		$(document).bind("contextmenu",function(){   return false;}); //우클릭방지
      		$(document).bind('selectstart',function() {return false;}); //선택방지
      		$(document).bind('dragstart',function(){return false;}); //드래그방지	
});

function  bookListView(){
	var sem = $("#semlist option:selected").val();
	$.ajax({
		url : "/math/booklist",
		data : { semester : sem },
		type : "post",
		dataType : "json",
		success : function(data){
			var jsonStr = JSON.stringify(data);
			var json = JSON.parse(jsonStr);
			
			var option = "<option value=''>교재선택</option>";
			for(var b in json.list){
				if(decodeURIComponent(json.list[b].book).replace(/\+/gi, " ") == "<%=bName%>"){
					option += "<option value='"+decodeURIComponent(json.list[b].book).replace(/\+/gi, " ") +"' selected>"+decodeURIComponent(json.list[b].book).replace(/\+/gi, " ")+"</option>";	
				}else{
					option += "<option value='"+decodeURIComponent(json.list[b].book).replace(/\+/gi, " ") +"'>"+decodeURIComponent(json.list[b].book).replace(/\+/gi, " ")+"</option>";
				}
			}
			$("#booklist").html(option);
		},
		error : function(jqXHR, textStatus, errorThrown){
			console.log("error: " + jqXHR + ", " + textStatus + ", " + errorThrown);
		}
	})
}
</script>
</head>
<body>
<%@ include file="../common/Adminheader.jsp" %>
<h1><%=sName %></h1>
<div class="content">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-12">
              <div class="card">
                <div class="card-header card-header-primary">
                  <h4 class="card-title ">강의</h4>
                  <p class="card-category"> <%=course.getCourseNo() %>번글 수정페이지 </p>
                </div>
                <div class="card-body">
                  <div class="table-responsive">
<form name="nform"  id="nform"  action="/math/cupdate" method="post" accept-charset="utf-8"  onKeyPress="return submitStop(evnet);">
<input type="hidden" name="no" value="<%=course.getCourseNo()%>">
<table class="table">
<tr></tr>
	<tr>
		<th>제목</th>
		<td>
			<select id="semlist" name="sOption" class="form-control" onchange="bookListView();">
			</select>
			<select id="booklist" name="bOption" class="form-control"> 
			</select>
			&nbsp;<input type="text" id="title" name="cTitle"  value="<%=course.getCourseTitle()%>" class="form-control">
		</td>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea row="10" cols="30" id="con1" name="content"  style="width:100%; height: 350px;"><%=course.getCourseContent() %></textarea></td>
	</tr>
	<tr>
		<th colspan="2">
		<div align="center">
			<input type="button" id="save" value="수정하기" class="btn btn-default btn-sm">
			</div>
		</th>
	</tr>
</table>
</form>
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