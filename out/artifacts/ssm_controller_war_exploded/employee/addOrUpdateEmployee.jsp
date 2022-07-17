<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>人事管理系统——编辑员工</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<%=request.getContextPath()%>/css/css.css" type="text/css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/ligerUI/skins/Aqua/css/ligerui-dialog.css" />
<link href="<%=request.getContextPath()%>/js/ligerUI/skins/ligerui-icons.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.0.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-migrate-1.2.1.js"></script>
<script src="<%=request.getContextPath()%>/js/ligerUI/js/core/base.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/ligerUI/js/plugins/ligerDrag.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/ligerUI/js/plugins/ligerDialog.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/js/ligerUI/js/plugins/ligerResizable.js" type="text/javascript"></script>
<link href="<%=request.getContextPath()%>/css/pager.css" type="text/css" rel="stylesheet" />
<script language="javascript" type="text/javascript" src="<%=request.getContextPath()%>/js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
	$(function () {
		//判断是新增提交还是修改提交
		var empid="${employee.id}";
		if(empid !=""  && empid != null){
			$("#employeeForm").attr("action","<%=request.getContextPath()%>/updateEmployee");
		}else {
			$("#employeeForm").attr("action", "<%=request.getContextPath()%>/addEmployee");
		}
	})

</script>

</head>
<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td height="10"></td>
		</tr>
		<tr>
			<td width="15" height="32">
				<img src="<%=request.getContextPath()%>/images/main_locleft.gif" width="15" height="32">
			</td>
			<td class="main_locbg font2">
				<img src="<%=request.getContextPath()%>/images/pointer.gif">
				&nbsp;&nbsp;&nbsp;当前位置：员工管理 &gt; 编辑员工
			</td>
			<td width="15" height="32">
				<img src="<%=request.getContextPath()%>/images/main_locright.gif" width="15" height="32">
			</td>
		</tr>
	</table>
	<table width="100%" height="90%" border="0" cellpadding="5" cellspacing="0" class="main_tabbor">
		<tr valign="top">
			<td>
				<form action="" id="employeeForm" method="post">
				
					<table width="100%" border="0" cellpadding="0" cellspacing="10" class="main_tab">
						<tr>
							<td class="font3 fftd">
								<table>
									<tr>
										<td class="font3 fftd">
											姓名：
											<input type="text" name="name" id="name" size="20" value="${employee.name}" />
										</td>
										<td class="font3 fftd">
											身份证号码：
											<input type="text" name="card_id" id="card_id" size="20" value="${employee.card_id}" />
										</td>
									</tr>
									<tr>
										<td class="font3 fftd">
											性别：
											<select name="sex" id="selectsex" style="width: 167px;">
												<option value="">--请选择性别--</option>
												<option value="1">男</option>
												<option value="0">女</option>
											</select>
										</td>
										<td class="font3 fftd">
											职&nbsp;&nbsp;&nbsp;位：
											<select name="job_id" style="width: 167px;" id="selectjob_id">
												<option value="">--请选择职位--</option>
												<c:forEach items="${requestScope.selectjobs}" var="job">
													<option value="${job.id}">${job.name}</option>
												</c:forEach>
											</select>
										</td>
									</tr>
									<tr>
										<td class="font3 fftd">
											学历：
											<input name="education" id="education" size="20" value="${employee.education}" />
										</td>
										<td class="font3 fftd">
											邮&nbsp;&nbsp;&nbsp;箱：
											<input name="email" id="email" size="20" value="${employee.email}" />
										</td>
									</tr>
									<tr>
										<td class="font3 fftd">
											手机：
											<input name="phone" id="phone" size="20" value="${employee.phone}" />
										</td>
										<td class="font3 fftd">
											电&nbsp;&nbsp;&nbsp;话：
											<input name="tel" id="tel" size="20" value="${employee.tel}" />
										</td>
									</tr>

								</table>
							</td>
						</tr>
						<tr>
							<td class="main_tdbor"></td>
						</tr>

						<tr>
							<td class="font3 fftd">
								政治面貌：
								<input name="party" id="party" size="40" value="${employee.party}" />
								&nbsp;&nbsp; QQ&nbsp;号码：
								<input name="qq_num" id="qq_num" size="20" value="${employee.qq_num}" />
							</td>
						</tr>
						<tr>
							<td class="main_tdbor"></td>
						</tr>

						<tr>
							<td class="font3 fftd">
								联系地址：
								<input name="address" id="address" size="40" value="${employee.address}" />
								&nbsp;&nbsp; 邮政编码：
								<input name="post_code" id="post_code" size="20" value="${employee.post_code}" />
							</td>
						</tr>
						<tr>
							<td class="main_tdbor"></td>
						</tr>

						<tr>
							<td class="font3 fftd">
								出生日期：
								<input onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'});" name="birthday" id="birthday" size="40" value="${employee.birthday}" />
								&nbsp;&nbsp; 民&nbsp;&nbsp;族：
								<input name="race" id="race" size="20" value="${employee.race}" />
							</td>
						</tr>
						<tr>
							<td class="main_tdbor"></td>
						</tr>

						<tr>
							<td class="font3 fftd">
								所学专业：
								<input name="speciality" id="speciality" size="40" value="${employee.speciality}" />
								&nbsp;&nbsp; 爱&nbsp;&nbsp;好：
								<input name="hobby" id="hobby" size="20" value="${employee.hobby}" />
							</td>
						</tr>
						<tr>
							<td class="main_tdbor"></td>
						</tr>

						<tr>
							<td class="font3 fftd">
								备&nbsp;&nbsp;注：
								<input name="remark" id="remark" size="40" value="${employee.remark}" />
								&nbsp;&nbsp;所属部门：
								<select name="dept_id" id="selectdept_id" style="width: 167px;">
									<option value="">--请选择部门--</option>
									<c:forEach items="${requestScope.selectdepts}" var="dept">
										<option value="${dept.id}">${dept.name}</option>
									</c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td class="main_tdbor"></td>
						</tr>

						<tr>
							<td align="left" class="fftd">
								<input type="submit" value="提交">
								&nbsp;&nbsp;
								<input type="reset" value="取消 ">
							</td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
	<div style="height: 10px;"></div>
</body>
</html>