<%--
  Created by IntelliJ IDEA.
  User: Wj
  Date: 2021/9/3
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/denglu" method="post">
   <span style="color:red">${requestScope.message}</span>
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="name" placeholder="请输入用户名"></td>
        </tr>

        <tr>
            <td>用户密码：</td>
            <td><input type="password" name="password" placeholder="请输入用户密码"></td>
        </tr>

        <tr>
            <td colspan="2"> <input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
