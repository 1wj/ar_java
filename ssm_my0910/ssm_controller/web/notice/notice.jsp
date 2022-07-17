<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统 ——公告管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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


		//控制首页时上一页失效，尾页时下一页失效
	
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
				src="<%=request.getContextPath()%>/images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：公告管理
				&gt; 公告查询</td>
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
							<form name="noticeform" method="post" id="noticeform" action="">
								<table width="100%" border="0" cellpadding="0" cellspacing="0">
									<tr>
										<td class="font3"><input type="hidden" name="pageIndex"
											value="1" /><input type="text" name="likevalue"
											value=""/><input type="submit" value="搜索" /></td>
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
						<td>公告ID</td>
						<td>公告名称</td>
						<td>公告内容</td>
						<td>创建时间</td>
						<td>公告人</td>
						<td align="center" colspan=2>操作</td>
					</tr>
				
						<tr id="data_${notice.id }" align="center" class="main_trbg">
							
						</tr>
				
				</table>
			</td>
		</tr>
		<!-- 分页标签 -->
		<tr valign="top">
			<td align="center" class="font3">总记录数 <span id="count"></span>条
				共<span id="pages"></span>页 <a id="firstPage" href="">首页</a>
				<a id="previouspage" href="">上一页</a>
				<span id="nextpagespan"><a id="nextpage" href="">下一页</a> </span> 
				<a id="last" href="">尾页</a>
				第<span id="thispage"></span>页
			</td>
		</tr>
	</table>
	<div style="height:10px;"></div>
</body>
</html>