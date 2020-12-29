package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.entity.BestellingProduct;

import java.util.List;

public interface BestellingProductService {
    BestellingProduct getBestellingProductById(Long bestellingproductid);
    public List<BestellingProduct> getBestellingProducten();
    public List<BestellingProduct> getBestellingProductenByBestelling(Long bestellingid);
    public List<BestellingProduct> getBestellingProductenByProduct(Long productid);
    BestellingProduct addBestellingProduct(BestellingProduct bestellingProduct);
}
