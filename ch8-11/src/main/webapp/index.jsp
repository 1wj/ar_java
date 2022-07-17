<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
    <%
        Cookie[] cookies=request.getCookies();
        if(cookies!= null || cookies.length>0){
            for (Cookie c:cookies ) {
                if("username".equals(c.getName())){
                    c.setMaxAge(0);
                    response.addCookie(c);
                }
            }
        }
    %>



登录页面

    <form action="cate">
        <table>
            <tr>
                <td> username:</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td> password:</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"></td>

            </tr>
        </table>

    </form>


</body>
</html>