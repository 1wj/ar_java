<%@ page import="java.util.List" %>
<%@ page import="com.domain.Cate" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Wj
  Date: 2021/8/11
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            List<Cate>  list = (List<Cate>) request.getAttribute("key");
        %>
            <table >
                <tr>
                    <th>id</th>
                    <th>名称</th>
                    <th>类别</th>
                    <th>创建时间</th>
                </tr>
            <%
                for (Cate cate:list) {
            %>
                <tr>
                    <td><%=cate.getCid()%></td>
                    <td><%=cate.getCname()%></td>
                    <td><%=cate.getDescribe_1()%></td>
                    <td><%=cate.getCcreatetime()%></td>
                </tr>
            <%
                }
            %>
            </table>
</body>
</html>
