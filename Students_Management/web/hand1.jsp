<%--
  Created by IntelliJ IDEA.
  User: yifeng
  Date: 2020/1/20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>管理员导航栏</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="js/bootstrap.min.js"></script>
    <style>
        .paddtop{
            background-color: #b9def0;
        }
        .search-btn{
            float: left;
            border: 2px solid dodgerblue;
            width: 90px;
            height: 35px;
            background-color: dodgerblue;
            text-align: center;
            line-height: 35px;
            margin-top: 15px;
        }
        .search-input{
            float: left;
            border: 2px solid dodgerblue;
            width: 400px;
            height: 35px;
            padding-left: 5px;
            margin-top: 15px;
        }
        .t1{
            padding-left: 15px;
            float: left;
        }
        .t2{
            margin-top: 15px;
            text-align: center;
            float: left;
            font-size: 20px;
        }
        .t3{
            float: right;
            padding-right: 20px;
            margin-bottom: 10px;
            padding-bottom: 10px;
        }
    </style>
</head>
<body>
    <div class="row paddtop">
        <div class="col-md-1 t1"><img src="images/sh.jpg" width="60px"></div>
        <div class="col-md-6 t2">山东师范大学学生选课系统管理员页面</div>
        <div class="col-md-5 t3">
            <input class="search-input" placeholder="看看">
            <a class="search-btn" href="#">搜索</a>
        </div>
    </div>
    <div class="row">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="${pageContext.request.contextPath}/index.jsp">首页</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li><a href="${pageContext.request.contextPath}/findUserByPageServlet?currentPage=1&rows=5">学生管理 <span class="sr-only">(current)</span></a></li>
                        <li><a href="${pageContext.request.contextPath}/teacherListServlet">老师管理</a></li>
                        <li><a href="${pageContext.request.contextPath}/courseListServlet">课程管理</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span>${user.username}同学，欢迎</span></a>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
    </div>
</body>
</html>