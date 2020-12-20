package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.entity.Customer;
import be.thomasmore.graduaten.artimis.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getKlantById(Long klantId) { return customerRepository.getOne(klantId); }

    @Override
    public List<Customer> getKlanten() { return customerRepository.findAll(); }

    @Override
    public Customer addKlant(Customer customer) { return customerRepository.save(customer); }
}
