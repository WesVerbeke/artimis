package be.thomasmore.graduaten.artimis.repository;


import be.thomasmore.graduaten.artimis.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
