package be.thomasmore.graduaten.artimis.repository;

import be.thomasmore.graduaten.artimis.model.Taal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaalRepository extends JpaRepository<Taal, Long> {
}