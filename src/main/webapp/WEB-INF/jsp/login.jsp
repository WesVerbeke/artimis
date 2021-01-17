<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
<html>
<head>
--%>
<html xmlns:th="https://www.thymeleaf.org">
<head th:include="layout :: head(title=~{::title},links=~{})">
    <title>The Atrimis Project: Login</title>
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
        .knop {
            border: 0px !important;
            color: #e5ddd3 !important;
            background-color: #494540 !important;
            width: 70px !important;
            padding-top: 5px !important;
            padding-bottom: 5px !important;
        }
    </style>
</head>
<body>
<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="https://i.imgur.com/tfQaRYk.png" alt="Logo BoardGamesOnline" width="190" height="105" style="pointer-events: none">
        </a>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/register">Register
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="/">Back</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Page Content -->
<div class="container">
    <h1 class="mt-4">Inloggen</h1>

    <%-- formulier om in te loggen --%>
<%--
    <form name="inlogformulier" th:action="@{/login}" method="post">
        <fieldset>
            <legend>Login a.u.b.</legend>
            <div th:if="${param.error}" class="alert alert-error">
                Ongeldige gebruikersnaam of wachtwoord.
            </div>
            <div th:if="${param.logout}" class="alert alert-error">
                Je bent uitgelogd.
            </div>
            <label for="username">Gebruikersnaam</label>
            <input type="text" id="username" name="gebruikersnaam"/>
            <label for="password">Wachtwoord</label>
            <input type="text" id="password" name="wachtwoord"/>
            <div class="form-actions">
                <button type="submit" class="knop">Inloggen</button>
            </div>
        </fieldset>
    </form>
--%>
<%--
    <form method="POST" action="/login" class="form-signin">
        <h2 class="form-heading">Log in</h2>

        <div class="form-group ">
            <span></span>
            <input name="username" type="text" class="form-control" placeholder="E-mail"
                   autofocus="true"/>
            <input name="password" type="password" class="form-control" placeholder="Wachtwoord"/>
            <span></span>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
        </div>
    </form>
--%>
    <body th:include="layout :: body" th:with="content=~{::content}">
    <div th:fragment="content">
        <form name="f" th:action="@{/login}" method="post">
            <fieldset>
                <legend>Please Login</legend>
                <div th:if="${param.error}" class="alert alert-error">
                    Invalid username and password.
                </div>
                <div th:if="${param.logout}" class="alert alert-success">
                    You have been logged out.
                </div>
                <label for="username">Username</label>
                <input type="text" id="username" name="username"/>
                <label for="password">Password</label>
                <input type="password" id="password" name="password"/>
                <div class="form-actions">
                    <button type="submit" class="btn">Log in</button>
                </div>
            </fieldset>
        </form>
    </div>
    </body>
    </html>

    <p>Ben je nog geen klant? Registreer eerst voor je een bestelling plaatst.</p>
    <p>Login.</p>
</div>
    <!-- /.container -->
    <footer class="footer mt-auto py-3 bg-light position-absolute: fixed-bottom">
        <div class="container">
            <span class="text-muted">©All rights reserved</span>
        </div>
    </footer>
    <script src="/docs/5.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
</body>
</html>
