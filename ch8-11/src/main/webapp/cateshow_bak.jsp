<%@ page import="java.util.List" %>
<%@ page import="com.domain.Cate" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.util.PageModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小说类别列表</title>
    <%
        PageModel pageModel= (PageModel) request.getAttribute("pageModel");
    %>
    <script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
    <script type="text/javascript">
        $(function (){
            //控制分页按钮是否可用
            var pageNo=<%=pageModel.getPageNo()%>;
            var total=<%=pageModel.getTotalPages()%>;

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
        <a href="<%=request.getContextPath()%>/toAdd.category">新增一条记录</a>
            <table border="1"  align="center">
                <tr>
                    <td colspan="6">
                        <form action="cate" method="get">
                            <input type="text" placeholder="类别id,类别名称，描述" name="likeValue"
                                value="<%=pageModel.getLikeValue()==null?"":pageModel.getLikeValue()%>">
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
            <%
                for (Cate cate:(List<Cate>)pageModel.getPageData()) {
            %>
                <tr>
                    <td><%=cate.getCid()%></td>
                    <td><%=cate.getCname()%></td>
                    <td><%=cate.getDescribe_1()%></td>
                    <td><%=cate.getCcreatetime()%></td>
                    <td><a href="<%=request.getContextPath()%>/toUpdate.category?cid=<%=cate.getCid()%>">查询</a></td>
                    <td><a class="delete" href="<%=request.getContextPath()%>/deleteOne.category?cid=<%=cate.getCid()%>">删除</a></td>
                </tr>
            <%
                }
            %>
            </table>
            <div align="center" id="contextbotton">
                &nbsp;总记录数 &nbsp; <%=pageModel.getRecodeCount()%> &nbsp;条&nbsp;
                &nbsp;共  &nbsp;<%=pageModel.getTotalPages()%> &nbsp; 页  &nbsp;
      &nbsp;    <a href="cate?pageNo=1&likeValue=<%=pageModel.getLikeValue()==null ? "" : pageModel.getLikeValue()%>"
                 id="firstPage">首页</a>
      &nbsp;    <a href="cate?pageNo=<%=pageModel.getPageNo()-1%>&likeValue=<%=pageModel.getLikeValue()==null ? "" : pageModel.getLikeValue()%>"
                   id="previousPage">上一页</a>
      &nbsp;    <a href="cate?pageNo=<%=pageModel.getPageNo()+1%>&likeValue=<%=pageModel.getLikeValue()==null ? "" : pageModel.getLikeValue()%>"
                   id="nextPage">下一页</a>
      &nbsp;   <a href="cate?pageNo=<%=pageModel.getTotalPages()%>&likeValue=<%=pageModel.getLikeValue()==null ? "" : pageModel.getLikeValue()%>"
                   id="lastPage">尾页</a>
      &nbsp;   第 &nbsp;<%=pageModel.getPageNo()%>&nbsp;页
            </div>
</body>
</html>
