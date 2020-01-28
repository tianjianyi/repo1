<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/1/22
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="hand1.jsp"%>
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
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
    <script>
        function deleteUser(id) {
            if(confirm("您确定要删除这条数据吗？")) {
                location.href = "${pageContext.request.contextPath}/delTeacherServlet?id="+id;
            }
        }
        window.onload = function() {
            document.getElementById("delSelected").onclick = function () {
                if(confirm("您确定要删除所有选中数据吗？")){
                    var cbs = document.getElementsByName("uid");
                    for (var i = 0; i < cbs.length; i++){
                        if(cbs[i].checked)
                            document.getElementById("form").submit();
                    }

                }

            }
            document.getElementById("firstCb").onclick = function() {
                var cbs = document.getElementsByName("uid");
                for (var i = 0; i < cbs.length; i++){
                    cbs[i].checked = this.checked;
                }
            }
        }

    </script>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">教师信息列表</h3>
    <div style="float: left">
        <form class="form-inline" method="post" action="${pageContext.request.contextPath}/teacherListServlet">
            <div class="form-group">
                <label for="exampleInputName2">工号</label>
                <input type="text" value="${condition.workid[0]}" name ="workid" class="form-control" id="exampleInputName2">
            </div>
            <div class="form-group">
                <label for="exampleInputName3">姓名</label>
                <input type="text" value="${condition.workname[0]}" name = "workname" class="form-control" id="exampleInputName3">
            </div>
            <div class="form-group">
                <label for="exampleInputName5">隶属学院</label>
                <input type="text" value="${condition.college[0]}" name = "college" class="form-control" id="exampleInputName5">
            </div>


            <button type="submit" class="btn btn-default">查询</button>
        </form>
    </div>
    <div style="float: right; margin: 6px">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/addteacher.jsp">添加联系人</a>
    </div>
    <form id = "form" action="${pageContext.request.contextPath}/delSelectedTeacherServlet" method="post">
        <table border="1" class="table table-bordered table-hover">
            <tr class="success">
                <th><input type="checkbox" id="firstCb"></th>
                <th>编号</th>
                <th>工号</th>
                <th>姓名</th>
                <th>学院</th>
                <th>院系</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${teachers}" var="user" varStatus="s">
                <tr>
                    <th><input type="checkbox" name="uid" value="${user.workid}"></th>
                    <td>${s.count}</td>
                    <td>${user.workid}</td>
                    <td>${user.workname}</td>
                    <td>${user.acollege}</td>
                    <td>${user.asystem}</td>
                    <td>
                        <a class="btn btn-default btn-sm" href="javascript:deleteUser(${user.workid});">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </form>


</div>
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>

<!-- pop-up-box-js-file -->
<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
</body>
</html>