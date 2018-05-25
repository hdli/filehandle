<%@ page contentType="text/html; charset=utf-8" %>

<%@ page import="java.util.*" %>

<html><head><title>Credit Finance Cluster App Test</title></head>

<body>
<h2>P2P</h2>
Server Info:

<%

out.println(request.getLocalAddr() + " : " + request.getLocalPort()+"<br>");%>

<%

  out.println("<br> ID " + session.getId()+"<br>");


%>

</body>

</html>