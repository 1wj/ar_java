
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--四大作用域--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%=pageContext.getAttribute("pagekey")%><br>
    <%=request.getAttribute("reqkey")%><br>
    <%=session.getAttribute("sekey")%><br>
    <%=application.getAttribute("appkey")%><br>
    key:${key}
</body>
</html>
