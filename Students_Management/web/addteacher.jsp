<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/1/22
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- HTML5文档-->
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加用户</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <center><h3>添加联系人页面</h3></center>
    <form action="${pageContext.request.contextPath}/addTeacherServlet" method="post">
        <div class="form-group">
            <label for="workid">工号：</label>
            <input type="text" class="form-control" id="workid" name="workid" placeholder="请输入工号">
        </div>


        <div class="form-group">
            <label for="workname">姓名：</label>
            <input type="text" class="form-control" id="workname" name="workname" placeholder="请输入姓名">
        </div>

        <div class="form-group">
            <label for="acollege">学院：</label>
            <input type="text" class="form-control" id="acollege" name="acollege" placeholder="请输入学院">
        </div>

        <div class="form-group">
            <label for="asystem">系：</label>
            <input type="text" class="form-control" id="asystem" name="asystem" placeholder="请输入系">
        </div>
        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-default" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回" onclick="javascript:history.go(-1);"/>
        </div>
    </form>
</div>
</body>
</html>