<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统——编辑职位</title>
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

</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td height="10"></td>
		</tr>
		<tr>
			<td width="15" height="32"><img
				src="<%=request.getContextPath()%>/images/main_locleft.gif"
				width="15" height="32"></td>
			<td class="main_locbg font2"><img
				src="<%=request.getContextPath()%>/images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：职位管理
				&gt; 添加职位</td>
			<td width="15" height="32"><img
				src="<%=request.getContextPath()%>/images/main_locright.gif"
				width="15" height="32"></td>
		</tr>
	</table>
	<table width="100%" height="90%" border="0" cellpadding="5"
		cellspacing="0" class="main_tabbor">
		<tr valign="top">
			<td>
				<form action="" id="jobForm" method="post">
		     	 <!-- 隐藏表单，flag表示添加标记 -->
		  <table width="100%" border="0" cellpadding="0" cellspacing="10" class="main_tab">
		    <tr><td class="font3 fftd">
		    	<table>
		    		<tr>
		    			<td class="font3 fftd">职位名称：<input type="text" name="name" id="name" value="" size="20"/></td>
		    			<td class="font3 fftd">详细描述：<input type="text" name="remark" id="remark" value="" size="20"/></td>
		    		</tr>
		    	</table>
		    </td></tr>
			<tr><td class="main_tdbor"></td></tr>
			<tr><td align="left" class="fftd"><input type="submit" value="提交">&nbsp;&nbsp;<input type="reset" value="取消 "></td></tr>
		  </table>
		 </form>
			</td>
		</tr>
	</table>
	<div style="height:10px;"></div>
</body>
</html>