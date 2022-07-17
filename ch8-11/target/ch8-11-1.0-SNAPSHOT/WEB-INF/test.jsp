<%--
  Created by IntelliJ IDEA.
  User: Wj
  Date: 2021/8/14
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        显示当前会话的JSESSIONID:<%=session.getId()%>>
        <br>
        当前会话是新的吗？<%=session.isNew()%>>
        <br>
        在当前会话上多少时间不发请求，该会话就失效：<%=session.getMaxInactiveInterval()%>
        <br>
        会话创建时间:<%=session.getLastAccessedTime()%>
        <br>
        <%
            session.setMaxInactiveInterval(300);
        %>>
</body>
</html>
