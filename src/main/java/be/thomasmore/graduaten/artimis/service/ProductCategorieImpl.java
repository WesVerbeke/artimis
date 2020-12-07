package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.entity.ProductCategorie;
import be.thomasmore.graduaten.artimis.repository.ProductCategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategorieImpl implements ProductCategorieService {

    @Autowired
    ProductCategorieRepository productCategorieRepository;

    @Override
    public ProductCategorie getProductCategorieById(Long productCategorieId) {
        return productCategorieRepository.getOne(productCategorieId);
    }

    @Override
    public List<ProductCategorie> getProductCategorien() {
        return productCategorieRepository.findAll();
    }

    @Override
    public ProductCategorie addProductCategorie(ProductCategorie productCategorie) {
        return productCategorieRepository.save(productCategorie);
    }
}
