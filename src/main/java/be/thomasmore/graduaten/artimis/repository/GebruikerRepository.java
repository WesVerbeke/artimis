package be.thomasmore.graduaten.artimis.repository;

import be.thomasmore.graduaten.artimis.model.Gebruiker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GebruikerRepository extends JpaRepository<Gebruiker, String> {
}
