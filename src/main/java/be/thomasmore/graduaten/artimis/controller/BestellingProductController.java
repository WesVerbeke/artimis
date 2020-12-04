package be.thomasmore.graduaten.artimis.controller;

import be.thomasmore.graduaten.artimis.entity.BestellingProduct;
import be.thomasmore.graduaten.artimis.service.BestellingProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class BestellingProductController {
    @Autowired
    BestellingProductService bestellingProductService;

    @RequestMapping("/data-bestellingproduct")
    public String dataMultiple(Model model) {
        List<BestellingProduct> bestellingProducten = bestellingProductService.getBestellingProducten();
        model.addAttribute("bestellingProducten", bestellingProducten);
        return "data-bestellingproduct";
    }
}
