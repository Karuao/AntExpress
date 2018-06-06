<%--
  Created by IntelliJ IDEA.
  User: Wiggin
  Date: 2018/6/5
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <%String contextPath = request.getContextPath();%>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="<%=contextPath%>/css/theme.css" type="text/css"> </head>

<body>
<nav class="navbar navbar-expand-md bg-primary navbar-dark" >
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
        </div>
    </div>
</nav>
<div class="py-5 text-center h-100" style="background-image: url(<%=contextPath%>/img/cover.jpg);">
    <div class="container py-5">
        <div class="row">
            <div class="col-md-12">
                <h1 class="display-3 mb-4 text-primary">Submit Successfully</h1>
                <p class="lead mb-5" style="font-size: xx-large">Your Tracking Number is :<b style="color: #337ab7">${tracking_no}</b>
                <br>Please pay attention to text messages on your phone</p>
                <a href="delivery" class="btn btn-lg mx-1 btn-secondary">Delivery Again</a>
                <a href="index" class="btn btn-lg btn-primary mx-1">Back To Home</a>
            </div>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>

</html>
