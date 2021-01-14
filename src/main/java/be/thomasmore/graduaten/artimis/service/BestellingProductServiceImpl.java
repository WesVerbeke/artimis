package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.model.Bestelling;
import be.thomasmore.graduaten.artimis.model.BestellingProduct;
import be.thomasmore.graduaten.artimis.model.Product;
import be.thomasmore.graduaten.artimis.repository.BestellingProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BestellingProductServiceImpl implements BestellingProductService {
    @Autowired
    BestellingProductRepository bestellingProductRepository;

    @Override
    public BestellingProduct getBestellingProductById(Long bestellingproductid) {
        return bestellingProductRepository.getOne(bestellingproductid);
    }

    @Override
    public List<BestellingProduct> getBestellingProducten() { return bestellingProductRepository.findAll(); }

    @Override
    public List<BestellingProduct> getBestellingProductenByBestelling(Long bestellingid) {
        //lijst met alle BestellingProducten opvragen
        List<BestellingProduct> lijstBestellingProducten = bestellingProductRepository.findAll();

        //lijst aanmaken met BestellingProducten die tot een opgegeven bestelling behoren
        List<BestellingProduct> lijstGezochteBestellingProducten = new ArrayList<>();

        for (BestellingProduct bestellingProduct: lijstBestellingProducten) {
            Bestelling bestelling = bestellingProduct.getBestelling(); //Bestelling opvragen
            if (bestelling.getbestellingid().equals(bestellingid)) {
                lijstGezochteBestellingProducten.add(bestellingProduct);
            }
        }
        return lijstGezochteBestellingProducten;
    }

    public List<BestellingProduct> getBestellingProductenByProduct(Long productid) {
        List<BestellingProduct> lijstBestellingProducten = bestellingProductRepository.findAll();
        List<BestellingProduct> lijstGezochteBestellingProducten = new ArrayList<>();

        for (BestellingProduct bestellingProduct: lijstBestellingProducten) {
            Product product = bestellingProduct.getProduct();
            if (product.getproductid().equals(productid)) {
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
