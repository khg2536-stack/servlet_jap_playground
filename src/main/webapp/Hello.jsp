<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: A
  Date: 26. 8. 27.
  Time: 오후 3:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--jsp주석--%>
<!-- html 주석-->
<%
  //자바코드 실행 가능
  LocalDateTime now = LocalDateTime.now();
%>
<b>현재시간은 <%= now %></b>
</body>
</html>
