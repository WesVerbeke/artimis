package be.thomasmore.graduaten.artimis.controller;


import be.thomasmore.graduaten.artimis.entity.Bestelling;
import be.thomasmore.graduaten.artimis.entity.Klant;
import be.thomasmore.graduaten.artimis.service.KlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class KlantController {

    @Autowired
    KlantService klantService;

    @RequestMapping("/data-bestelling")
    public  String dataMultiple(Model model) {
        List<Klant> klanten = klantService.getKlanten();
        model.addAttribute("klanten", klanten);
        return "data-klant";
    }
}
