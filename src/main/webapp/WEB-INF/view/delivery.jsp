<%@ page import="team.malaxiangguo.antexpress.bean.ExpressDeliveryBill" %><%--
  Created by IntelliJ IDEA.
  User: Wiggin
  Date: 2018/6/1
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <%String contextPath = request.getContextPath();
        ExpressDeliveryBill edb = new ExpressDeliveryBill();
    %>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="<%=contextPath%>/css/theme.css" type="text/css"> </head>

<body>
<nav class="navbar navbar-expand-md bg-primary navbar-dark">
    <div class="container">
        <a class="navbar-brand" href="#">
            <i class="fa d-inline fa-lg fa-cloud"></i>
            <b> AntExpress
                <br> </b>
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
<div class="py-5">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <form action="delivery" method="post">
                    <div class="col-12 col-md-6">
                        <h1 class="text-primary">
                            <i class="fa fa-twitter"></i>Sender Information</h1>
                        <hr class="bg-primary"> </div>
                    <div class="form-group">
                        <label class="">Sender Name</label>
                        <input name="senderName" type="text" class="form-control" placeholder="Please Enter You Name"> </div>
                    <div class="form-group">
                        <label class="">Sender PhoneNumber</label>
                        <input name="senderPhoneNo" type="text" class="form-control" placeholder="Please Enter You PhoneNumber"> </div>
                    <div class="form-group">
                        <label class="">Sender Address:</label>
                        <div class="btn-group">
                            <select name="senderAddress" class="btn btn-outline-primary dropdown-toggle" data-toggle="dropdown"> Select District
                                <option class="dropdown-item" value="Shinan District" style="background: white">
                                    Shinan District
                                </option>
                                <option class="dropdown-item" value="Shibei District" style="background: white">
                                    Shibei District
                                </option>
                                <option class="dropdown-item" value="Laoshan District" style="background: white">
                                    Laoshan District
                                </option>
                                <option class="dropdown-item" value="Licang District" style="background: white">
                                    Licang District
                                </option>
                                <option class="dropdown-item" value="Chengyang District" style="background: white">
                                    Chengyang District
                                </option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Sender Detailed Address</label>
                        <input name="senderDetailedAddress" type="text" class="form-control" placeholder="Please Enter You Detailed Address"> </div>
                    <div class="col-12 col-md-6">
                        <h1 class="text-primary">
                            <i class="fa fa-child"></i>Receiver Information</h1>
                        <hr class="bg-primary"> </div>
                    <div class="form-group">
                        <label>Receiver Name</label>
                        <input type="text" class="form-control" placeholder="Please Enter Receiver Name"> </div>
                    <div class="form-group">
                        <label>Receiver PhoneNumber</label>
                        <input type="" class="form-control" placeholder="Please Enter Receiver PhoneNumber"> </div>
                    <div class="form-group">
                        <label >Receiver Address:</label>
                        <div class="btn-group">
                            <select id="receiverSelect" class="btn btn-outline-primary dropdown-toggle" data-toggle="dropdown"> Select District
                                <option class="dropdown-item" value="Shinan District" style="background: white">
                                    Shinan District
                                </option>
                                <option class="dropdown-item" value="Shibei District" style="background: white">
                                    Shibei District
                                </option>
                                <option class="dropdown-item" value="Laoshan District" style="background: white">
                                    Laoshan District
                                </option>
                                <option class="dropdown-item" value="Licang District" style="background: white">
                                    Licang District
                                    <div class="dropdown-divider"></div>
                                </option>
                                <option class="dropdown-item" value="Chengyang District" style="background: white">
                                    Chengyang District
                                </option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label>Receiver Detailed Address</label>
                        <input type="text" class="form-control" placeholder="Please Enter Receiver Detailed Address"> </div>
                    <button type="submit" class="btn btn-lg btn-primary bg-gradient">Submit</button>
                </form>
            </div>
        </div>
    </div>
</div>
<div class="text-white bg-primary">
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
                <form>
                    <fieldset class="form-group text-white">
                        <label>Get our newsletter</label>
                        <input type="email" class="form-control" placeholder="Enter email"> </fieldset>
                    <button type="submit" class="btn btn-outline-secondary">Submit</button>
                </form>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12 mt-3">
                <p class="text-center text-white">© Copyright 2017 AntExpress - All rights reserved. </p>
            </div>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>

</html>