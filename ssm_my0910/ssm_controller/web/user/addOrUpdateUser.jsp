<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统——编辑用户</title>
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
	src="<%=request.getContextPath()%>/js/ligerUI/js/plugins/ligerResizable.js"
	type="text/javascript"></script>
<link href="<%=request.getContextPath()%>/css/pager.css" type="text/css"
	rel="stylesheet" />
<script type="text/javascript">
	$(function () {
			//判断是新增提交还是修改提交
			var userid="${user.id}";
			if(userid !=""  && userid != null){

				//在编辑页面上登录名置灰
				$(":input[name=loginname]").attr("readonly","readonly");
				$("#userForm").attr("action","<%=request.getContextPath()%>/updateUser");
			}else {
				$("#userForm").attr("action", "<%=request.getContextPath()%>/addUser");
			}

		//校验登录名是否重复
		$("#loginname").change(function () {

			var val=$(this).val();
			val=$.trim(val);
			if(val!=""){
				var url="<%=request.getContextPath()%>/checkLoginname";
				var args={
					"loginname":val
				};
				$.post(url,args,function (data) {
					if(data.isflage == 0 ){
						alert(1);
						$("#meassage").empty().html("对不起，登录名已经被使用");
						$("#subtn").attr("disabled",true);
					}else {
						alert(20);
						$("#meassage").empty().html("登录名可以使用");
						$("#subtn").attr("disabled",false);
					}
				})
			}
		})
		//校验两次密码是否一致
		$(":input[name=password2]").change(function () {
			var passwd2=$(this).val();
			passwd2=$.trim(passwd2);
			var passwd=$(":input[name=password]").val();
			passwd=$.trim(passwd);
			if(passwd2!=passwd){
				$("#message2").empty().html("对不起，两个密码输入不一致");
				$("#subtn").attr("disabled",true);
			}else {
				$("#message2").empty();
				$("#subtn").attr("disabled",false);
			}
		});

	})
</script>


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
				src="<%=request.getContextPath()%>/images/pointer.gif">&nbsp;&nbsp;&nbsp;当前位置：用户管理
				&gt; 编辑用户</td>
			<td width="15" height="32"><img
				src="<%=request.getContextPath()%>/images/main_locright.gif"
				width="15" height="32"></td>
		</tr>
	</table>
	<table width="100%" height="90%" border="0" cellpadding="5"
		cellspacing="0" class="main_tabbor">
		<tr valign="top">
			<td>
				<form action=""
					name="userForm" id="userForm" method="post">
					<table width="100%" border="0" cellpadding="0" cellspacing="10"
						class="main_tab">
						<tr>
							<td class="font3 fftd">
								<table>
									 <input type="hidden" name="id"  value="${user.id}">
									<tr>
										<td class="font3 fftd">姓&nbsp;名：<input type="text"
											name="username" id="username" size="20" value="${user.username}"/></td>
										<td class="font3 fftd">登录名：&nbsp;<input name="loginname"
											id="loginname" size="20" value="${user.loginname}"/>
											<span id="meassage" style="color:red;"></span>
										</td>
									</tr>

									<tr>
										<td class="font3 fftd">密&nbsp;码：<input type="password" name="password"
											id="password" size="20" value="${user.password}"/></td>
										<td class="font3 fftd">重复密码：<input type="password" name="password2"
											id="password2" size="20" value="${user.password}"/>
										<span id="message2" style="color: red">g</span>
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td class="main_tdbor"></td>
						</tr>

						<tr>
							<td align="left" class="fftd">
								<input type="submit" id="subtn" value="提交">&nbsp;&nbsp;
								<input type="reset" value="重置"></td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
	<div style="height:10px;"></div>
</body>
</html>