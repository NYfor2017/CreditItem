<html>
<body>
<h2>Hello World!</h2>
  <script type="text/javascript" src="scripts/jquery.min.js">
function request_json(){  
    $.ajax({  
        type:"post",  
        url:"${pageContext.request.contextPath }/admin/login.action",  
        contentType:"application/json;charset=utf-8",  
        data:'aa',  
        success:function(data){  
            alert(data);  
        }  
    });  
} 
</script>
</body>
</html>
