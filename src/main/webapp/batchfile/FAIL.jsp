<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>文件处理失败:</div>
<div id="errorMsg">${map}</div>
<p></p>
</body>
<script type="text/javascript">
	if(window.parent&&window.parent.finishSubmit){
		 window.parent.finishSubmit(false,document.getElementById("errorMsg").innerHTML);
	}
</script>
</html>