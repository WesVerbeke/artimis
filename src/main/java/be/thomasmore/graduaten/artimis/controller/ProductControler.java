package be.thomasmore.graduaten.artimis.controller;


import be.thomasmore.graduaten.artimis.entity.Product;
import be.thomasmore.graduaten.artimis.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductControler {
    @Autowired
    ProductService productService;

    @RequestMapping ("/data-product")
    public String dataMultiple(Model model) {
        List<Product> producten = productService.getProducten();
        model.addAttribute("producten", producten);
        return "data-product";
    }
}
