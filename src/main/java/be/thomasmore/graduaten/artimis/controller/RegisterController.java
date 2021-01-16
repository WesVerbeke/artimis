package be.thomasmore.graduaten.artimis.controller;

import be.thomasmore.graduaten.artimis.model.Gebruiker;
import be.thomasmore.graduaten.artimis.model.GebruikerError;
import be.thomasmore.graduaten.artimis.service.GebruikerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    GebruikerService gebruikerService;

    @RequestMapping("/register")
    public String navigateAddGebruiker(Model model) {
        Gebruiker gebruiker = new Gebruiker();
        GebruikerError gebruikerError = new GebruikerError();
        model.addAttribute(gebruiker.NAME, gebruiker);
        model.addAttribute(GebruikerError.NAME, gebruikerError);
        return "register";
    }

    @RequestMapping("/overview")
    public String navigateOverview(Model model) {
        model.addAttribute("gebruikers", gebruikerService.getGebruikers());
        return "overview";
    }

}
