package be.thomasmore.graduaten.artimis.repository;

import be.thomasmore.graduaten.artimis.model.Uitgever;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UitgeverRepository extends JpaRepository<Uitgever, Long> {
}