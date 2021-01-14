package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long productid);
    List<Product> getProducten();
    Product addProduct(Product product);
}
