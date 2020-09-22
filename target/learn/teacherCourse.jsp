<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>已添加课程</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <td>课程方向</td>
                <td>课程介绍</td>
                <td>课程价格</td>
                <td>观看人数</td>
                <td>课程难度</td>
                <td>课程时长</td>
                <td>上传时间</td>
                <td>操作</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${teacherCourse}" var="var">
                <tr>
                    <td>${var.courseDirection.name}</td>
                    <td>${var.introduce}</td>
                    <td>${var.price}</td>
                    <td>${var.number}</td>
                    <td>${var.level}</td>
                    <td>${var.courseTime}</td>
                    <td>${var.createTime}</td>
                    <td>
                        <a href="addChapter.jsp?id=${var.id}">添加章节</a>
                    </td>
                    <td>
                        <a href="javascript:void(0)" onclick="addCollect(${var.id})" class="clt">收藏</a>
                    </td>
                    <td>
                        <a href="Teacher?method=deleteCourse&id=${var.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
        <tr>
            <td colspan="8">
                <a href="addCourse.jsp">新增课程</a>
            </td>
        </tr>
    </table>
    <p id="info"></p>
    <script src="jquery-1.12.4.js"></script>
    <script>
        var aj = jQuery.noConflict()
        aj(".clt").click(function () {
            this.css("onclick","delCollect(${var.id})")
            this.text("取消收藏")
        })
        function addCollect(id) {
            aj.ajax({
                url: "Collection?method=addCollection",
                dataType: "text",
                data:"id="+id,
                method: "get",
                success: function (data) {
                    if (data == "true") {
                        aj("#info").text("收藏成功")
                    }else {
                        aj("#info").text("收藏失败")
                    }
                }
            });
        }
        function delCollect(id) {
            aj.ajax({
                url: "Collection?method=deleteCollection",
                dataType: "text",
                data:"id="+id,
                method: "get",
                success: function (data) {
                    if (data == "true") {
                        aj("#info").text("取消收藏成功")
                    }else {
                        aj("#info").text("取消收藏失败")
                    }
                }
            });
        }
    </script>
</body>
</html>
