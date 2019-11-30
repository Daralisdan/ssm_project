<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>全配置式开发</title>
</head>
<body>
	<h1>全配置式开发</h1>
	<form action="${pageContext.request.contextPath }/test/register.do"
		method="POST">
		姓名：<input type="text" name="name" /><br> 年龄：<input type="text"
			name="age" /><br> <input type="submit" name="注册" /><br>
	</form>
</body>
</html>