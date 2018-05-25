<%--
  Created by IntelliJ IDEA.
  User: Wiggin
  Date: 2018/5/21
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <%String contextPath = request.getContextPath();%>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="<%=contextPath%>/css/theme.css" type="text/css"> </head>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap-table/1.12.1/bootstrap-table.min.css">
<body class="border border-primary" >
<nav class="navbar navbar-expand-md bg-primary navbar-dark">
    <div class="container">
        <a class="navbar-brand" href="#">
            <i class="fa d-inline fa-lg fa-cloud"></i>
            <b>AntExpress</b>
        </a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbar2SupportedContent">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse text-center justify-content-end" id="navbar2SupportedContent">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="#">
                        <i class="fa d-inline fa-lg fa-envelope-o"></i> Contacts</a>
                </li>
            </ul>
            <a class="btn navbar-btn ml-2 text-white btn-secondary">
                <i class="fa d-inline fa-lg fa-user-circle-o"></i> Sign out</a>
        </div>
    </div>
</nav>
<div class="py-5">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-4">
                        <ul class="nav nav-pills flex-column">
                            <li class="nav-item border border-primary p-3">
                                <a href="" class="active nav-link" data-toggle="pill" data-target="#tabone">empty</a>
                            </li>
                            <li class="nav-item border border-primary p-3">
                                <a class="nav-link" href="" data-toggle="pill" data-target="#tabtwo">empty</a>
                            </li>
                            <li class="nav-item border border-primary p-3">
                                <a href="" class="nav-link" data-toggle="pill" data-target="#tabthree">empty</a>
                            </li>
                        </ul>
                    </div>
                    <div class="col-8 border border-primary">
                        <div class="tab-content">
                            <div class="tab-pane fade show active" id="tabone" role="tabpanel">
                                <table data-toggle="table" data-url="http://localhost:8080/employee?employeeId=1">
                                    <thead>
                                    <tr>
                                        <th data-field="account">account</th>
                                        <th data-field="password">password</th>
                                        <th data-field="gender">gender</th>
                                        <th data-field="phoneNo">phoneNo</th>
                                        <th data-field="email">email</th>
                                        <th data-field="salary">salary</th>
                                    </tr>
                                    </thead>
                                </table>
                            </div>
                            <div class="tab-pane fade" id="tabtwo" role="tabpanel">
                                <p class="">Tab pane two. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                            </div>
                            <div class="tab-pane fade" id="tabthree" role="tabpanel">
                                <p class="">Tab pane three. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-table/1.12.1/bootstrap-table.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap-table/1.11.0/locale/bootstrap-table-zh-CN.min.js"></script>
</body>

</html>
