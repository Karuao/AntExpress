<%--
  Created by IntelliJ IDEA.
  User: Wiggin
  Date: 2018/5/16
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/view/include.jsp"%>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="<%=contextPath%>/css/theme.css" type="text/css">

</head>

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
                                <a id="emp" class="active nav-link" data-toggle="pill">Employee</a>
                            </li>
                            <li class="nav-item border border-primary p-3">
                                <a id="dep" class="nav-link"  data-toggle="pill">Department</a>
                            </li>
                            <li class="nav-item border border-primary p-3">
                                <a id="occ"  class="nav-link" data-toggle="pill" >Occupation</a>
                            </li>
                        </ul>
                    </div>
                    <div class="col-8 border border-primary">
                        <div class="tab-content">
                            <div class="tab-pane fade show active" id="tabone" role="tabpanel">
                                <iframe id="ifra" width="100%" height="80%" frameborder="0" src="<%=contextPath%>/emp_manager"></iframe>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script>
    $('#emp').click(function () {
        $('#ifra').attr('src','<%=contextPath%>/emp_manager')
    });
    $('#dep').click(function () {
        $('#ifra').attr('src','<%=contextPath%>/login')
    });
    $('#occ').click(function () {

    });
</script>
</html>
