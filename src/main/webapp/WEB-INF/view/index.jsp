<%--
  Created by IntelliJ IDEA.
  User: Wiggin
  Date: 2018/5/16
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <%String contextPath = request.getContextPath();%>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="https://templates.pingendo.com/assets/Pingendo_favicon.ico">
    <meta name="description" content="Free Bootstrap 4 Pingendo Aquamarine template for unique events.">
    <meta name="keywords" content="Pingendo conference event aquamarine free template bootstrap 4">
    <link rel="stylesheet" href="<%=contextPath%>/css/aquamarine.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <!-- Script: Make my navbar transparent when the document is scrolled to top -->
    <script src="<%=contextPath%>/js/navbar-ontop.js"></script>
    <!-- Script: Animated entrance -->
    <script src="<%=contextPath%>/js/animate-in.js"></script>
</head>

<body class="text-center">
<!-- Navbar -->
<nav class="navbar navbar-expand-md fixed-top bg-dark navbar-dark">
    <div class="container">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbar2SupportedContent" aria-controls="navbar2SupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-center" id="navbar2SupportedContent">
            <a class="btn navbar-btn mx-2 text-white btn-outline-light" href="login">Login&nbsp;
                <br>
            </a>
        </div>
    </div>
</nav>
<!-- Cover -->
<div class="d-flex align-items-center section-aquamarine py-5 cover" style="background-image: url(<%=contextPath%>/img/cover.jpg)" >
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-white mt-5">
                <h1 class="display-2 d-none d-md-block">AntExpress System</h1>
                <h1 class="display-4 d-block d-md-none">Conference Pingendo</h1>
                <p class="">June 12-18, NYC </p>
                <a href="#" class="btn btn-lg mt-4 btn-outline-light">Delivery Now
                    <br>
                </a>
                <i class="d-block fa fa-angle-down pt-5 fa-3x"></i>
            </div>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="<%=contextPath%>/js/smooth-scroll.js"></script>
</body>

</html>
