<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="qna.model.vo.Qna" %>    
<%
	Qna qna = (Qna)request.getAttribute("qna");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<title>답변페이지</title>

<!-- css -->
	<link href="/math/resources/assets/css/material-dashboard.css" rel="stylesheet" />
  <link href="/math/resources/assets/css/reset.css" rel="stylesheet" />
  <link href="/math/resources/assets/css/qna/answerWriteView.css" rel="stylesheet" />

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
         
         if(title == "" || title == null || title == "&nbsp;" || title == "<p>&nbsp;</p>" || title == "<br>"){
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

       window.onload = function(){
       	$(document).bind("contextmenu",function(){   return false;}); //우클릭방지
       	$(document).bind('selectstart',function() {return false;}); //선택방지
       	$(document).bind('dragstart',function(){return false;}); //드래그방지	
       }
});
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
                  <h4 class="card-title ">QnA 답변하기</h4>
                  <p class="card-category"> <%=qna.getQnaNo() %>번글 상세페이지</p>
                </div>
                <div class="card-body">
                  <div class="table-responsive">
                  <form id="nform" action="/math/qawrite" method="post" enctype="multipart/form-data">
<input type="hidden" name="qno" value="<%=qna.getQnaNo()%>">
<input type="hidden" name="admin" value="<%=admin%>">
                    <table class="table">
	<tr>
		<td>제목</td>
		<td><input type="text"  id="title" name="qATitle" class="form-control"></td>
	</tr>
	<tr>
		<td>답변내용</td>
		<td><textarea row="10" cols="30" id="con1" name="content" style="width:100%; height: 350px;"></textarea></td>
	</tr>
	<tr>
		<td>첨부파일</td>
		<td><input type="file" name="upfile" class="form-control"></td>
	</tr>
</table>
<div align="center" id="d1">
<input type="button" id="save" value="답변등록" class="btn btn-default btn-sm">
</div>
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