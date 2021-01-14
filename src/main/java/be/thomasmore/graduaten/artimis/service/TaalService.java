package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.model.Taal;

import java.util.List;

public interface TaalService {
    Taal getTaalById(Long taalid);
    public List<Taal> getTalen();
    Taal addTaal(Taal taal);
}
