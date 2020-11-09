package be.thomasmore.graduaten.artimis.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Product {

    //Fields
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productNaam;
    private String productBeschrijving;
    private Integer aantalSpelers;
    private Boolean huurVerkoop;
    private Double prijs;
    private Integer stock;
    private Integer stockHuurBeschikbaar;

    //OnToMany relations with other entities
    @OneToMany
    private List<ProductCategorie> productCategorie;

    @OneToMany
    private List<BestellingProduct> bestellingProduct;

    //Constructors
    public Product() {
    }

    public Product(Long productId, String productNaam, String productBeschrijving, Integer aantalSpelers,
                   Boolean huurVerkoop, Double prijs, Integer stock, List<ProductCategorie> productCategorie, List<BestellingProduct> bestellingProduct) {
        this.productId = productId;
        this.productNaam = productNaam;
        this.productBeschrijving = productBeschrijving;
        this.aantalSpelers = aantalSpelers;
        this.huurVerkoop = huurVerkoop;
        this.prijs = prijs;
        this.stock = stock;
        this.productCategorie = productCategorie;
        this.bestellingProduct = bestellingProduct;
    }

    //Getters & Setters

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductNaam() {
        return productNaam;
    }

    public void setProductNaam(String productNaam) {
        this.productNaam = productNaam;
    }

    public String getProductBeschrijving() {
        return productBeschrijving;
    }

    public void setProductBeschrijving(String productBeschrijving) {
        this.productBeschrijving = productBeschrijving;
    }

    public Integer getAantalSpelers() {
        return aantalSpelers;
    }

    public void setAantalSpelers(Integer aantalSpelers) {
        this.aantalSpelers = aantalSpelers;
    }

    public Boolean getHuurVerkoop() {
        return huurVerkoop;
    }

    public void setHuurVerkoop(Boolean huurVerkoop) {
        this.huurVerkoop = huurVerkoop;
    }

    public Double getPrijs() {
        return prijs;
    }

    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStockHuurBeschikbaar() {
        return stockHuurBeschikbaar;
    }

    public void setStockHuurBeschikbaar(Integer stockHuurBeschikbaar) {
        this.stockHuurBeschikbaar = stockHuurBeschikbaar;
    }

    public List<ProductCategorie> getProductCategorie() {
        return productCategorie;
    }

    public void setProductCategorie(List<ProductCategorie> productCategorie) {
        this.productCategorie = productCategorie;
    }

    public List<BestellingProduct> getBestellingProduct() {
        return bestellingProduct;
    }

    public void setBestellingProduct(List<BestellingProduct> bestellingProduct) {
        this.bestellingProduct = bestellingProduct;
    }
}
