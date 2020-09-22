<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
    <form action="LocalUploadServlet" method="post" enctype="multipart/form-data">
        <P>
            <label>文件名</label>
            <input type="text" name="key" id="key">
        </P>
        <P>
            <label>点击上传</label>
            <input type="file" name="video" id="video">
        </P>
        <p>
            <label> </label>
            <input type="submit" value="提交">
        </p>
    </form>
</body>
</html>
