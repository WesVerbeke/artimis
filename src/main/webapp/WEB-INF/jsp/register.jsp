<%--
  Created by IntelliJ IDEA.
  User: wesve
  Date: 19/12/2020
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List" %>
<%@ page import="be.thomasmore.graduaten.artimis.entity.Customer" %>
<%@ page import="be.thomasmore.graduaten.artimis.service.CustomerService" %>
<%@ page import="be.thomasmore.graduaten.artimis.entity.CustomerError" %>
<%@ page import="be.thomasmore.graduaten.artimis.entity.Customer" %>
<%@ page import="be.thomasmore.graduaten.artimis.entity.CustomerError" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sticky-footer-navbar/">
    <link href="https://getbootstrap.com/docs/5.0/examples/sticky-footer-navbar/sticky-footer-navbar.css" rel="stylesheet">
    <style>
        .navbar-brand {
            margin-top: 19px;
            margin-bottom: 17px;
            float: left;
        }
    </style>
</head>
<body>
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="../resources/images/logo1.png" alt="" width="300" height="166">
        </a>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/login">Back
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>

    <!-- Page Content -->
<%
    Customer customer = (Customer) request.getAttribute(Customer.NAME);
    CustomerError customerError = (CustomerError) request.getAttribute(CustomerError.NAME);
%>

<div class="container-flex p-3">
    <form class="needs-validation" action="${pageContext.request.contextPath}/register" method="get" novalidate>
        <div class="form-group">
            <label for="<%=Customer.FIRST_NAME%>"><%=Customer.FIRST_NAME%></label>
            <input
                    type="text"
                    class="form-control<%out.print(customerError.voornaam != null ? " is-invalid" : "");%>"
                    id="<%=Customer.FIRST_NAME%>"
                    name="<%=Customer.FIRST_NAME%>"
                    value="<%=customer.getVoornaam() == null ? "" : customer.getVoornaam()%>"
                    required>
            <%out.print(customerError.voornaam != null ? "<div class=\"invalid-feedback\">" + customerError.voornaam + "</div>" : "");%>
        </div>
        <div class="form-group">
            <label for="<%=Customer.LAST_NAME%>"><%=Customer.LAST_NAME%></label>
            <input
                    type="text"
                    class="form-control<%out.print(customerError.achternaam != null ? " is-invalid" : "");%>"
                    id="<%=Customer.LAST_NAME%>"
                    name="<%=Customer.LAST_NAME%>"
                    value="<%=customer.getAchternaam() == null ? "" : customer.getAchternaam()%>"
                    required>
            <%out.print(customerError.achternaam != null ? "<div class=\"invalid-feedback\">" + customerError.achternaam + "</div>" : "");%>
        </div>
        <div class="form-group">
            <label for="<%=Customer.EMAIL%>"><%=Customer.EMAIL%></label>
            <input
                    type="email"
                    class="form-control<%out.print(customerError.email != null ? " is-invalid" : "");%>"
                    id="<%=Customer.EMAIL%>"
                    name="<%=Customer.EMAIL%>"
                    value="<%=customer.getEmail() == null ? "" : customer.getEmail()%>"
                    required>
            <%out.print(customerError.email != null ? "<div class=\"invalid-feedback\">" + customerError.email + "</div>" : "");%>
        </div>
        <input type="submit" class="btn btn-orange" value="Submit user">
    </form>
</div>

    <!-- /.container -->
    <footer class="footer mt-auto py-3 bg-light position-absolute: fixed-bottom">
        <div class="container">
            <span class="text-muted">©All rights reserved</span>
        </div>
    </footer>

    <!--jQuery, Popper.js, and Bootstrap JS-->
    <script src="js/scripts.js"></script>
    <script src="/docs/5.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
</body>
</html>
