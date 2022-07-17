<%--
  Created by IntelliJ IDEA.
  User: Wj
  Date: 2021/9/11
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

        <h3>登录页面</h3>
        <form action="${pageContext.request.contextPath}/login" method="post">
            <span style="color: red">${requestScope.message}</span><br>
            用户名：<input type="text" name="loginname" ><br>
            密码：<input type="password" name="password" ><br>
            <input type="submit" value="登录">
        </form>
</body>
</html>
