package be.thomasmore.graduaten.artimis.repository;


import be.thomasmore.graduaten.artimis.entity.Klant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlantRepository extends JpaRepository<Klant, Long> {
}
