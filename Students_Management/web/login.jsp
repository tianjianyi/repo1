<%--
  Created by IntelliJ IDEA.
  User: yifeng
  Date: 2020/1/22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    <!-- metatags-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- Meta tag Keywords -->
    <!-- Custom-Style-Sheet -->
    <link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/><!--style_sheet-->
    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" property="" />
    <link rel="stylesheet" href="css/font-awesome.css"> <!-- Font-Awesome_Icons-CSS -->
    <!--//Custom-Style-Sheet -->
    <!--online_fonts-->
    <link href="http://maxcdn.bootstrapcdn.com/css?family=Audiowide" rel="stylesheet">
    <link href="http://maxcdn.bootstrapcdn.com/css?family=Montserrat+Alternates" rel="stylesheet">
    <!--//online_fonts-->
</head>
<body>
<div class="w3l-head">
    <h1>山东师范大学教务管理系统</h1>
</div>
<div class="w3l-main">
    <div class="w3l-left-side">

        <div class="flexslider">
            <ul class="slides">
                <li>
                    <img src="images/g5.jpg" alt="image"/>
                </li>
                <li>
                    <img src="images/g2.jpg" alt="image"/>
                </li>
                <li>
                    <img src="images/g3.jpg" alt="image"/>
                </li>
                <li>
                    <img src="images/g4.jpg" alt="image"/>
                </li>
                <li>
                    <img src="images/g1.jpg" alt="image"/>
                </li>
            </ul>
        </div>
    </div>

    <div class="w3l-rigt-side">
        <form action="#" method="post">
            <div class="w3l-signin">
                <a class="w3_play_icon1" href="#small-dialog1"> 学生登录</a>
            </div>
            <div class="w3l-signup">
                <a class="w3_play_icon1" href="#small-dialog2"> 管理员登录</a>
            </div>
            <div class="clear"></div>
        </form>
    </div>
    <div class="clear"></div>
</div>

<!--sign in form -->
<div id="small-dialog1" class="mfp-hide">
    <div class="wthree-container">
        <div class="wthree-form">
            <div class="agileits-2">
                <h2>学生用户登录</h2>
            </div>
            <form action="${pageContext.request.contextPath}/loginServlet" method="post">
                <div class="w3-user">
                    <span><i class="fa fa-user-o" aria-hidden="true"></i></span>
                    <input type="text" name="id" placeholder="请输入学号" required="">
                </div>
                <div class="clear"></div>
                <div class="w3-psw">
                    <span><i class="fa fa-key" aria-hidden="true"></i></span>
                    <input type="password" name="password" placeholder="请输入密码" required="">
                </div>
                <div class="clear"></div>
                <div class="signin">
                    <input type="submit" value="sign in">
                </div>
                <div class="clear"></div>
            </form>
        </div>
    </div>
</div>
<!--sign in form -->
<!-- for register popup -->

<!--sign up form -->
<div id="small-dialog2" class="mfp-hide">
    <div class="wthree-container">
        <div class="wthree-form">
            <div class="agileits-2">
                <h2>管理员用户登录</h2>
            </div>
            <form action="${pageContext.request.contextPath}/loginServlet" method="post">
                <div class="w3-user">
                    <span><i class="fa fa-user-o" aria-hidden="true"></i></span>
                    <input type="text" name="id" placeholder="请输入学号" required="">
                </div>
                <div class="clear"></div>
                <div class="w3-psw">
                    <span><i class="fa fa-key" aria-hidden="true"></i></span>
                    <input type="password" name="password" placeholder="请输入密码" required="">
                </div>
                <div class="clear"></div>
                <div class="signin">
                    <input type="submit" value="sign in">
                </div>
                <div class="clear"></div>
            </form>
        </div>
    </div>
</div>
<!--sign in form -->
<!-- //for register popup -->
<footer>Copyright &copy; yifeng有限公司.<br/>
        项目负责人:yifeng<br/>
        联系我们:2397398239@qq.com
</footer>


<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>

<!-- pop-up-box-js-file -->
<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
<!--//pop-up-box-js-file -->
<script>
    $(document).ready(function() {
        $('.w3_play_icon,.w3_play_icon1,.w3_play_icon2').magnificPopup({
            type: 'inline',
            fixedContentPos: false,
            fixedBgPos: true,
            overflowY: 'auto',
            closeBtnInside: true,
            preloader: false,
            midClick: true,
            removalDelay: 300,
            mainClass: 'my-mfp-zoom-in'
        });

    });
</script>
<!-- flexSlider -->
<script defer src="js/jquery.flexslider.js"></script>
<script type="text/javascript">
    $(window).load(function(){
        $('.flexslider').flexslider({
            animation: "slide",
            start: function(slider){
                $('body').removeClass('loading');
            }
        });
    });
</script>
<!-- //flexSlider -->
</body>
</html>