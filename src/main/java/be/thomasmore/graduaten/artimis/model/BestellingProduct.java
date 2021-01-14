package be.thomasmore.graduaten.artimis.model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class BestellingProduct {

    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bestellingproductid;
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

    public BestellingProduct(Long bestellingproductid, Integer aantal, Product product, Bestelling bestelling) {
        this.bestellingproductid = bestellingproductid;
        this.aantal = aantal;
        this.product = product;
        this.bestelling = bestelling;
    }


    //Getters & Setters

    public Long getbestellingproductid() { return bestellingproductid; }

    public void setbestellingproductid(Long bestellingproductid) { this.bestellingproductid = bestellingproductid; }

    public Integer getAantal() { return aantal; }

    public void setAantal(Integer aantal) { this.aantal = aantal; }

    public Date getEinddatum() { return einddatum; }

    public void setEinddatum(Date einddatum) { this.einddatum = einddatum; }

    public Product getProduct() { return product; }

    public void setProduct(Product product) { this.product = product; }

    public Bestelling getBestelling() { return bestelling; }

    public void setBestelling(Bestelling bestelling) { this.bestelling = bestelling; }
}
