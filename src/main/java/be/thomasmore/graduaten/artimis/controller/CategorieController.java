package be.thomasmore.graduaten.artimis.controller;


import be.thomasmore.graduaten.artimis.entity.Bestelling;
import be.thomasmore.graduaten.artimis.entity.Categorie;
import be.thomasmore.graduaten.artimis.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CategorieController {

    @Autowired
    CategorieService categorieService;

    @RequestMapping("/data-categorie")
    public  String dataMultiple(Model model) {
        List<Categorie> categorien = categorieService.getCategorien();
        model.addAttribute("categorien", categorien);
        return "data-categorie";
    }
}
