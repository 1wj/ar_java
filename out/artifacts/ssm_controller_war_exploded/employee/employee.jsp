<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统 ——员工管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<meta http-equiv="expires" content="0" />
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
<meta http-equiv="description" content="This is my page" />
<link href="<%=request.getContextPath()%>/css/css.css" type="text/css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/js/ligerUI/skins/Aqua/css/ligerui-dialog.css" />
<link
	href="<%=request.getContextPath()%>/js/ligerUI/skins/ligerui-icons.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.11.0.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-migrate-1.2.1.js"></script>
<script src="<%=request.getContextPath()%>/js/ligerUI/js/core/base.js"
	type="text/javascript"></script>
<script
	src="<%=request.getContextPath()%>/js/ligerUI/js/plugins/ligerDrag.js"
	type="text/javascript"></script>
<script
	src="<%=request.getContextPath()%>/js/ligerUI/js/plugins/ligerDialog.js"
	type="text/javascript"></script>
<script
	src="<%=request.getContextPath()%>/js/ligerUI/js/plugins/ligerResizable.jss"
	type="text/javascript"></script>
<link href="<%=request.getContextPath()%>/css/pager.css" type="text/css"
	rel="stylesheet" />

<script type="text/javascript">
	$(function() {
		/** 给数据行绑定鼠标覆盖以及鼠标移开事件  */
		$("tr[id^='data_']").hover(function() {
			$(this).css("backgroundColor", "#eeccff");
		}, function() {
			$(this).css("backgroundColor", "#ffffff");
		})

		//删除按钮控制
		$(".delete").click(function (){
			var content=$(this).parent().parent().find("td:eq(1)").text();
			var flag=confirm("确定是要删除"+content()+"的信息吗？");
			return flag;
		})

		//控制首页时上一页失效，尾页时下一页失效
		var thispage ="${requestScope.pageModel.pageIndex}";
		var pages="${requestScope.pageModel.totalSize}";
		if(thispage==pages){
			$("#nextpage").attr("href","#");
			$("#last").attr("href","#");
		}
		if(thispage==1){
			$("#previouspage").attr("href","#");
			$("#firstPage").attr("href","#");
		}


		//下拉框赋值
		$("#selectjob_id").val("${requestScope.selectjob_id}")
		$("#selectdept_id").val("${requestScope.selectdept_id}")
		$("#selectsex").val("${requestScope.selectsex}")

	})
</script>
</head>
<body>
	<!-- 导航 -->
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td height="10"></td>
		</tr>
		<tr>
			<td width="15" height="32"><img
				src="<%=request.getContextPath()%>/images/main_locleft.gif"
				width="15" height="32"></td>
			<td class="main_locbg font2"><img
				src="<%=request.getContextPath()%>/images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：员工管理
				&gt; 员工查询</td>
			<td width="15" height="32"><img
				src="<%=request.getContextPath()%>/images/main_locright.gif"
				width="15" height="32"></td>
		</tr>
	</table>

	<table width="100%" height="90%" border="0" cellpadding="5"
		cellspacing="0" class="main_tabbor">
		<!-- 查询区  -->
		<tr valign="top">
			<td height="30">
				<table width="100%" border="0" cellpadding="0" cellspacing="10"
					class="main_tab">
					<tr>
						<td class="fftd">
							<form name="empform" method="post" id="empform"
								action="">
								<table width="100%" border="0" cellpadding="0" cellspacing="0">
									<tr>
										<td class="font3">职位： <select name="selectjob_id"
											id="selectjob_id" style="width:143px;">
												<option value="">--请选择职位--</option>
												<c:forEach items="${requestScope.selectjobs}" var="job">
													<option value="${job.id}">${job.name}</option>
												</c:forEach>
										</select> 所属部门： <select name="selectdept_id" id="selectdept_id"
											style="width:143px;">
												<option value="">--请选择部门--</option>
												<c:forEach items="${requestScope.selectdepts}" var="dept">
													<option value="${dept.id}">${dept.name}</option>
												</c:forEach>
										</select>
										</td>
									</tr>
									<tr>
										<td class="font3">性别： <select name="selectsex"
											id="selectsex" style="width:143px;">
												<option value="">--请选择性别--</option>
												<option value="1">男</option>
												<option value="0">女</option>
										</select> 其它属性： <input type="text" name="likevalue" value="${likevalue}"
											 style="width:143px;"> &nbsp;
											<input type="hidden" name="pageIndex" value="1" /><input
											type="submit" value="搜索" />
										</td>
									</tr>
								</table>
							</form>
						</td>
					</tr>
				</table>
			</td>
		</tr>

		<!-- 数据展示区 -->
		<tr valign="top">
			<td height="20">
				<table width="100%" border="1" cellpadding="5" cellspacing="0"
					style="border:#c2c6cc 1px solid; border-collapse:collapse;">
					<tr class="main_trbg_tit" align="center">
						<td>ID</td>
						<td>姓名</td>
						<td>性别</td>
						<td>手机号码</td>
						<td>邮箱</td>
						<td>职位</td>
						<td>学历</td>
						<td>身份证号码</td>
						<td>部门</td>
						<td>联系地址</td>
						<td>建档日期</td>
						<td align="center" colspan=2>操作</td>
					</tr>
					<c:forEach items="${requestScope.employees}" var="employee">
						<tr id="data_${employee.id }" class="main_trbg" align="center">
							<td>${employee.id}</td>
							<td>${employee.name}</td>
							<c:if test="${employee.sex==1}">
								<td>男</td>
							</c:if>
							<c:if test="${employee.sex!=1}">
								<td>女</td>
							</c:if>
							<td>${employee.phone}</td>
							<td>${employee.email}</td>
							<td>${employee.job.name}</td>
							<td>${employee.education}</td>
							<td>${employee.card_id}</td>
							<td>${employee.dept.name}</td>
							<td>${employee.address}</td>
							<td>${employee.create_date}</td>
							<td align="center" width="40px">
								<a href="<%=request.getContextPath()%>/toUpdateEmployee?id=${employee.id}">
									<img src="<%=request.getContextPath()%>/images/update.gif" alt="" title="修改">
								</a>
							</td>
							<td align="center" width="40px">
								<a href="<%=request.getContextPath()%>/deleteEmployee?id=${employee.id}">
									<img src="<%=request.getContextPath()%>/images/delete.gif" alt="" title="删除">
								</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>
		<!-- 分页标签 -->
		<tr valign="top">
			<td align="center" class="font3">总记录数 <span id="count">${requestScope.pageModel.recodeCount}</span>条
				共<span id="pages">${requestScope.pageModel.totalSize}</span>页
				<a id="firstPage"
				   href="<%=request.getContextPath()%>/selectEmployee?pageIndex=1&likevalue=${likevalue}">首页</a>
				<a id="previouspage"
				   href="<%=request.getContextPath()%>/selectEmployee?pageIndex=${requestScope.pageModel.pageIndex-1}&likevalue=${likevalue}">上一页</a>
				<span id="nextpagespan">
					<a id="nextpage"
					   href="<%=request.getContextPath()%>/selectEmployee?pageIndex=${requestScope.pageModel.pageIndex+1}&likevalue=${likevalue}">下一页</a> </span>
				<a id="last"
				   href="<%=request.getContextPath()%>/selectEmployee?pageIndex=${requestScope.pageModel.totalSize}&likevalue=${likevalue}">尾页</a>
				第<span id="thispage">${requestScope.pageModel.pageIndex}</span>页
			</td>
		</tr>
	</table>
	<div style="height:10px;"></div>
</body>
</html>