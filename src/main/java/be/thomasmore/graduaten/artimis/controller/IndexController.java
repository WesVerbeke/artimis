package be.thomasmore.graduaten.artimis.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() { return "index"; }

    @RequestMapping("/privacy")
    public String privacy() { return "privacy"; }

    @RequestMapping("/login")
    public  String login() { return "login"; }

    @RequestMapping("/kopen")
    public String kopen() { return "kopen"; }

    @RequestMapping("/contact")
    public String contact() { return "contact"; }

}
