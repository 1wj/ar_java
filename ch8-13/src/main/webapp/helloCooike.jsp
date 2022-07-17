<%@ page import="java.net.CookieHandler" %><%--
  Created by IntelliJ IDEA.
  User: Wj
  Date: 2021/8/13
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
          Cookie [] cookies=request.getCookies();
          if(cookies != null && cookies.length>0  ){//的写后面不然会报空指针异常
            for (Cookie c:cookies) {
              out.print( c.getName() +","+c.getValue()  );
              out.print("<br>");
            }
          }else {
           out.print("你好欢迎你,正在为你创建cookie");
           Cookie cookie=new Cookie("mykey","myvalue");
           cookie.setMaxAge(60);
           response.addCookie(cookie);
          }
        %>
</body>
</html>
