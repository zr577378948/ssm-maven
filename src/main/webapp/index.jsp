<%--
  Created by IntelliJ IDEA.
  User: zr
  Date: 2018/5/7
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<%request.getRequestDispatcher("queryAll.handler").forward(request, response); %>
<table border="1" cellspacing="0" cellpadding="0">
    <thead>
    <tr>
        <td>用户名</td>
        <td>密码</td>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${username}</td>
        <td>${password}</td>
    </tr>

    </tbody>

</table>
</body>
</html>
