package be.thomasmore.graduaten.artimis.repository;


import be.thomasmore.graduaten.artimis.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
