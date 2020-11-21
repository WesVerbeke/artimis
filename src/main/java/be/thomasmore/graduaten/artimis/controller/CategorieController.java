package be.thomasmore.graduaten.artimis.controller;


import be.thomasmore.graduaten.artimis.entity.Categorie;
import be.thomasmore.graduaten.artimis.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CategorieController {

    @Autowired
    CategorieService categorieService;

    @RequestMapping("/data-categorie")
    public String categorie(HttpServletRequest request, Model model) {
        Long categorieID = Long.parseLong(request.getParameter("categorieId"));
        Categorie categorie = categorieService.getCategorieById(categorieID);
        model.addAttribute("categorie", categorie);
        return "data-categorie";
    }
}
