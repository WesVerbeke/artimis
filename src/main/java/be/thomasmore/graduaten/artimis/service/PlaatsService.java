package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.entity.Plaats;

import java.util.List;

public interface PlaatsService {
    Plaats getPlaatsById(Long plaatsId);
    public List<Plaats> getPlaatsen();
    Plaats addPlaats(Plaats plaats);
}