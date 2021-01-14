package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.model.Uitgever;
import be.thomasmore.graduaten.artimis.repository.UitgeverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UitgeverServiceImpl implements UitgeverService {

    @Autowired
    UitgeverRepository uitgeverRepository;

    @Override
    public Uitgever getUitgeverById(Long uitgeverid) { return uitgeverRepository.getOne(uitgeverid); }

    @Override
    public List<Uitgever> getUitgevers() {
        return uitgeverRepository.findAll();
    }

    @Override
    public Uitgever addUitgever(Uitgever uitgever) { return uitgeverRepository.save(uitgever); }
}
