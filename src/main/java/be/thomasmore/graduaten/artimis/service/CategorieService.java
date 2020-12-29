package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.entity.Categorie;
import java.util.List;

public interface CategorieService {
    Categorie getCategorieById(Long categorieid);
    List<Categorie> getCategorien();
    Categorie addCategorie(Categorie categorie);
}
