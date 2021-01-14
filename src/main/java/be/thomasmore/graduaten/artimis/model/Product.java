package be.thomasmore.graduaten.artimis.model;


import javax.persistence.*;

@Entity
public class Product {

    //Fields
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long productid;
    private String productnaam;
    private String productbeschrijving;
    private String afbeelding;
    private Integer aantalspelers;
    private Integer minimumleeftijd;
    private Double prijs;
    private Double prijshuur;
    private Integer stockverkoop;
    private Integer stockhuur;

    @ManyToOne
    private Taal taal;

    @ManyToOne
    private Uitgever uitgever;

    //Constructors
    public Product() {
    }

    public Product(String productnaam, String productbeschrijving, String afbeelding, Integer aantalspelers, Integer minimumleeftijd, Double prijs, Double prijshuur, Integer stockverkoop, Integer stockhuur, Taal taal, Uitgever uitgever) {
        this.productnaam = productnaam;
        this.productbeschrijving = productbeschrijving;
        this.afbeelding = afbeelding;
        this.aantalspelers = aantalspelers;
        this.minimumleeftijd = minimumleeftijd;
        this.prijs = prijs;
        this.prijshuur = prijshuur;
        this.stockverkoop = stockverkoop;
        this.stockhuur = stockhuur;
        this.taal = taal;
        this.uitgever = uitgever;
    }

    //getters en setters

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public String getProductnaam() {
        return productnaam;
    }

    public void setProductnaam(String productnaam) {
        this.productnaam = productnaam;
    }

    public String getProductbeschrijving() {
        return productbeschrijving;
    }

    public void setProductbeschrijving(String productbeschrijving) {
        this.productbeschrijving = productbeschrijving;
    }

    public String getAfbeelding() {
        return afbeelding;
    }

    public void setAfbeelding(String afbeelding) {
        this.afbeelding = afbeelding;
    }

    public Integer getAantalspelers() {
        return aantalspelers;
    }

    public void setAantalspelers(Integer aantalspelers) {
        this.aantalspelers = aantalspelers;
    }

    public Integer getMinimumleeftijd() {
        return minimumleeftijd;
    }

    public void setMinimumleeftijd(Integer minimumleeftijd) {
        this.minimumleeftijd = minimumleeftijd;
    }

    public Double getPrijs() {
        return prijs;
    }

    public void setPrijs(Double prijs) {
        this.prijs = prijs;
    }

    public Double getPrijshuur() {
        return prijshuur;
    }

    public void setPrijshuur(Double prijshuur) {
        this.prijshuur = prijshuur;
    }

    public Integer getStockverkoop() {
        return stockverkoop;
    }

    public void setStockverkoop(Integer stockverkoop) {
        this.stockverkoop = stockverkoop;
    }

    public Integer getStockhuur() {
        return stockhuur;
    }

    public void setStockhuur(Integer stockhuur) {
        this.stockhuur = stockhuur;
    }

    public Taal getTaal() {
        return taal;
    }

    public void setTaal(Taal taal) {
        this.taal = taal;
    }

    public Uitgever getUitgever() {
        return uitgever;
    }

    public void setUitgever(Uitgever uitgever) {
        this.uitgever = uitgever;
    }
}
