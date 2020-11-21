package be.thomasmore.graduaten.artimis.repository;


import be.thomasmore.graduaten.artimis.entity.Bestelling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BestellingRepository extends JpaRepository<Bestelling, Long> {
}
