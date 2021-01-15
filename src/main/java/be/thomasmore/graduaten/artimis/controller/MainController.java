package be.thomasmore.graduaten.artimis.controller;


import be.thomasmore.graduaten.artimis.model.Product;
import be.thomasmore.graduaten.artimis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String index() { return "index"; }

    @RequestMapping("/kopen")
    public String navigateKopen(Model model) {
        List<Product> producten = productService.getProducten();
        model.addAttribute("producten", producten);
        return "kopen";
    }

    @RequestMapping("/productdetail")
    public String navigateProductdetail(HttpServletRequest request, Model model) {
        Long id = Long.parseLong(request.getParameter("id"));
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "productdetail";
    }

    @RequestMapping("/login")
    public  String navigateLogin() { return "login"; }

    @RequestMapping("/contact")
    public String navigateContact() { return "contact"; }

    @RequestMapping("/privacy")
    public String navigatePrivacy() { return "privacy"; }

}