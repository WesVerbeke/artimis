package be.thomasmore.graduaten.artimis.controller;

import be.thomasmore.graduaten.artimis.model.Gebruiker;
import be.thomasmore.graduaten.artimis.model.GebruikerError;
import be.thomasmore.graduaten.artimis.model.Klant;
import be.thomasmore.graduaten.artimis.model.KlantError;
import be.thomasmore.graduaten.artimis.service.GebruikerService;
import be.thomasmore.graduaten.artimis.service.KlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class RegisterController {

    @Autowired
    GebruikerService gebruikerService;

    @Autowired
    KlantService klantService;

    @RequestMapping("/register")
    public String navigateAddGebruiker(Model model) {
        Gebruiker gebruiker = new Gebruiker();
        GebruikerError gebruikerError = new GebruikerError();
        model.addAttribute(gebruiker.NAME, gebruiker);
        model.addAttribute(GebruikerError.NAME, gebruikerError);
        return "register";
    }

    @RequestMapping("/process-form")
    public String processForm(HttpServletRequest request, Model model) {
        //Initializing gebruiker and gebruikerError objects
        Gebruiker gebruiker = new Gebruiker();
        GebruikerError gebruikerError = new GebruikerError();

        //Initializing klant and klantError objects
        Klant klant = new Klant();
        KlantError klantError = new KlantError();

        //GEBRUIKER VALIDATIE
        //Validate value of username (e-mail adres)
        String username = request.getParameter(Gebruiker.USERNAME);
        gebruiker.setUsername(username);

        int posAt = username.indexOf("@");
        int posDot = (posAt != -1) ? username.substring(posAt).indexOf(".") : -1;
        if (username.isEmpty()) {
            gebruikerError.username = "U moet een E-mailadres invullen!";
            gebruikerError.hasErrors = true;
        }
        else if (posAt == -1 || posDot == -1 || posDot > posAt) {
            gebruikerError.username = "Deze E-mail is niet geldig!";
            gebruikerError.hasErrors = true;
        }

        //Validate value of password
        String password = request.getParameter(Gebruiker.PASSWORD);
        gebruiker.setPassword(password);
        if (password.isEmpty()) {
            gebruikerError.password = "U moet een wachtwoord invullen!";
            gebruikerError.hasErrors = true;
        }

        //KLANT VALIDATIE
        //Validate value of voornaam
        String voornaam = request.getParameter(Klant.VOORNAAM);
        klant.setVoornaam(voornaam);
        if (voornaam.isEmpty()) {
            klantError.voornaam = "U moet een voornaam invullen!";
            klantError.hasErrors = true;
        }

        //Validate value of familienaam
        String achternaam = request.getParameter(Klant.ACHTERNAAM);
        klant.setAchternaam(achternaam);
        if (achternaam.isEmpty()) {
            klantError.achternaam = "U moet een familienaam invullen!";
            klantError.hasErrors = true;
        }

        //Validate value of geboortedatum
        String geboortedatum = request.getParameter(Klant.GEBOORTEDATUM);
        if (geboortedatum.isEmpty()) {
            klantError.geboortedatum = "U moet een geboortedatum invullen!";
            klantError.hasErrors = true;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        simpleDateFormat.setLenient(false);
        try
        {
            Date javaDate = simpleDateFormat.parse(geboortedatum);
            klant.setGeboortedatum(javaDate);
        }
        catch (ParseException e)
        {
            klantError.geboortedatum = "U moet een geldige datum ingeven! ('dd-MM-yyyy')";
            klantError.hasErrors = true;
        }

        //Navigate to login
        if (gebruikerError.hasErrors) {
            model.addAttribute(Gebruiker.NAME, gebruiker);
            model.addAttribute(GebruikerError.NAME, gebruikerError);
            return "form";
        }
        else if (klantError.hasErrors) {
            model.addAttribute(Klant.NAME, klant);
            model.addAttribute(KlantError.NAME, klantError);
            return "form";
        }
        else {
            gebruikerService.addGebruiker(gebruiker);
            klantService.addKlant(klant);
            klantService.addKlant(klant);
            return "login";
        }
    }

    public static boolean datumValidatie(String datum)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        simpleDateFormat.setLenient(false);
        try
        {
            Date javaDate = simpleDateFormat.parse(datum);
        }
        catch (ParseException e)
        {
            return false;
        }
        return true;
    }
}
