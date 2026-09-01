<%--
  Created by IntelliJ IDEA.
  User: A
  Date: 26. 8. 27.
  Time: 오후 4:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="bmi" scope="request" class="com.oraclejava.myBmi" />
<jsp:setProperty name="bmi" property="*" />

<html>
<head>
    <title>Title</title>
</head>
<body>
    키 : <%= bmi.getHeight() %> cm <br/>
    체중 : <%= bmi.getWeight() %> kg <br/>
    BMI : <%= bmi.getBmi() %> kg <br/>
</body>
</html>
