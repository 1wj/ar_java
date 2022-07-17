<%@ page import="com.domain.Cate" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>


    <title>编辑页面</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        $(function (){
            $("#description").val("${requestScope.cate.describe_1}");

           /* $(":text[name='cname']").blur(function (){
                var url="<%=request.getContextPath()%>/two";
                var str=$(this).val();
                var param={
                    "str":str,
                }
               $.get(url,param,function (data){
                   var strr=JSON.parse(data);
                   if(strr.ispass==0){
                       $("#msgname").html("值已重复");
                   }else {
                       $("#msgname").html("值未重复");
                   }
               })


            })
            $(":text[name='cname']").focus(function (){
                $("#msgname").html("");
            })*/
        })
    </script>
</head>
<body>
    <%

        String str= Math.random()+"";
        session.setAttribute("myflag",str);
    %>
        <form action="${pageContext.request.contextPath}/addorupdate.category" method="get">
        <table>
            <tr>
                <td>cid:</td>
                <td>
                    <input type="text" name="cid" readonly="readonly" placeholder="新增是无需填写"
                    value="${requestScope.cate.cid}"></td>
            </tr>
            <tr>
                <td>cname:</td>
                <td><input type="text" name="cname"
                    value="${requestScope.cate.cname}"><span id="msgname"></span></td>
            </tr>
            <tr>
                <td>description:</td>
                <td><textarea  name="description"></textarea></td>
            </tr>
            <tr>
                <td colspan="2"><input type="hidden" name="flag" value="<%=str%>"></td>

            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"></td>
            </tr>
        </table>
         </form>
</body>
</html>
