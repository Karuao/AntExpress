<%--
  Created by IntelliJ IDEA.
  User: Wiggin
  Date: 2018/5/16
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap-table/1.12.1/bootstrap-table.min.css">
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-table/1.12.1/bootstrap-table.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-table/1.11.0/locale/bootstrap-table-zh-CN.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table data-toggle="table" data-url="http://localhost:8080/employee?employeeId=1">
    <thead>
    <tr>
        <th data-field="employeeId">employeeId</th>
        <th data-field="account">account</th>
        <th data-field="password">password</th>
        <th data-field="gender">gender</th>
        <th data-field="phoneNo">phoneNo</th>
        <th data-field="email">email</th>
        <th data-field="salary">salary</th>
        <th data-field="departmentId">departmentId</th>
        <th data-field="occupationId">occupationId</th>
        <th data-field="createDateTime">createDateTime</th>
        <th data-field="modifyDateTime">modifyDateTime</th>
    </tr>
    </thead>
</table>
</body>
</html>
