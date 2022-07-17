<%--
  Created by IntelliJ IDEA.
  User: Wj
  Date: 2021/9/3
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <a href="${pageContext.request.contextPath}/hello">发起一个请求</a><br>
    <a href="${pageContext.request.contextPath}/test1">发起test1请求</a><br>
    <a href="${pageContext.request.contextPath}/test2">发起test2请求</a><br>
    <form action="${pageContext.request.contextPath}/test2" method="post"><br>
      <input type="submit" value="提交">
    </form>
    <a href="${pageContext.request.contextPath}/test3?name=tom&age=20">发起test3请求</a><br>
    <%
      pageContext.setAttribute("pagekey","pagevalue");
      request.setAttribute("requestkey","requestvalue");
      session.setAttribute("sessionkey","sessionvalue");
      application.setAttribute("applicationkey","applicationvalue");

    %>
  </body>
</html>
