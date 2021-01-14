package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.model.Taal;
import be.thomasmore.graduaten.artimis.repository.TaalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaalServiceImpl implements TaalService {

    @Autowired
    TaalRepository taalRepository;

    @Override
    public Taal getTaalById(Long taalid) { return taalRepository.getOne(taalid); }

    @Override
    public List<Taal> getTalen() {
        return taalRepository.findAll();
    }

    @Override
    public Taal addTaal(Taal taal) { return taalRepository.save(taal); }
}
