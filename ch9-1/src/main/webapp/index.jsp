<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="success.jsp">Hello Servlet</a>

<a href="my">Hello Servlet2</a>
    <form action="success2.jsp">
      <input type="text" name="uname"><br>
      <input type="password" name="pwd"><br>
      <input type="submit" value="提交"><br>
    </form>
<br>
<a href="test3.jsp">销毁session对象</a>
</body>
</html>