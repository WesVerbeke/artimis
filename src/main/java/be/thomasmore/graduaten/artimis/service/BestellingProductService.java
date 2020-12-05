package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.entity.BestellingProduct;

import java.util.List;

public interface BestellingProductService {
    BestellingProduct getBestellingProductById(Long bestellingProductId);
    public List<BestellingProduct> getBestellingProducten();
    public List<BestellingProduct> getBestellingProductenByBestelling(Long bestellingId);
    public List<BestellingProduct> getBestellingProductenByProduct(Long productId);
    BestellingProduct addBestellingProduct(BestellingProduct bestellingProduct);
}
