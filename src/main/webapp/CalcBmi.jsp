<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 26. 8. 27.
  Time: 오후 4:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String height = request.getParameter("height");
    String weight = request.getParameter("weight");

    double height2 = Double.parseDouble(height);
    double weight2 = Double.parseDouble(weight);

    double bmi = weight2 / ((height2 / 100) * (height2 / 100));
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    키 : <%=height%> cm <br>
    체중 : <%=weight%> kg <br>
    BMI : <%=bmi%> <br>
</body>
</html>
