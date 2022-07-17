
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>小说类别列表</title>

    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        $(function (){
            //控制分页按钮是否可用
            var pageNo=${requestScope.pageModel.pageNo};
            var total=${requestScope.pageModel.totalPages};

            if(pageNo==1){
                $("#firstPage").prop("href","#");
                $("#previousPage").prop("href","#");
            }
            if(pageNo==total){
                $("#nextPage").prop("href","#");
                $("#lastPage").prop("href","#");
            }

            //删除操作先弹出提示
            $(".delete").click(function (){
                var text=$(this).parent().parent().find("td:eq(1)").text();
                if(!confirm("确定删除"+text+"这个小说类别吗？")){
                    return false;
                }
            })
        })
    </script>
    <style type="text/css">
        table{
            border-collapse: collapse;
            align:center;
        }
        table,th,tr{
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }
        #contextbotton{
            margin-left: 100px;
        }
        #contextbotton a{
            margin-left: 10px;
            margin-right: 10px;
        }
    </style>
</head>
<body>
<%--自动登录--%>
    <%
        String username = request.getParameter("username");

        //这是输入了账号进来的
        if(username!=null && username.length()>0){
            Cookie cookie=new Cookie("username",username);
            cookie.setMaxAge(30);
            response.addCookie(cookie);
        }else {
            //没有输入账号密码进来的 检查是否有cookie
            Cookie [] cookies=request.getCookies();
            if(cookies!=null && cookies.length>0){
                //如果有就把上面的username变量赋值  后面会判断它
                for (Cookie c:cookies) {
                    if("username".equals(c.getName())){
                        username= c.getValue();
                    }
                }
            }
        }
       /* if(username==null || "".equals(username)){
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        }*/

        if( !"".equals(username) || username.length()>0   ){
            session.setAttribute("username",username);
        }
    %>

        <c:if test="${sessionScope.username != null}"> <%--尝试还不等于空串--%>
            欢迎你：${sessionScope.username};
            <a href="${pageContext.request.contextPath}/logout.category">安全退出</a>
        </c:if>
        <c:if test="${sessionScope.username == null}">

            <a href="${pageContext.request.contextPath}/logout.category">请登录</a>
        </c:if>

<a href="${pageContext.request.contextPath}/toAdd.category">新增一条记录</a>
<%--<a href="${pageContext.request.contextPath}/logout.category">安全退出</a>--%>
<table border="1"  align="center">
    <tr>
        <td colspan="6">
            <form action="cate" method="get">
                <input type="text" placeholder="类别id,类别名称，描述" name="likeValue"
                       value="${requestScope.pageModel.likeValue}">

                <input type="submit" value="搜索">
            </form>
        </td>
    </tr>
    <tr>
        <th>id</th>
        <th>名称</th>
        <th>类别</th>
        <th>创建时间</th>
        <th colspan="2">操作</th>

    </tr>

    <c:forEach items="${requestScope.pageModel.pageData}" var="c">
        <tr>
            <td>${c.cid}</td>
            <td>${c.cname}</td>
            <td>${c.describe_1}</td>
            <td>${c.ccreatetime}</td>
            <td><a href="${pageContext.request.contextPath}/toUpdate.category?cid=${c.cid}">查询</a></td>
            <td><a class="delete" href="${pageContext.request.contextPath}/deleteOne.category?cid=${c.cid}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<div align="center" id="contextbotton">
    &nbsp;总记录数 &nbsp;${requestScope.pageModel.recodeCount}&nbsp;条&nbsp;
    &nbsp;共  &nbsp;${requestScope.pageModel.totalPages}&nbsp; 页  &nbsp;&nbsp;
    &nbsp;    <a href="cate?pageNo=1&likeValue=${requestScope.pageModel.likeValue}"
                 id="firstPage">首页</a>
    &nbsp;    <a href="cate?pageNo=${requestScope.pageModel.pageNo-1}&likeValue=${requestScope.pageModel.likeValue}"
                 id="previousPage">上一页</a>
    &nbsp;    <a href="cate?pageNo=${requestScope.pageModel.pageNo+1}&likeValue=${requestScope.pageModel.likeValue}"
                 id="nextPage">下一页</a>
    &nbsp;   <a href="cate?pageNo=${requestScope.pageModel.totalPages}&likeValue=${requestScope.pageModel.likeValue}"
                id="lastPage">尾页</a>
    &nbsp;   第 &nbsp;${requestScope.pageModel.pageNo}&nbsp;页
</div>
</body>
</html>
