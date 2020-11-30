package be.thomasmore.graduaten.artimis.repository;

import be.thomasmore.graduaten.artimis.entity.Plaats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaatsRepository extends JpaRepository<Plaats, Long> {
}
