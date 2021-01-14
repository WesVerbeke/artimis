package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.model.Uitgever;

import java.util.List;

public interface UitgeverService {
    Uitgever getUitgeverById(Long uitgeverid);
    public List<Uitgever> getUitgevers();
    Uitgever addUitgever(Uitgever uitgever);
}
