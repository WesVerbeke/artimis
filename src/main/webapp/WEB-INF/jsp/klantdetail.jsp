<%@ page import="be.thomasmore.graduaten.artimis.model.Klant" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="be.thomasmore.graduaten.artimis.model.Gebruiker" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The Artimis Project: Klantdetails</title>
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
        .prijs {
            color: #993300;
            white-space: nowrap;
            font-size: 20px;
            font-weight: bold;
            padding-top: 5px;
            padding-left: 20px;
            Margin-top: 20px;
        }
        .tabel {
            border-collapse: collapse;
        }
        .tekstinhoud {
            padding-left: 20px;
            padding-right: 30px;
            padding-bottom: 40px;
            padding-top: 20px;
            vertical-align: bottom;
        }
        .knop {
            border: 0px !important;
            color: #e5ddd3 !important;
            background-color: #494540 !important;
            width: 70px !important;
            padding-top: 5px !important;
            padding-bottom: 5px !important;
            Margin-left: 20px;
            Margin-top: 20px;
        }

        .opsomming {
            padding-left: 20px;
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
                    <a class="nav-link" href="/gebruikers">Back
                        <span class="sr-only">(current)</span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Page Content -->
<div class="container">
    <%-- Weergave geselecteerde klant --%>
    <%
        Gebruiker gebruiker = (Gebruiker) request.getAttribute("gebruiker");
        Klant klant= gebruiker.getKlant();

        Date date = klant.getGeboortedatum();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String geboortedatum = dateFormat.format(date);

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


        out.print("<h1 class=\"mt-4\">" + klant.getVoornaam() + " " + klant.getAchternaam() + "</h1>\n");
        out.print(
                "<p><b>ID:&#8194;</b>" + klant.getKlantid().toString() + "</p>" +
                "<p><b>Geboortedatum:&#8194;</b>" + geboortedatum + "</p>" +
                "<p><b>Adres:&#8194;</b>" + klant.getAdres() + ", " + klant.getPlaats().getPostcode() + " " + klant.getPlaats().getGemeente() + "</p>" +
                "<p><b>E-mail:&#8194;</b>" + gebruiker.getUsername() + "</p>" +
                "<p><b>Actief:&#8194;</b>" + status + "</p>" +
                "<p><b>Admin:&#8194;</b>" + admin + "</p>"
        );
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
