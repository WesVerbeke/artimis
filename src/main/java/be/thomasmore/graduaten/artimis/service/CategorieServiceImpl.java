package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.entity.Categorie;
import be.thomasmore.graduaten.artimis.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService{

    @Autowired
    CategorieRepository CategorieRepository;

    @Override
    public Categorie getCategorieById(Long categorieId) {
        return CategorieRepository.getOne(categorieId);
    }

    @Override
    public List<Categorie> getCategoriën() {
        return CategorieRepository.findAll();
    }

    @Override
    public Categorie addCategorie(Categorie categorie) {
        return CategorieRepository.save(categorie);
    }
}
