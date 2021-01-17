<%@ page import="java.util.List" %>
<%@ page import="be.thomasmore.graduaten.artimis.model.Gebruiker" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The Artimis Project: Overzicht Gebruikers</title>
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
            width: 60px !important;
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
                    <a class="nav-link" href="/admin">Back
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Page Content -->
<div class="container">
    <h1 class="mt-4">Overzicht Gebruikers</h1>

    <%-- Tabel met gebruikers --%>
    <%
        List<Gebruiker> gebruikers = (List<Gebruiker>) request.getAttribute("gebruikers");
        out.print("<table border='1'>");
        out.print("<tr><th>ID</th><th>Naam</th><th>E-mail</th><th>Admin</th><th>Actief</th><th>Bekijk</th></tr>");
        for (Gebruiker gebruiker: gebruikers) {
            String linkdetail = "/klantdetail?id=" + gebruiker.getKlant().getKlantid().toString();
            String status;
            if (gebruiker.getEnabled().equals(true))
            {
                status = "Ja";
            }
            else
            {
                status = "Neen";
            }
            String admin;
            if (gebruiker.getAutoriteit().getAuthority().equals("ROLE_ADMIN"))
            {
                admin = "Ja";
            }
            else{
                admin = "Neen";
            }

            //tabel afdrukken
            out.print(
                    "<tr>" +
                            "<td>" + gebruiker.getKlant().getKlantid().toString() + "</td>" +
                            "<td>" + gebruiker.getKlant().getVoornaam() + " " + gebruiker.getKlant().getAchternaam() + "</td>" +
                            "<td style=\"font-size: 12px\">" + gebruiker.getUsername() + "</td>" +
                            "<td>" + admin + "</td>" +
                            "<td>" + status + "</td>" +
                            "<td><a href=" + linkdetail + "><button type=\"button\" class=\"knop\">details</button></a></td>" +
                            "</tr>"
            );
        }
        out.print("</table>");
    %>

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
