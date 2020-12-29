package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.entity.Bestelling;
import be.thomasmore.graduaten.artimis.repository.BestellingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BestellingServiceImpl implements BestellingService {

    @Autowired
    BestellingRepository bestellingRepository;

    @Override
    public Bestelling getBestellingById(Long bestellingid) { return bestellingRepository.getOne(bestellingid); }

    @Override
    public List<Bestelling> getBestellingen() { return bestellingRepository.findAll(); }

    @Override
    public Bestelling addBestelling(Bestelling bestelling) { return bestellingRepository.save(bestelling); }
}
