package be.thomasmore.graduaten.artimis.service;

import be.thomasmore.graduaten.artimis.entity.BestellingProduct;

import java.util.List;
import java.util.Optional;

public interface BestellingProductService {
    BestellingProduct getBestellingProductById(Long bestellingProductId);
    public List<BestellingProduct> getBestellingProducten();
    public Optional<BestellingProduct> getBestellingProductenByBestelling(Long bestellingId);
    public Optional<BestellingProduct> getBestellingProductenByProduct(Long productId);
    BestellingProduct addBestellingProduct(BestellingProduct bestellingProduct);
}
