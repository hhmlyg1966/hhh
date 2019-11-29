<%@ page language="java" import="java.util.*" contentType="text/html; charset=gb2312" pageEncoding="gb2312"%>
<%@ page import="com.scmpi.book.entity.Student" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'registEX.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
    显示注册信息：<hr>
    <%
    Student s=(Student)session.getAttribute("register");
    out.println("姓名"+s.getName());
    out.println("学号"+s.getNo());
    out.println("性别"+s.getSex());
    out.println("年龄"+s.getAge());
    
     %>
    
			
    
    
    
  </body>
</html>
