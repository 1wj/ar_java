<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统 ——后台管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<%=request.getContextPath()%>/css/css.css" type="text/css"
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
				src="<%=request.getContextPath()%>/images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：后台管理
				&gt; 当前用户</td>
			<td width="15" height="32"><img
				src="<%=request.getContextPath()%>/images/main_locright.gif"
				width="15" height="32"></td>
		</tr>
	</table>
	<table width="100%" height="90%" border="0" cellpadding="10"
		cellspacing="0" class="main_tabbor">
		<tr valign="top">
			<td>
				<table width="100%" border="0" cellpadding="0" cellspacing="10"
					class="main_tab">
					<tr>
						<td class="font3 fftd">用户姓名：<font color="red" size="2">${sessionScope.user_session.username}</font></td>
					</tr>
					<tr>
						<td class="main_tdbor"></td>
					</tr>
					<tr>
						<td class="font3 fftd">创建时间：<font color="red" size="2">
								${sessionScope.user_session.createDate} </font>
						</td>
					</tr>
					<tr>
						<td></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<div style="height:10px;"></div>
</body>
</html>