package be.thomasmore.graduaten.artimis.controller;

import be.thomasmore.graduaten.artimis.entity.Plaats;
import be.thomasmore.graduaten.artimis.service.PlaatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PlaatsController {

    @Autowired
    PlaatsService plaatsService;

    @RequestMapping("/data-plaats")
    public String dataMultiple(Model model) {
        List<Plaats> plaatsen = plaatsService.getPlaatsen();
        model.addAttribute ( "plaatsen", plaatsen);
        return "data-plaats";
    }
}
