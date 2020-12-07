package be.thomasmore.graduaten.artimis.repository;


import be.thomasmore.graduaten.artimis.entity.ProductCategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategorieRepository extends JpaRepository<ProductCategorie, Long> {
}
