<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<%=request.getContextPath()%>/css/css.css" type="text/css"
	rel="stylesheet" />
</head>
<frameset rows="80,*" cols="*" frameborder="no" border="0"
	framespacing="0">
	<frame src="<%=request.getContextPath()%>/top.jsp" name="title"
		scrolling="no" noresize="noresize">
	<frameset cols="220,*" frameborder="no" border="0" framespacing="0">
		<frame src="<%=request.getContextPath()%>/left.jsp" name="tree"
			scrolling="no" marginheight="0" marginwidth="0">
		<frame src="<%=request.getContextPath()%>/right.jsp" name="main"
			scrolling="yes" frameborder="0" marginwidth="0" marginheight="0"
			noresize="noresize">
	</frameset>
</frameset>
<body>
</body>
</html>