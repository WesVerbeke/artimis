package be.thomasmore.graduaten.artimis.repository;

import be.thomasmore.graduaten.artimis.entity.BestellingStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BestellingStatusRepository extends JpaRepository<BestellingStatus, Long> {
}
