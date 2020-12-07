package be.thomasmore.graduaten.artimis.service;


import be.thomasmore.graduaten.artimis.entity.Product;
import be.thomasmore.graduaten.artimis.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSetviceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getProductById(Long productId) {
        return productRepository.getOne(productId);
    }

    @Override
    public List<Product> getProducten() {
        return productRepository.findAll();
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
