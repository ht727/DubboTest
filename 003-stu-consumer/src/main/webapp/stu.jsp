<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/6/28
  Time: 10:28
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
    <title>student</title>
</head>
<body>
<h1>result:</h1>
<h2>student_id:${student.id}</h2>
<h2>student_name:${student.name}</h2>
<h2>student_age:${student.age}</h2>
</body>
</html>
