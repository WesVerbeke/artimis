package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.entity.BestellingProduct;

import java.util.List;

public interface BestellingProductService {
    BestellingProduct getBestellingProductById(Long bestellingProductId);
    List<BestellingProduct> getBestellingProducten();
    List<BestellingProduct> getBestellingProductenByBestelling(Long bestellingId);
    List<BestellingProduct> getBestellingProductenByProduct(Long productId);
    BestellingProduct addBestellingProduct(BestellingProduct bestellingProduct);
}
