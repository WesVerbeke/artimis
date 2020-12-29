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
    private Long productid;
    private String productnaam;
    private String productbeschrijving;
    private Integer aantalspelers;
    private Boolean huurverkoop;
    private Double prijs;
    private Integer stock;

    //OnToMany relations with other entities
    @OneToMany
    private List<ProductCategorie> productCategorie;

    @OneToMany
    private List<BestellingProduct> bestellingProduct;

    //Constructors
    public Product() {
    }

    public Product(Long productid, String productnaam, String productbeschrijving, Integer aantalspelers,
                   Boolean huurverkoop, Double prijs, Integer stock, List<ProductCategorie> productCategorie, List<BestellingProduct> bestellingProduct) {
        this.productid = productid;
        this.productnaam = productnaam;
        this.productbeschrijving = productbeschrijving;
        this.aantalspelers = aantalspelers;
        this.huurverkoop = huurverkoop;
        this.prijs = prijs;
        this.stock = stock;
        this.productCategorie = productCategorie;
        this.bestellingProduct = bestellingProduct;
    }

    //Getters & Setters

    public Long getproductid() {
        return productid;
    }

    public void setproductid(Long productid) {
        this.productid = productid;
    }

    public String getproductnaam() {
        return productnaam;
    }

    public void setproductnaam(String productnaam) {
        this.productnaam = productnaam;
    }

    public String getproductbeschrijving() {
        return productbeschrijving;
    }

    public void setproductbeschrijving(String productbeschrijving) {
        this.productbeschrijving = productbeschrijving;
    }

    public Integer getaantalspelers() {
        return aantalspelers;
    }

    public void setaantalspelers(Integer aantalspelers) {
        this.aantalspelers = aantalspelers;
    }

    public Boolean gethuurverkoop() {
        return huurverkoop;
    }

    public void sethuurverkoop(Boolean huurverkoop) {
        this.huurverkoop = huurverkoop;
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
