package be.thomasmore.graduaten.artimis.controller;


import be.thomasmore.graduaten.artimis.model.*;
import be.thomasmore.graduaten.artimis.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    ProductService productService;

    @Autowired
    GebruikerService gebruikerService;

    @Autowired
    KlantService klantService;

    @Autowired
    BestellingProductService bestellingProductService;

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

    @RequestMapping("/contact")
    public String navigateContact() { return "contact"; }

    @RequestMapping("/privacy")
    public String navigatePrivacy() { return "privacy"; }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String navigateLogin(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Je e-mail en wachtwoord zijn niet geldig.");

        if (logout != null)
            model.addAttribute("msg", "Je ben uitgelogd.");

        return "login";
    }

    @RequestMapping("/user")
    public String navigateUser() { return "user"; }

    @RequestMapping("/admin")
    public String navigateAdmin() { return "admin"; }

    @RequestMapping("/inventaris")
    public String navigateInventaris(Model model) {
        List<Product> inventaris = productService.getProducten();
        model.addAttribute("inventaris", inventaris);
        return "inventaris";
    }

    @RequestMapping("/gebruikers")
    public String navigateGebruikers(Model model) {
        List<Gebruiker> gebruikers = gebruikerService.getGebruikers();
        model.addAttribute("gebruikers", gebruikers);
        return "gebruikers";
    }

    @RequestMapping("/bestellingen")
    public String navigateBestellingen(Model model) {
        List<BestellingProduct> bestellingen = bestellingProductService.getBestellingProducten();
        model.addAttribute("bestellingen", bestellingen);
        return "bestellingen";
    }

    @RequestMapping("/klantdetail")
    public String navigateKlantdetail(HttpServletRequest request, Model model) {
        Long id = Long.parseLong(request.getParameter("id"));
        Gebruiker gebruiker = new Gebruiker();
        List<Gebruiker> gebruikers = gebruikerService.getGebruikers();
        for (Gebruiker gebruikerOpgehaald : gebruikers){
            if (gebruikerOpgehaald.getKlant().getKlantid() == id){
                gebruiker = gebruikerOpgehaald;
            }
        }
        model.addAttribute("gebruiker", gebruiker);
        return "klantdetail";
    }
}