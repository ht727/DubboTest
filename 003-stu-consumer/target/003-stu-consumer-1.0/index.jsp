<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/6/28
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>consumer</title>
</head>
<body>
<h3>"i am a consumer</h3>
</body>
</html>
