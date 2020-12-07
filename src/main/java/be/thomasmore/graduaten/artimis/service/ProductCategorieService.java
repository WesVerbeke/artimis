package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.entity.ProductCategorie;

import java.util.List;

public interface ProductCategorieService {
    ProductCategorie getProductCategorieById(Long productCategorieId);
    List<ProductCategorie> getProductCategorien();
    ProductCategorie addProductCategorie(ProductCategorie productCategorie);
}
