package be.thomasmore.graduaten.artimis.controller;


import be.thomasmore.graduaten.artimis.entity.Customer;
import be.thomasmore.graduaten.artimis.entity.CustomerError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String navigateAddGebruiker(Model model) {
        Customer customer = new Customer();
        CustomerError customerError = new CustomerError();
        model.addAttribute(Customer.NAME, customer);
        model.addAttribute(CustomerError.NAME, customerError);
        return "register";
    }
}
