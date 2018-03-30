<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	欢迎 ${loginUser.user_name }  手机号:${loginUser.phone }  邮箱：${loginUser.email } 
	性别: ${loginUser.sex }  时间:${loginUser.create_time }
</body>
</html>