<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/1/22
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>修改用户</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">修改联系人</h3>
    <form action="${pageContext.request.contextPath}/updateUserServlet" method="post">
        <%--隐藏域--%>
        <input type="hidden" name="id" value="${user.id}">
        <div class="form-group">
            <label for="username">姓名：</label>
            <input type="text" class="form-control" value="${user.username}" id="username" name="username" placeholder="请输入姓名" />
        </div>
        <div class="form-group">
            <label for="major">专业：</label>
            <input type="text" class="form-control" value="${user.major}" id="major" name="major"  placeholder="请输入专业">
        </div>

        <div class="form-group">
            <label for="cla">班级：</label>
            <input type="text" class="form-control" value="${user.cla}" id="cla" name="cla" placeholder="请输入班级">
        </div>


        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <%--<input class="btn btn-default" type="reset" value="重置" />--%>
            <input class="btn btn-default" type="button" value="返回" onclick="javascript:history.go(-1);"/>
        </div>
    </form>
</div>
</body>
</html>
