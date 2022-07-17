
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
        <input type="text" value="${requestScope.key001}">  <br>
        <input type="text" value="${requestScope.cate.cname}">  <br>
        <input type="text" value="${sessionScope.cate.cname}">  <br>
        <input type="text" value="${applicationScope.cate.cname}">  <br>


        <br>
        <input type="text" value="${cate.cname}">1  <br>
        <input type="text" value="${cate.cname}">2  <br>
        <input type="text" value="${cate.cname}">3  <br>
        <input type="text" value="${requestScope["com.iweb.test.Cate"]["cname"]}">用中括号双引号取代.  <br>
        <input type="text" value="${requestScope["com.iweb.test.Cate"]["cid"]+1}">用中括号双引号取代.  <br>
        <input type="text" value="${param.score+1}"> 获取参数 <br>
        <input type="text" value="${pageContext.request.contextPath}">用el表达式来获取当前web应用的根目录  <br>

        <c:forEach items="${requestScope.list}" var="c">
                ${c.cid}---${c.cname}---${c.ccreatetime}---${c.describe_1}
                <br>
        </c:forEach>
        <br>
        <c:out value="${book}"></c:out>
        <br>
        <c:if test="${age>=18}">
                你已经成年了
        </c:if>
        <c:if test="${age<18}">
                未成年
        </c:if>
        <br>
        <c:import url="my.jsp"></c:import>
      <%--  <c:import url="http://www.baidu.com" charEncoding="utf-8"></c:import>--%>
       <%-- <c:redirect url="my.jsp"></c:redirect>--%>
        <br>
        <c:url value="/success.jsp" scope="request" var="myurl">
                <c:param name="age" value="23"></c:param>
                <c:param name="name" value="tom"></c:param>
        </c:url>
        ${myurl}
</body>
</html>
