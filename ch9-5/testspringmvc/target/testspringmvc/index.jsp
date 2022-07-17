<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $(":text[name=username]").keyup(function () {
                var str=$(this).val();
                var url="${pageContext.request.contextPath}/checkedUsername";
                var param={
                    "name":str
                };
                $.post(url,param,function (data) {
                    var jsonObj=JSON.parse(data);
                    if(jsonObj.flag==0){
                        $("#message").css("color","red").html("对不起，该用户名已经存在");
                        $("#reg").prop("disabled",true);
                    }else {
                        $("#message").css("color","green").html("可以使用");
                        $("#reg").prop("disabled",false);
                    }
                })
            })
        })
    </script>
</head>
<body>
<h2>Hello World!</h2>
    <a href="${pageContext.request.contextPath}/test1/1001">test</a><br>
    <a href="${pageContext.request.contextPath}/test2">test2</a><br>
    <a href="${pageContext.request.contextPath}/test3">test3</a><br>

<hr>
        <form action="test6" method="post">
            <table>
                <tr>
                    <td>用户名：</td>
                    <td><input type="text" name="username" placeholder="请输入用户名">
                        <span id="message"></span>
                    </td>
                </tr>

                <tr>
                    <td>用户密码：</td>
                    <td><input type="password" name="password" placeholder="请输入用户密码"></td>
                </tr>

                <tr>
                    <td>姓名：</td>
                    <td><input type="text" name="userfullname" placeholder="请输入姓名"></td>
                </tr>
                <tr>
                    <td colspan="2"> <input type="submit" value="提交" id="reg"></td>
                </tr>
            </table>
        </form>
<a href="${pageContext.request.contextPath}/test5?username=tom">test5</a><br>

<a href="${pageContext.request.contextPath}/forwardToNextController">请求转发到下一个页面</a><br>
<a href="${pageContext.request.contextPath}/redirectToNextController">重定向到下一个页面</a><br>

</body>
</html>
