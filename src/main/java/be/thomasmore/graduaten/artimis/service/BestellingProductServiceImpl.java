package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.entity.BestellingProduct;
import be.thomasmore.graduaten.artimis.repository.BestellingProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BestellingProductServiceImpl implements BestellingProductService {
    @Autowired
    BestellingProductRepository bestellingProductRepository;

    @Override
    public BestellingProduct getBestellingProductById(Long bestellingProductId) {
        return bestellingProductRepository.getOne(bestellingProductId);
    }

    @Override
    public List<BestellingProduct> getBestellingProducten() { return bestellingProductRepository.findAll(); }

    @Override
    public Optional<BestellingProduct> getBestellingProductenByBestelling(Long bestellingId) {
        return bestellingProductRepository.findById(bestellingId);
    }

    public Optional<BestellingProduct> getBestellingProductenByProduct(Long productId) {
        return bestellingProductRepository.findById(productId);
    }

    @Override
    public BestellingProduct addBestellingProduct(BestellingProduct bestellingProduct) {
        return bestellingProductRepository.save(bestellingProduct);
    }

}
