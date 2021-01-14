package be.thomasmore.graduaten.artimis.controller;


import be.thomasmore.graduaten.artimis.model.Klant;
import be.thomasmore.graduaten.artimis.model.KlantError;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String navigateAddGebruiker(Model model) {
        Klant klant = new Klant();
        KlantError klantError = new KlantError();
        model.addAttribute(Klant.NAME, klant);
        model.addAttribute(KlantError.NAME, klantError);
        return "register";
    }
}
