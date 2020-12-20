package be.thomasmore.graduaten.artimis.repository;


import be.thomasmore.graduaten.artimis.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
