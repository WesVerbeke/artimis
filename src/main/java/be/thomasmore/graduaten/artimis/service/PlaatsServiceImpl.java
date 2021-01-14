package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.model.Plaats;
import be.thomasmore.graduaten.artimis.repository.PlaatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaatsServiceImpl implements PlaatsService {

    @Autowired
    PlaatsRepository plaatsRepository;

    @Override
    public Plaats getPlaatsById(Long plaatsid) { return plaatsRepository.getOne(plaatsid); }

    @Override
    public List<Plaats> getPlaatsen() {
        return plaatsRepository.findAll();
    }

    @Override
    public Plaats addPlaats(Plaats plaats) { return plaatsRepository.save(plaats); }
}
