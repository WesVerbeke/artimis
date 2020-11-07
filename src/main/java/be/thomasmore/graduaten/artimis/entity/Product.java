package be.thomasmore.graduaten.artimis.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    //Attributes
    private Long productId;
    private String productNaam;
    private String productBeschrijving;
    private Integer aantalSpelers;
    private Boolean huurVerkoop;
    private Date einddatum;
    private Double prijs;
    private int stock;

    //OnToMany relations with other entities
    @OneToMany
    private ProductCategorie productCategorie;
    private BestellingProduct bestellingProduct;

    //Constructors
    public Product() {
    }

    public Product(Long productId, String productNaam, String productBeschrijving, Integer aantalSpelers, Boolean huurVerkoop,
                   Double prijs, int stock, ProductCategorie productCategorie, BestellingProduct bestellingProduct) {
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
    public Long getProductId() { return productId; }

    public void setProductId(Long productId) { this.productId = productId; }

    public String getProductNaam() { return productNaam; }

    public void setProductNaam(String productNaam) { this.productNaam = productNaam; }

    public String getProductBeschrijving() { return productBeschrijving; }

    public void setProductBeschrijving(String productBeschrijving) { this.productBeschrijving = productBeschrijving; }

    public Integer getAantalSpelers() { return aantalSpelers; }

    public void setAantalSpelers(Integer aantalSpelers) { this.aantalSpelers = aantalSpelers; }

    public Boolean getHuurVerkoop() { return huurVerkoop; }

    public void setHuurVerkoop(Boolean huurVerkoop) { this.huurVerkoop = huurVerkoop; }

    public Date getEinddatum() { return einddatum; }

    public void setEinddatum(Date einddatum) { this.einddatum = einddatum; }

    public Double getPrijs() { return prijs; }

    public void setPrijs(Double prijs) { this.prijs = prijs; }

    public int getStock() { return stock; }

    public void setStock(int stock) { this.stock = stock; }

    public ProductCategorie getProductCategorie() { return productCategorie; }

    public void setProductCategorie(ProductCategorie productCategorie) { this.productCategorie = productCategorie; }

    public BestellingProduct getBestellingProduct() { return bestellingProduct; }

    public void setBestellingProduct(BestellingProduct bestellingProduct) { this.bestellingProduct = bestellingProduct; }
}
