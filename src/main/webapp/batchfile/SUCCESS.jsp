<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>文件处理成功</p><br>
<div>${map}</div>
</body>
<script type="text/javascript">
	if(window.parent&&window.parent.finishSubmit){
		 window.parent.finishSubmit(true);
	}
</script>
</html>