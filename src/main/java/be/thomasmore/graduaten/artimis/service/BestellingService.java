package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.model.Bestelling;

import java.util.List;

public interface BestellingService {
    Bestelling getBestellingById(Long bestellingid);
    List<Bestelling> getBestellingen();
    Bestelling addBestelling(Bestelling bestelling);
}
