<%@ page import="java.util.Date" %>
<%@ page import="javax.xml.crypto.Data" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>

  </head>
  <body>
    <h1>这是我的第一个jsp页面</h1>

  <%
    //System.out.println("hello,jsp");
    out.print("hello  jsp");
    Date date=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String format = sdf.format(date);
  %>
    <br>
    <%=format%>
  <%
    //String age = request.getParameter("age");
  %>
  <%--  <br>
      您的年龄：<%=age%>
    <br>
  <%
    if(Integer.valueOf(age)>=18){
  %>
      恭喜你，成年了
  <%
    }else {
  %>
    你还没成年
  <%
    }
  %>--%>
  <br>

  <%
    pageContext.setAttribute("pagekey","100page");
    request.setAttribute("reqkey","1002req");
    session.setAttribute("sekey","1002se");
    application.setAttribute("appkey","1002app");

    //request.removeAttribute("mykey");
  %>

  <%=pageContext.getAttribute("pagekey")%>
  <%=request.getAttribute("reqkey")%>
  <%=session.getAttribute("sekey")%>
  <%=application.getAttribute("appkey")%>
  <a href="t2.jsp">跳转t2</a>
  </body>
</html>