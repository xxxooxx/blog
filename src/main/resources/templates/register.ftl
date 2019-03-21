

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>注册 - Mtons</title>
    <meta name="keywords" content="mtons,$!{site_keywords}">
    <meta name="description" content="$!{site_description}">
    <!-- v3 -->
    <link rel="stylesheet" href="/assets/vendors/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assets/css/login.css">
    <link rel="stylesheet" href="/assets/vendors/animate/animate.min.css">

    <!-- JavaScript -->
    <script type="text/javascript" src="/assets/js/jquery.min.js"></script>
    <script type="text/javascript" src="/assets/js/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="/assets/vendors/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/assets/js/jquery.validate.min.js"></script>
    <script type="text/javascript" src="/assets/js/messages_zh.min.js"></script>

    <!-- Favicons -->
    <link rel="apple-touch-icon-precomposed" href="http://mtons.com/assets/images/logo/m99.png"/>
    <link rel="shortcut icon" href="http://mtons.com/assets/images/logo/m.png"/>

</head>
<body class="sign">
<div class="login">
    <a href="/index">
        <img src="/assets/images/logo/m90.png" height="72" width="72">
    </a>
    <h1>Mtons, 轻松分享你的兴趣</h1>
    <a href="/login" class="signup-link gapps"><span>已有账号, 登录</span></a>
    <hr>
    <form action="reg" method="post">
        <div id="message">

        </div>
        <label for="id_email">用户名:</label>
        <div id="id_email">
            <input maxlength="18" class="form-control border" name="username" value="" placeholder="用户名" type="text" data-required data-conditional="username" data-description="username" data-describedby="message">
        </div>
        <label for="id_name">昵称:</label>
        <div id="id_name">
            <input maxlength="9" class="form-control border" name="name" value="" placeholder="昵称" type="text" data-required>
        </div>
        <label for="id_name">邮箱:</label>
        <div id="id_name">
            <input maxlength="64" class="form-control border" name="email" value="" placeholder="邮箱地址" type="text" data-required data-conditional="email" data-description="email" data-describedby="message">
        </div>
        <label for="id_password">密码:</label>
        <div id="id_password">
            <input id="password" class="form-control border" maxlength="18" name="password" placeholder="密码" type="password" data-required>
        </div>
        <label for="id_password2">确认密码:</label>
        <div id="id_password2">
            <input maxlength="18" class="form-control border" name="password2" placeholder="请再输入一次密码" type="password" data-required data-conditional="confirm" data-describedby="message" data-description="confirm">
        </div>
        <input type="submit" class="btn btn-success border" value="注 册">
    </form>
</div>

<script type="text/javascript">
    $(function(){
    	 $("form").validate({
    		    rules: { 
    		      username: {
    		        required: true,
    		        minlength: 2
    		      },
    		      name:{
    		    	  required: true,
    		    	  minlength: 2  
    		      },
    		      password: {
    		        required: true,
    		        minlength: 5
    		      },
    		      password2: {
    		        required: true,
    		        minlength: 5,
    		        equalTo: "#password"
    		      },
    		      email: {
    		        required: true,
    		        email: true
    		      },

    		    },
    		    messages: {
    		      firstname: "请输入您的名字",
    		      lastname: "请输入您的姓氏",
    		      username: {
    		        required: "请输入用户名",
    		        minlength: "用户名必需由两个字母组成"
    		      },
    		      password: {
    		        required: "请输入密码",
    		        minlength: "密码长度不能小于 5 个字母"
    		      },
    		      password2: {
    		        required: "请输入密码",
    		        minlength: "密码长度不能小于 5 个字母",
    		        equalTo: "两次密码输入不一致"
    		      },
    		      email: "请输入一个正确的邮箱",
    		     },
    		     errorPlacement: function(error, element) {
    		    	 cotent:error[0].innerHTML
    		    	    );
					 element.click();
					 element.closest('div').removeClass('has-success').addClass('has-error');
    		    	},    		     
    		     success: function(a,b) {
    		    	   
    		    	}
    		    })      
        
    })
</script>


    <p class="small">
     <a href="http://www.miitbeian.gov.cn/" target="_blank">
    </p>

    <script type="text/javascript">
        //<!CDATA[
        var bodyBgs = [];
        bodyBgs[0] = "/assets/images/first/bg-1.jpg";
        bodyBgs[1] = "/assets/images/first/bg-2.jpg";
        bodyBgs[2] = "/assets/images/first/bg-3.jpg";
        bodyBgs[3] = "/assets/images/first/bg-4.jpg";
        bodyBgs[4] = "/assets/images/first/bg-5.jpg";
        bodyBgs[5] = "/assets/images/first/bg-9.jpg";
        var randomBgIndex = Math.round( Math.random() * 5 );
        //输出随机的背景图
        document.write('<style>body{background:url(' + bodyBgs[randomBgIndex] + ') no-repeat 100% 0}</style>');
        //]]>
    </script>
</body>
</html>

