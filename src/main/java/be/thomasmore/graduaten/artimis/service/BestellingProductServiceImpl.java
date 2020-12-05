package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.entity.Bestelling;
import be.thomasmore.graduaten.artimis.entity.BestellingProduct;
import be.thomasmore.graduaten.artimis.entity.Product;
import be.thomasmore.graduaten.artimis.repository.BestellingProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<BestellingProduct> getBestellingProductenByBestelling(Long bestellingId) {
        //lijst met alle BestellingProducten opvragen
        List<BestellingProduct> lijstBestellingProducten = bestellingProductRepository.findAll();

        //lijst aanmaken met BestellingProducten die tot een opgegeven bestelling behoren
        List<BestellingProduct> lijstGezochteBestellingProducten = new ArrayList<>();

        for (BestellingProduct bestellingProduct: lijstBestellingProducten) {
            Bestelling bestelling = bestellingProduct.getBestelling(); //Bestelling opvragen
            if (bestelling.getBestellingId().equals(bestellingId)) {
                lijstGezochteBestellingProducten.add(bestellingProduct);
            }
        }
        return lijstGezochteBestellingProducten;
    }

    public List<BestellingProduct> getBestellingProductenByProduct(Long productId) {
        List<BestellingProduct> lijstBestellingProducten = bestellingProductRepository.findAll();
        List<BestellingProduct> lijstGezochteBestellingProducten = new ArrayList<>();

        for (BestellingProduct bestellingProduct: lijstBestellingProducten) {
            Product product = bestellingProduct.getProduct();
            if (product.getProductId().equals(productId)) {
                lijstGezochteBestellingProducten.add(bestellingProduct);
            }
        }
        return lijstGezochteBestellingProducten;
    }

    @Override
    public BestellingProduct addBestellingProduct(BestellingProduct bestellingProduct) {
        return bestellingProductRepository.save(bestellingProduct);
    }

}
