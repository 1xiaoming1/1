<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加课程</title>
</head>
<body>
    <form>
        <p>
            <label>课程名字</label>
            <input type="text" name="name" id="name">
        </p>
        <p>
            <label>课程方向</label>
            <select name="direction">
                <option value="java">java</option>
                <option value="C#">C#</option>
                <option value="C++">C++</option>
                <option value="python">python</option>
            </select>
        </p>
        <p>
            <label>课程简介</label>
            <textarea name="introduce" id="introduce"></textarea>
        </p>
        <p>
            <label>课程价格</label>
            <input type="text" name="price" id="price">
        </p>
        <p>
            <label>观看人数</label>
            <input type="text" name="number" id="number">
        </p>
        <p>
            <label>课程难度</label>
            <select name="level">
                <option value="1">简单</option>
                <option value="2">一般</option>
                <option value="3">困难</option>
            </select>
        </p>
        <p>
            <label>课程时长</label>
            <input type="text" name="courseTime" id="courseTime" placeholder="单位：分">
        </p>
        <p>
            <label></label>
            <input type="submit" value="添加">
        </p>
    </form>
    <p id="info"></p>
    <script src="jquery-1.12.4.js"></script>
    <script>
        $(document).ready(function () {
            $(":submit").click(function (event) {
                event.preventDefault();
                $.ajax({
                    url:"Teacher?method=addCourse",
                    datatype:"text",
                    data:$("form").serialize(),
                    method:"post",
                    success:function (data) {
                        if(data=="true"){
                            $("#info").text("添加成功")
                        }
                    }
                });
            });
        });
    </script>
</body>
</html>
