<%@ page import="com.domain.Cate" %><%--
  Created by IntelliJ IDEA.
  User: Wj
  Date: 2021/8/12
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        Cate cate= (Cate) request.getAttribute("cate");
    %>

    <title>编辑页面</title>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        $(function (){
            $("#description").val("<%=cate == null ? "" : cate.getDescribe_1()%>");
        })
    </script>
</head>
<body>
        <form action="<%=request.getContextPath()%>/addorupdate.category" method="get">
        <table>
            <tr>
                <td>cid:</td>
                <td>
                    <input type="text" name="cid" readonly="readonly" placeholder="新增是无需填写"
                    value="<%=cate == null ? "" : cate.getCid()%>"></td>
            </tr>
            <tr>
                <td>cname:</td>
                <td><input type="text" name="cname"
                    value="<%=cate == null ? "" : cate.getCname()%>"></td>
            </tr>
            <tr>
                <td>description:</td>
                <td><textarea  name="description"></textarea></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"></td>
            </tr>
        </table>
         </form>
</body>
</html>
