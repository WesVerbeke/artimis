package be.thomasmore.graduaten.artimis.repository;

import be.thomasmore.graduaten.artimis.model.BestellingProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BestellingProductRepository extends JpaRepository<BestellingProduct, Long> {
}
