package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.entity.Klant;

import java.util.List;

public interface KlantService {
    Klant getKlantById(Long klantId);
    List<Klant> getKlanten();
    Klant addKlant(Klant klant);
}
