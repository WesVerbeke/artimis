package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.model.Gebruiker;
import java.util.List;

public interface GebruikerService {
    Gebruiker getGebruikerById(String username);
    List<Gebruiker> getGebruikers();
    Gebruiker addGebruiker(Gebruiker gebruiker);
}
