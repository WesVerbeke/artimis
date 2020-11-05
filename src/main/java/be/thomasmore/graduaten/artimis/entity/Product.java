package be.thomasmore.graduaten.artimis.entity;


import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    //Attributes
    private Long productId;
    private String productNaam;
    private String productBeschrijving;
    private Double prijs;
    private Integer aantalSpelers;

    @OneToOne
    //One on One relations with other entities
    private Inventaris inventaris;
    private BestellingProduct bestellingProduct;

    @ManyToOne
    //Many to One relations with other entities
    private WinkelmandjeProducten winkelmandjeProducten;

    //Constructors
    public Product() {
    }

    public Product(String productNaam, Inventaris inventaris, BestellingProduct bestellingProduct) {
        this.productNaam = productNaam;
        this.inventaris = inventaris;
        this.bestellingProduct = bestellingProduct;
    }

    public Product(Long productId, String productNaam, String productBeschrijving, Double prijs, Integer aantalSpelers, Inventaris inventaris, BestellingProduct bestellingProduct) {
        this.productId = productId;
        this.productNaam = productNaam;
        this.productBeschrijving = productBeschrijving;
        this.prijs = prijs;
        this.aantalSpelers = aantalSpelers;
        this.inventaris = inventaris;
        this.bestellingProduct = bestellingProduct;
    }

    //Getters & Setters
    public Long getProductId() { return productId; }

    public  void setProductId(Long productId) {this.productId = productId;}

    public String getProductNaam() { return productNaam; }

    public void setProductNaam(String productNaam) { this.productNaam = productNaam; }

    public String getProductBeschrijving() { return productBeschrijving; }

    public void setProductBeschrijving(String productBeschrijving) { this.productBeschrijving = productBeschrijving; }

    public Double getPrijs() { return prijs; }

    public void setPrijs(Double prijs) { this.prijs = prijs; }

    public Integer getAantalSpelers() { return aantalSpelers; }

    public void setAantalSpelers(Integer aantalSpelers) { this.aantalSpelers = aantalSpelers; }

    public Inventaris getInventaris() { return inventaris; }

    public void setInventaris(Inventaris inventaris) { this.inventaris = inventaris; }

    public BestellingProduct getBestellingProduct() { return bestellingProduct; }

    public void setBestellingProduct(BestellingProduct bestellingProduct) { this.bestellingProduct = bestellingProduct; }
}
