package be.thomasmore.graduaten.artimis.model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class BestellingProduct {

    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bestellingproductid;
    private Boolean huurverkoop;
    private Integer aantal;
    private Date einddatum;
    private Boolean productbijklant;

    //Many to One relations with other entities
    @ManyToOne
    private Product product;

    @ManyToOne
    private Bestelling bestelling;

    //Constructors
    public BestellingProduct() {
    }

    public BestellingProduct(Boolean huurverkoop, Integer aantal, Product product, Bestelling bestelling) {
        this.huurverkoop = huurverkoop;
        this.aantal = aantal;
        this.product = product;
        this.bestelling = bestelling;
    }

    //getters en setters

    public Long getBestellingproductid() {
        return bestellingproductid;
    }

    public void setBestellingproductid(Long bestellingproductid) {
        this.bestellingproductid = bestellingproductid;
    }

    public Boolean getHuurverkoop() {
        return huurverkoop;
    }

    public void setHuurverkoop(Boolean huurverkoop) {
        this.huurverkoop = huurverkoop;
    }

    public Integer getAantal() {
        return aantal;
    }

    public void setAantal(Integer aantal) {
        this.aantal = aantal;
    }

    public Date getEinddatum() {
        return einddatum;
    }

    public void setEinddatum(Date einddatum) {
        this.einddatum = einddatum;
    }

    public Boolean getProductbijklant() {
        return productbijklant;
    }

    public void setProductbijklant(Boolean productbijklant) {
        this.productbijklant = productbijklant;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Bestelling getBestelling() {
        return bestelling;
    }

    public void setBestelling(Bestelling bestelling) {
        this.bestelling = bestelling;
    }
}
