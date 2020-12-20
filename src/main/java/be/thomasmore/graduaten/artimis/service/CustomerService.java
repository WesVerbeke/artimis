package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.entity.Customer;
import java.util.List;

public interface CustomerService {
    Customer getKlantById(Long klantId);
    List<Customer> getKlanten();
    Customer addKlant(Customer customer);
}
