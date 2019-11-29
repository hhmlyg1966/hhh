<%@ page language="java" import="java.util.*" contentType="text/html; charset=gb2312" pageEncoding="gb2312"%>
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
    <div id="registable">
			<form action="servlet/RegistEXServlet" method="post">
				<table border="1">
					<tr>
						<td>
							姓名
						</td>
						<td>
							<input type="text" name="sName" />
						</td>
						<td>
							<font color="red">*
							</font>
						</td>
					</tr>
					
					<tr>
						<td>
							学号
						</td>
						<td>
							<input type="text" name="sno" />
						</td>
						<td>
							<font color="red">*
							</font>
						</td>
					</tr>
					<tr>
						<td>
							性别
						</td>
						<td>
							<input type="text" name="sex" />
						</td>
						<td>
							<font color="red">*
							</font>
						</td>
					</tr>
					<tr>
						<td>
							年龄
						</td>
						<td>
							<input type="text" name="age" />
						</td>
						<td>
							<font color="red">*
							</font>
						</td>
					</tr>
					
					<tr>
						<td colspan="3" align="center">
							<input type="submit" value="注册" />
						</td>
					</tr>
				</table>

			</form>
		</div>
    
    
    
  </body>
</html>
