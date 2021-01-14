package be.thomasmore.graduaten.artimis.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String navigateHome() { return "index"; }

    @RequestMapping("/privacy")
    public String navigatePrivacy() { return "privacy"; }

    @RequestMapping("/login")
    public  String navigateLogin() { return "login"; }

    @RequestMapping("/kopen")
    public String navigateKopen() { return "kopen"; }

    @RequestMapping("/contact")
    public String navigateContact() { return "contact"; }
}