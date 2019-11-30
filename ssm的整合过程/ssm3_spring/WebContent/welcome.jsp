<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>全注解式开发</title>
</head>
<body>
	<h1>ssm注解式开发</h1>
	<h2>修改spring的配置文件，修改IOC的注解</h2>
	步骤：修改spring-service.xml,添加service注册组件扫描器
	事物管理器：spring-tx.xml,AOP事物通知配置不需要了，添加注册事务注解驱动
	service实现类中添加注解，让其可以进入到service类与Dao类
	<h1>将spring改为注解分两步：</h1>
	步骤：1.将service改为注解,完成dao的注入
	<br> 2.将事物以注解的方式注入到service层
</body>
</html>