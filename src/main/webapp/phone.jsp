<%@ page contentType="text/html;charset=UTF-8" language="java"
    isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:set var="phone" value="갤럭시 폴드" />

<%--    <c:set var="phone" value="아이폰" />--%>
    당신의 폰은 ${phone}입니다.
    <c:choose>
        <c:when test="${phone == '폴드8'}">
            부유함
        </c:when>
        <c:when test="${phone == '플립8'}">
            평범함
        </c:when>
        <c:when test="${phone == '아이폰'}">
            앱등이
        </c:when>
    </c:choose>

    <c:forEach var="i" begin="0" end="5">
        <c:choose>
            <c:when test="${st.first}">
                <br/><span style="color: red">${i}</span>
            </c:when>
            <c:otherwise>
                <br/>${i}
            </c:otherwise>
        </c:choose>
        <br/>${1}
    </c:forEach>

    <!--fmt 연습-->
    <c:set var="price" value="50000"/>
    <br>가격 : <fmt:formatNumber value="${price}" type="number"/>
    <br>가격 : <fmt:formatNumber value="${price}" type="currency" currencySymbol="KRW"/>
<%--    <br>가격 : <fmt:formatNumber value="${price}" type="number" pattern="#.##0.00"/>--%>
    <br> 할인율 : <fmt:formatNumber value="${discount}" type="percent" />

    <br> <jsp:useBean id="now" class="java.util.Date"/>
    현재 날짜 : <fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/>
    <br/>

</body>
</html>
