package be.thomasmore.graduaten.artimis.entity;


import javax.persistence.*;

@Entity
public class Categorie {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    //Attributes
    private Long categorieId;
    private String categorieNaam;
    private String categorieBeschrijving;

    @ManyToOne
    //Many to One relations with other entities
    private ProductCategorie productCategorie;

    //Constructors
    public Categorie() {
    }

    public Categorie(Long categorieId, String categorieNaam, String categorieBeschrijving, ProductCategorie productCategorie) {
        this.categorieId = categorieId;
        this.categorieNaam = categorieNaam;
        this.categorieBeschrijving = categorieBeschrijving;
        this.productCategorie = productCategorie;
    }

    //Getters & Setters

    public Long getCategorieId() { return categorieId; }

    public void setCategorieId(Long categorieId) { this.categorieId = categorieId; }

    public String getCategorieNaam() { return categorieNaam; }

    public void setCategorieNaam(String categorieNaam) { this.categorieNaam = categorieNaam; }

    public String getCategorieBeschrijving() { return categorieBeschrijving; }

    public void setCategorieBeschrijving(String categorieBeschrijving) { this.categorieBeschrijving = categorieBeschrijving; }

    public ProductCategorie getProductCategorie() { return productCategorie; }

    public void setProductCategorie(ProductCategorie productCategorie) { this.productCategorie = productCategorie; }
}
