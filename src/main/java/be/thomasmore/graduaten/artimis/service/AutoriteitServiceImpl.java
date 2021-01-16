package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.model.Autoriteit;
import be.thomasmore.graduaten.artimis.repository.AutoriteitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoriteitServiceImpl implements AutoriteitService {

    @Autowired
    AutoriteitRepository autoriteitRepository;

    @Override
    public Autoriteit getAutoriteitById(Long autoriteitid) { return autoriteitRepository.getOne(autoriteitid); }
}
