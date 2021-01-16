package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.model.Gebruiker;
import be.thomasmore.graduaten.artimis.repository.GebruikerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GebruikerServiceImpl implements GebruikerService{

    @Autowired
    GebruikerRepository gebruikerRepository;

    @Override
    public Gebruiker getGebruikerById(String username) { return gebruikerRepository.getOne(username); }

    @Override
    public List<Gebruiker> getGebruikers() { return gebruikerRepository.findAll(); }

    @Override
    public Gebruiker addGebruiker(Gebruiker gebruiker) { return gebruikerRepository.save(gebruiker); }
}

