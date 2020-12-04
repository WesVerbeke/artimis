package be.thomasmore.graduaten.artimis.controller;

import be.thomasmore.graduaten.artimis.entity.BestellingStatus;
import be.thomasmore.graduaten.artimis.service.BestellingStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BestellingStatusController {
    @Autowired
    BestellingStatusService bestellingStatusService;

    @RequestMapping("/data-bestellingstatus")
    public  String dataMultiple(Model model) {
        List<BestellingStatus> bestellingStatussen = bestellingStatusService.getBestellingStatussen();
        model.addAttribute("bestellingStatussen", bestellingStatussen);
        return "data-bestellingstatus";
    }
}
