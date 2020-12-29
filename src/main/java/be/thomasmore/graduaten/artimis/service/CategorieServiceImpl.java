package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.entity.Categorie;
import be.thomasmore.graduaten.artimis.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    CategorieRepository categorieRepository;

    @Override
    public Categorie getCategorieById(Long categorieid) { return categorieRepository.getOne(categorieid); }

    @Override
    public List<Categorie> getCategorien() { return categorieRepository.findAll(); }

    @Override
    public Categorie addCategorie(Categorie categorie) { return categorieRepository.save(categorie); }
}
