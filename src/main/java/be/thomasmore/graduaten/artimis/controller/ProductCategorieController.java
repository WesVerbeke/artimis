package be.thomasmore.graduaten.artimis.controller;


import be.thomasmore.graduaten.artimis.entity.ProductCategorie;
import be.thomasmore.graduaten.artimis.service.ProductCategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductCategorieController {

    @Autowired
    ProductCategorieService productCategorieService;

    @RequestMapping ("data-productcategorie")
    public String dataMultiple(Model model) {
        List<ProductCategorie> productCategorien = productCategorieService.getProductCategorien();
        model.addAttribute("productcategorien",productCategorien);
        return "data-productcategorie";
    }
}
