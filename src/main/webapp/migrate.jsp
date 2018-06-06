<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%String path=request.getContextPath(); %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css"  href="<%=path%>/base/script/zui/css/zui.min.css" />
<link type="text/css" rel="stylesheet" href="<%=path%>/base/script/zui/lib/jsgrid/jsgrid-theme.min.css" />
<script type="text/javascript" src="<%=path%>/base/jquery/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/base/script/zui/js/zui.min.js"></script>
<script type="text/javascript" src="<%=path%>/base/script/zui/lib/jsgrid/jsgrid.min.js"></script>
<title>文件页面</title>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
		<div class="btn-toolbar">
		  <div class="btn-group">
		    <button class="btn" id="importFileBtn" data-toggle="modal" data-target="#myModal">导入文件</button>
		  </div>
		</div>
</nav>
<div class="panel">
  <div class="panel-body">
  	<div id="grid"></div>
  </div>
</div>
<!-- 迁移文件上传对话框 -->
<div class="modal fade" id="myModal">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
    	 <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">关闭</span></button>
        <h4 class="modal-title">文件操作</h4>
      </div>
      <div class="modal-body">
		     <form id="form" class="form-horizontal" action="<%=path%>/migrate/upload" target="submitFrame" onsubmit="return onSubmit();"  method="post" enctype="multipart/form-data">
					  <div class="form-group">
						  <label class="radio-inline">
						    <input type="radio" name="category" value="commonProd" checked>普通产品
							</label>
							<label class="radio-inline">
							  <input type="radio" name="category" value="liquProd">高流转性产品
							</label>
						</div>
					  <div class="form-group">
					    <label for="executeId" class="required">执行命令</label>
					    <select class="form-control" name="executeId" id="executeId">
							  <option value="">请选择执行命令</option>
							  <option value="11">开户入库</option>
							  <option value="21">标的入库</option>
							  <option value="31">签约关系入库</option>
							  <option value="41" show="commonProd">普通债权入库</option>
							  <option value="71">标的更新</option>

							</select>
							<label for="instCode" class="required">机构号</label>
					    <input type="text" class="form-control" name="instCode"  id="instCode" >

					  </div>
					 <%-- <div class="form-group" style="display:none;">
					  	 	<label for="resultName">结果文件名</label>
					      <input type="text" class="form-control" name="resultName"  id="resultName" placeholder="结果文件名">
					  </div>--%>
					  <div class="form-group showDiv" show="11,21" style="display:none;">
					    <label for="requestfile">请求文件</label>
					    <input type="file" class="form-control" name="requestfile"  id="requestfile" >
					  </div>
					  <div class="form-group showDiv" show="11,21,31,41,71" style="display:none;">
					    <label for="resultfile">结果文件</label>
					    <input type="file" class="form-control" name="resultfile"  id="resultfile" >
					  </div>
					  <button type="submit" class="btn btn-default">提交</button>
				  <form>
		  </div>
    </div>
  </div>
</div>
<iframe style="width:0; height:0; margin-top:-10px;" name="submitFrame" src="about:blank"></iframe>
<script type="text/javascript">
function onSubmit(){
	var frm=$("#form");
	if(!frm.find("[name=executeId]").val()){
		alert("执行命令不能为空");
		return false;
	}
	if(!frm.find("input[name=instCode]").val()){
		alert("机构号不能为空");
		return false;
	}
	if(!frm.find("input[name=resultName]").val()&&frm.find("input[name=resultfile]").val()){
		var name=frm.find("input[name=resultfile]").val(),end=name.lastIndexOf(".");
		name=name.substring(name.lastIndexOf("\\")+1,end>0?end:name.length);
		frm.find("input[name=resultName]").val(name);
	}
	if($("#commit").attr("disabled")){
		return false;
	}
	$("#commit").attr("disabled",true);
  return true;
}
function finishSubmit(result){
	$("#commit").attr("disabled",false);
	if(result){
	  new $.zui.Messager('提示消息：文件提交成功',{type: 'success',time:3000}).show();
	  $("#grid").jsGrid("render");
  }else{
  	new $.zui.Messager('提示消息：系统错误',{type: 'warning',time:3000}).show();
  }
  $('#myModal').modal('hide');
}
$(document).ready(function(){
  var stateList=[
      {text:"处理中", value:'A'},
      {text:"已处理", value:'S'},
      {text:"处理失败", value:'F'}
  ];
  var typeList=[
      {text:"--选择--", value:''},
      {text:"批量开户", value:1},
      {text:"标的", value:2},
      {text:"签约关系", value:3},
      {text:"债权迁移", value:4},
      {text:"交易明细流水", value:5},
      {text:"交易明细全流", value:6},
      {text:"标的更新", value:7}
  ];
  $(":input[name='category']").change(function(){
  	   $("#executeId").find("option").swh($(this).val());
  });	
  $("#executeId").change(function(){
     $(".showDiv").swh($(this).val());
  });
  $('#myModal').on('hide.zui.modal', function() {
      $("#form")[0].reset();
  });
  $("#grid").jsGrid(jQuery.extend({},$.jsGrid.defaultOption,{
        controller: {
            loadData:function(filter){
                var d = $.Deferred();
                var param=$.filterEmpty(filter);
                $.ajax({
                    url: "<%=path%>/migrate/query",
                    dataType:"json",
                    data: param
                }).done(function(response){
                    d.resolve(response);
                });
                return d.promise();
            }
        },
        fields: [
            { name: "sid",title:"序号", width:60},
            { name: "instCode",title:"机构名", type: "text",width:80},
            { name: "fileName",title:"文件名", type: "text",width:120},
            { name: "finalCounts",title:"数量",width:80},
            { name: "state",title:"状态", type: "select",items:stateList,valueField:"value",textField:"text"},
            { name: "type",title:"业务类型", type: "select",items:typeList,valueField:"value",textField:"text"},
            { name: "createTims",title:"创建时间",type: "text",width:110},
            { name: "fileRspName",title:"结果文件",width:120,css:"td-break",itemTemplate:function(value,item){
            	if(value){
            		return escape(value);
            	}
              return "";
            }},
            { name: "reason",title:"处理结果",width:180,css:"td-break"}
        ]
    })); 
});   
</script>
</body>
</html>