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

    @Autowired
    RegisterController registerController;

    @RequestMapping("/register")
    public String processStudent(HttpServletRequest request, Model model) {
        Customer customer = new Customer();
        CustomerError customerError = new CustomerError();

        validateVoornaam(customer, customerError, request.getParameter(Customer.FIRST_NAME));
        validateFamilienaam(customer, customerError, request.getParameter(Customer.LAST_NAME));
        validateEmail(customer, customerError, request.getParameter(Customer.EMAIL));

        if (customerError.hasErrors) {
            model.addAttribute(Customer.NAME, customer);
            model.addAttribute(CustomerError.NAME, customerError);
            return "register";
        } else {
            addKlantToSession(request, customer);
            return "login";
        }
    }

    private void validateVoornaam(Customer customer, CustomerError customerError, String voornaam) {
        customer.setVoornaam(voornaam);
        if (voornaam == null) {
            customerError.voornaam = "Enter a first name please!";
            customerError.hasErrors = true;
        }
    }

    private void validateFamilienaam(Customer customer, CustomerError customerError, String achternaam) {
        customer.setAchternaam(achternaam);
        if (achternaam.isEmpty()) {
            customerError.achternaam = "Enter a last name please!";
            customerError.hasErrors = true;
        }
    }


    private void validateEmail(Customer customer, CustomerError customerError, String email) {
        customer.setEmail(email);
        if (email.isEmpty()) {
            customerError.email = "Enter a valid email address please!";
            customerError.hasErrors = true;
        } else {
            int posAt = email.indexOf("@");
            int posDot = (posAt != -1) ? email.substring(posAt).indexOf(".") : -1;
            if (posAt == -1 || posDot == -1) {
                customerError.email = "This email is invalid!";
                customerError.hasErrors = true;
            }
        }
    }

    private void addKlantToSession(HttpServletRequest request, Customer customer) {
        HttpSession session = request.getSession();
        ArrayList<Customer> myCustomers = (ArrayList<Customer>) session.getAttribute("myCustomers");
        if (myCustomers == null) {
            myCustomers = new ArrayList<>();
        }
        myCustomers.add(customer);
        session.setAttribute("myCustomers", myCustomers);
    }
}
