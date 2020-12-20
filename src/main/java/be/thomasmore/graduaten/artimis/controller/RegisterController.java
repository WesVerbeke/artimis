package be.thomasmore.graduaten.artimis.controller;


import be.thomasmore.graduaten.artimis.entity.Klant;
import be.thomasmore.graduaten.artimis.entity.KlantError;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String processStudent(HttpServletRequest request, Model model) {
        Klant klant = new Klant();
        KlantError klantError = new KlantError();

        validateVoornaam(klant, klantError, request.getParameter(Klant.FIRST_NAME));
        validateFamilienaam(klant, klantError, request.getParameter(Klant.LAST_NAME));
        validateEmail(klant, klantError, request.getParameter(Klant.EMAIL));

        if (klantError.hasErrors) {
            model.addAttribute(Klant.NAME, klant);
            model.addAttribute(KlantError.NAME, klantError);
            return "register";
        } else {
            addKlantToSession(request, klant);
            return "login";
        }
    }

    private void validateVoornaam(Klant klant, KlantError klantError, String voornaam) {
        klant.setVoornaam(voornaam);
        if (voornaam.isEmpty()) {
            klantError.voornaam = "Enter a first name please!";
            klantError.hasErrors = true;
        }
    }

    private void validateFamilienaam(Klant klant, KlantError klantError, String achternaam) {
        klant.setAchternaam(achternaam);
        if (achternaam.isEmpty()) {
            klantError.achternaam = "Enter a last name please!";
            klantError.hasErrors = true;
        }
    }


    private void validateEmail(Klant klant, KlantError klantError, String email) {
        klant.setEmail(email);
        if (email.isEmpty()) {
            klantError.email = "Enter a valid email address please!";
            klantError.hasErrors = true;
        } else {
            int posAt = email.indexOf("@");
            int posDot = (posAt != -1) ? email.substring(posAt).indexOf(".") : -1;
            if (posAt == -1 || posDot == -1) {
                klantError.email = "This email is invalid!";
                klantError.hasErrors = true;
            }
        }
    }

    private void addKlantToSession(HttpServletRequest request, Klant klant) {
        HttpSession session = request.getSession();
        ArrayList<Klant> myKlanten = (ArrayList<Klant>) session.getAttribute("myKlanten");
        if (myKlanten == null) {
            myKlanten = new ArrayList<>();
        }
        myKlanten.add(klant);
        session.setAttribute("myKlanten", myKlanten);
    }
}
