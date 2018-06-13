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
            <a class="btn navbar-btn ml-2 text-white btn-secondary" href="#footer">
                <i class="fa d-inline fa-lg fa-user-circle-o"></i> Contacts</a>
            <a class="btn navbar-btn ml-2 text-white btn-secondary"  href="<%=contextPath%>/index">
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
                                <a id="emp" class="nav-link" data-toggle="pill" style="font-size:large">Employee</a>
                            </li>
                            <li class="nav-item border border-primary p-3">
                                <a id="dis" class="nav-link"  data-toggle="pill" style="font-size:large">Dispatch Bill</a>
                            </li>
                            <li class="nav-item border border-primary p-3">
                                <a id="nor"  class="nav-link" data-toggle="pill" style="font-size:large">Normal Bill</a>
                            </li>
                            <li class="nav-item border border-primary p-3">
                                <a id="pro"  class="nav-link" data-toggle="pill" style="font-size:large">Profile</a>
                            </li>
                        </ul>
                    </div>
                    <div class="col-8 border border-primary">
                        <div class="tab-content">
                            <div class="tab-pane fade show active" id="tabone" role="tabpanel">
                                <iframe id="ifra" width="100%" height="80%" frameborder="0" src="<%=contextPath%>/employeemanager"></iframe>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div id="footer" class="text-white bg-primary">
    <div class="container">
        <div class="row">
            <div class="p-4 col-md-3">
                <h2 class="mb-4 text-secondary">AntExpress</h2>
                <p class="text-white">A company for whatever you may need, from website prototyping to publishing</p>
            </div>
            <div class="p-4 col-md-3">
                <h2 class="mb-4 text-secondary">Mapsite</h2>
                <ul class="list-unstyled">
                    <a href="#" class="text-white">Home</a>
                    <br>
                    <a href="#" class="text-white">About us</a>
                    <br>
                    <a href="#" class="text-white">Our services</a>
                    <br>
                    <a href="#" class="text-white">Stories</a>
                </ul>
            </div>
            <div class="p-4 col-md-3">
                <h2 class="mb-4">Contact</h2>
                <p>
                    <a href="tel:+246 - 542 550 5462" class="text-white">
                        <i class="fa d-inline mr-3 text-secondary fa-phone"></i>+246 - 542 550 5462</a>
                </p>
                <p>
                    <a href="mailto:info@pingendo.com" class="text-white">
                        <i class="fa d-inline mr-3 text-secondary fa-envelope-o"></i>info@antexpress.com</a>
                </p>
                <p>
                    <a href="https://goo.gl/maps/AUq7b9W7yYJ2" class="text-white" target="_blank">
                        <i class="fa d-inline mr-3 fa-map-marker text-secondary"></i>365 Park Street, NY</a>
                </p>
            </div>
            <div class="p-4 col-md-3">
                <h2 class="mb-4 text-light">Subscribe</h2>
                <fieldset class="form-group text-white">
                    <label>Get our newsletter</label>
                    <input type="email" class="form-control" placeholder="Enter email"> </fieldset>
                <button class="btn btn-outline-secondary" onclick="send()">Submit</button>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12 mt-3">
                <p class="text-center text-white">© Copyright 2017 AntExpress - All rights reserved. </p>
            </div>
        </div>
    </div>
</div>
</body>
<script>
    $('#emp').click(function () {
        $('#ifra').attr('src','<%=contextPath%>/employeemanager')
    });
    $('#dis').click(function () {
        $('#ifra').attr('src','<%=contextPath%>/dispatchbill')
    });
    $('#nor').click(function () {
        $('#ifra').attr('src','<%=contextPath%>/normalbill')
    });
    $('#pro').click(function () {
        $('#ifra').attr('src','<%=contextPath%>/employeecourier')
    });
    function send() {
        alert("Send newsletter to your email!");
    }
</script>
</html>
