package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.entity.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long productId);
    List<Product> getProducten();
    Product addProduct(Product product);
}
