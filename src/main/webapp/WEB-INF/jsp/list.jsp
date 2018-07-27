<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <script type="text/javascript" src="scripts/jquery.min.js">
function request_json(){  
    $.ajax({  
        type:"post",  
        url:"${pageContext.request.contextPath }/user/list.action",  
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
登陆成功
</body>
</html>