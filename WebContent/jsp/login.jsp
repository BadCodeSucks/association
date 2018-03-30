<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<form action="<%=basePath%>/user/login" method="post">
		账号:<input type="text" name="account"/><br/>
		密码:<input type="password" name="password"/><br/>
		用户名：<input type="text" name="userName"/><br/>
		手机号：<input type="text" name="phone"/><br/>
		邮箱：<input type="text" name="email"/><br/>
		性别：<select name="sex">
			<option value="1">男</option>
			<option value="0">女</option>
		</select><br/>
		
		<button type="submit">提交</button>
	</form>
</body>
</html>