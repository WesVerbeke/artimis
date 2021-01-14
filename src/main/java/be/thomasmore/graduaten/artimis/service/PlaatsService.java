package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.model.Plaats;

import java.util.List;

public interface PlaatsService {
    Plaats getPlaatsById(Long plaatsid);
    public List<Plaats> getPlaatsen();
    Plaats addPlaats(Plaats plaats);
}
