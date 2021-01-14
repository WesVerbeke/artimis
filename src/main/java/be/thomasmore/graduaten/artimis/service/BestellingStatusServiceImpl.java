package be.thomasmore.graduaten.artimis.service;
import be.thomasmore.graduaten.artimis.model.BestellingStatus;
import be.thomasmore.graduaten.artimis.repository.BestellingStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BestellingStatusServiceImpl implements BestellingStatusService {

    @Autowired
    BestellingStatusRepository bestellingStatusRepository;

    @Override
    public BestellingStatus getBestellingStatusById(Long bestellingstatusid) {
        return bestellingStatusRepository.getOne(bestellingstatusid);
    }

    @Override
    public List<BestellingStatus> getBestellingStatussen() {
        return bestellingStatusRepository.findAll();
    }

    @Override
    public BestellingStatus addBestellingStatus(BestellingStatus bestellingStatus) {
        return bestellingStatusRepository.save(bestellingStatus);
    }
}
