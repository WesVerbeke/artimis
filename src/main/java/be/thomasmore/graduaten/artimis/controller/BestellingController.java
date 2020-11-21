package be.thomasmore.graduaten.artimis.controller;


import be.thomasmore.graduaten.artimis.entity.Bestelling;
import be.thomasmore.graduaten.artimis.service.BestellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BestellingController {

    @Autowired
    BestellingService bestellingService;

    @RequestMapping ("/data-bestelling")
    public  String dataMultiple(Model model) {
        List<Bestelling> bestellingen = bestellingService.getBestellingen();
        model.addAttribute("bestellingen", bestellingen);
        return "data-bestelling";
    }


}
