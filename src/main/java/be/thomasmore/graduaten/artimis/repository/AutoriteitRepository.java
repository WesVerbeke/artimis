package be.thomasmore.graduaten.artimis.repository;

import be.thomasmore.graduaten.artimis.model.Autoriteit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoriteitRepository extends JpaRepository<Autoriteit, Long> {
}
