package be.thomasmore.graduaten.artimis.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class BestellingProduct {

    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bestellingProductId;
    private Integer productId;
    private Integer bestellingId;
    private Integer aantal;
    private Date einddatum;

    //Many to One relations with other entities
    @ManyToOne
    private Product product;

    @ManyToOne
    private Bestelling bestelling;

    //Constructors
    public BestellingProduct() {
    }

    //public BestellingProduct(Integer bestellingProductId, Integer productId, Integer bestellingId, Integer aantal, Date einddatum, Product product, Bestelling bestelling) {
    //    this.bestellingProductId = bestellingProductId;
    //    this.productId = productId;
    //    this.bestellingId = bestellingId;
    //    this.aantal = aantal;
    //    this.einddatum = einddatum;
    //    this.product = product;
    //    this.bestelling = bestelling;
    //}

    public BestellingProduct(Integer bestellingProductId, Integer productId, Integer bestellingId, Integer aantal, Product product, Bestelling bestelling) {
        this.bestellingProductId = bestellingProductId;
        this.productId = productId;
        this.bestellingId = bestellingId;
        this.aantal = aantal;
        this.product = product;
        this.bestelling = bestelling;
    }


    //Getters & Setters

    public Integer getBestellingProductId() { return bestellingProductId; }

    public void setBestellingProductId(Integer bestellingProductId) { this.bestellingProductId = bestellingProductId; }

    public Integer getProductId() { return productId; }

    public void setProductId(Integer productId) { this.productId = productId; }

    public Integer getBestellingId() { return bestellingId; }

    public void setBestellingId(Integer bestellingId) { this.bestellingId = bestellingId; }

    public Integer getAantal() { return aantal; }

    public void setAantal(Integer aantal) { this.aantal = aantal; }

    public Date getEinddatum() { return einddatum; }

    public void setEinddatum(Date einddatum) { this.einddatum = einddatum; }

    public Product getProduct() { return product; }

    public void setProduct(Product product) { this.product = product; }

    public Bestelling getBestelling() { return bestelling; }

    public void setBestelling(Bestelling bestelling) { this.bestelling = bestelling; }
}
