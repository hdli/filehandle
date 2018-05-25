<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>query data</title>
	<SCRIPT type="text/javascript" src="../biz/zheng/config.jsp"></SCRIPT>
	<SCRIPT type="text/javascript" src="../biz/zheng/import.js"></SCRIPT>
    <SCRIPT type="text/javascript">
	    var nid='<%=request.getParameter("nid")%>';
	    var sid='<%=request.getParameter("sid")%>';
	    nid=parseInt(nid)||0;
	    sid=parseInt(sid)||0;
        $import("gui.loader,biz.base.FormEditorUtil,biz.base.detail"); 
	 </SCRIPT>
    
</head>
<body>
  <div id="form_container" />
  <div id="grid_container" />
</body>
</html>

