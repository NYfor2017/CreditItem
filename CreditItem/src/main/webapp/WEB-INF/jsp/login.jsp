<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<title>登录页</title>
  <script type="text/javascript" src="scripts/jquery.min.js">

function request_json(){  
    $.ajax({  
        type:"post",  
        url:"${pageContext.request.contextPath }/user/login.action",  
        contentType:"application/json;charset=utf-8",  
        data:'{"name":"测试商品","price":99.9}',  
        success:function(data){  
            alert(data);  
        }  
    });  
} 
</script>
</head>

<body>
	<form action="login" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>密 码：</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="登录" /></td>
				<td></td>
			</tr>
		</table>
	</form>

</body>
</html>
