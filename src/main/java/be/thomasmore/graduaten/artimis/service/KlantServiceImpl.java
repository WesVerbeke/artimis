package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.entity.Klant;
import be.thomasmore.graduaten.artimis.repository.KlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlantServiceImpl implements KlantService{

    @Autowired
    KlantRepository klantRepository;

    @Override
    public Klant getKlantById(Long klantId) { return klantRepository.getOne(klantId); }

    @Override
    public List<Klant> getKlanten() { return klantRepository.findAll(); }

    @Override
    public Klant addKlant(Klant klant) { return klantRepository.save(klant); }
}
