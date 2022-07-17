<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hrm1.0</title>
<link href="<%=request.getContextPath()%>/js/metronic/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/js/metronic/plugins/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/js/metronic/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/js/metronic/css/style-metro.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/js/metronic/css/style.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/js/metronic/css/style-responsive.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/js/metronic/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color" />
<link href="<%=request.getContextPath()%>/js/metronic/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL STYLES -->
<link href="<%=request.getContextPath()%>/js/metronic/css/pages/lock.css" rel="stylesheet" type="text/css" />
<!-- END PAGE LEVEL STYLES -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.0.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-migrate-1.2.1.js"></script>
<link href="<%=request.getContextPath()%>/js/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath()%>/js/ligerUI/js/core/base.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/ligerUI/js/plugins/ligerDialog.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/ligerUI/js/plugins/ligerDrag.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/ligerUI/js/plugins/ligerResizable.js" type="text/javascript"></script>
<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
<script src="<%=request.getContextPath()%>/js/metronic/plugins/jquery-ui/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/metronic/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/metronic/plugins/breakpoints/breakpoints.js" type="text/javascript"></script>
<!-- IMPORTANT! jquery.slimscroll.min.js depends on jquery-ui-1.10.1.custom.min.js -->
<script src="<%=request.getContextPath()%>/js/metronic/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="<%=request.getContextPath()%>/js/metronic/plugins/backstretch/jquery.backstretch.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<script src="<%=request.getContextPath()%>/js/metronic/scripts/app.js"></script>
<script src="<%=request.getContextPath()%>/js/metronic/scripts/lock.js"></script>
<script>
	$(function() {
		App.init();
		Lock.init();
	});
</script>
</head>
<body>
	<div class="page-lock">
		<div class="page-logo" style="margin-bottom: 2px">
			<font style="font-size: 22px; color: #FFCC00">Hrm</font>
		</div>
		<form action="<%=request.getContextPath()%>/login" method="post" id="loginForm">
			<div class="page-body">
				<img class="page-lock-img" src="<%=request.getContextPath()%>/js/metronic/img/profile/logo2.jpg" alt="">
				<div class="page-lock-info">
					<span>&nbsp;</span>
					<span style="padding-top: 5px">
						<font color="red">${requestScope.message}</font>
					</span>
					<div class="control-group">
						<div class="controls">
							<div class="input-icon left">
								<i class="icon-user"></i>
								<input class="m-wrap placeholder-no-fix" type="text" placeholder="帐号" id="loginname" name="loginname" value="${loginname}">
							</div>
						</div>
					</div>
					<div class="control-group">
						<div class="controls">
							<div class="input-icon left">
								<i class="icon-lock"></i>
								<input class="m-wrap placeholder-no-fix" type="password" placeholder="密码" id="password" name="password" value="${password}">
							</div>
						</div>
					</div>
				</div>

				<div class="relogin">
					<!-- 单击登录 -->
					<button type="submit" id="login-submit-btn" class="btn green" style="margin-left: 20px">
						登录
						<i class="m-icon-swapright m-icon-white"></i>
					</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>