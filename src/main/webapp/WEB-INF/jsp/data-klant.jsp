<%@ page import="be.thomasmore.graduaten.artimis.entity.Klant" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: wesve
  Date: 21/11/2020
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>data-klant</title>
</head>
<body>
    <h1>Data tonen bij wijze van test</h1>

    <%
        List<Klant> klanten = (List<Klant>) request.getAttribute("klanten");
        out.print("<table border='1'>");
        out.print("<tr><th>Naam klant</th><th>Achternaam klant</th></tr>");
        for (Klant klant: klanten) {
            out.print("<tr><td>" + klant.getVoornaam() + "</td><td>" + klant.getAchternaam() + "</td></tr>");
        }
        out.print("</table>");
    %>

</body>
</html>
