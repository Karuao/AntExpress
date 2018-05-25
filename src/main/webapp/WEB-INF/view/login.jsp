<%--
  Created by IntelliJ IDEA.
  User: Wiggin
  Date: 2018/5/16
  Time: 11:29
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
<div class="py-5 h-100" style="background-image: url(<%=contextPath%>/img/cover.jpg)">
    <div class="container">
        <div class="row">
            <div class="align-self-center col-md-6 text-white">
                <h1 class="text-center text-md-left display-3" style="color: #007bff">AntExpress
                    <br>
                </h1>
                <p class="lead" style="color: #007bff">MaLaXiangGuo Group
                    <br>
                </p>
            </div>
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body p-5">
                        <h3 class="pb-3">Please Login</h3>
                        <form action="login" method="post">
                            <div class="form-group">
                                <label>Name</label>
                                <input name="name" class="form-control" placeholder="Your name, please"> </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input name="password" type="password" class="form-control" placeholder="Your password, please">
                            </div>
                            <button type="submit" class="btn mt-2 btn-outline-dark">Login
                                <br>
                            </button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js" ></script>
<script src="https://cdn.bootcss.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
</body>

</html>
