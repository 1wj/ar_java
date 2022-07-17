


<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Title</title>
   <%-- <script type="text/javascript" src="../my.js"></script>--%>
    <%--<link type="text/css" rel="stylesheet" href="../my.css">--%>
    <%--这也可以用--%>
    <script type="text/javascript" src="<%=request.getContextPath()%>/my.js"></script>
    <link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/my.css">
</head>
<body>
           ss: ${key}<br>
            <a href="one">发了一个请求</a><br>
            <a href="/one">发了二个请求</a><br>
            <a href="/ch8_11/one">发了三个请求</a><br>
           <%--这样写是最规范的--%>
            <a href="<%=request.getContextPath()%>/one">发了三三个请求</a><br>
            <a href="../one">发了四个请求</a><br>
</body>
</html>
