<%--
  Created by IntelliJ IDEA.
  User: Wj
  Date: 2021/9/11
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table{
            border-collapse: collapse;
        }
        th,td{
            padding: 5px 15px
        }
    </style>
</head>
<body>
    <h3>欢迎你 ${sessionScope.user.username}}</h3>
    <table border="1">
      <tr>
        <th>封面</th>
        <th>书名</th>
        <th>作者</th>
        <th>价格</th>
        <th>出版社</th>
      </tr>
        <c:forEach items="${requestScope.books}" var="book">
            <tr >
                <td> <img src="<%=request.getContextPath()%>/img/${book.image}" style="height: 60px"></td>
                <td>${book.name}</td>
                <td>${book.author}</td>
                <td>${book.price}</td>
                <td>${book.publication}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
