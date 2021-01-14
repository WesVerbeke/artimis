package be.thomasmore.graduaten.artimis.repository;


import be.thomasmore.graduaten.artimis.model.Bestelling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BestellingRepository extends JpaRepository<Bestelling, Long> {
}
