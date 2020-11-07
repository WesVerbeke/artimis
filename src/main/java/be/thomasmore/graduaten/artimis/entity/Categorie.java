package be.thomasmore.graduaten.artimis.entity;


import javax.persistence.*;

@Entity
public class Categorie {

    //Fields
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long categorieId;
    private String categorieNaam;

    //One to Many relations with other entities
    @OneToMany
    private ProductCategorie productCategorie;

    //Constructors
    public Categorie() {
    }

    public Categorie(Long categorieId, String categorieNaam, ProductCategorie productCategorie) {
        this.categorieId = categorieId;
        this.categorieNaam = categorieNaam;
        this.productCategorie = productCategorie;
    }

    //Getters & Setters
    public Long getCategorieId() { return categorieId; }

    public void setCategorieId(Long categorieId) { this.categorieId = categorieId; }

    public String getCategorieNaam() { return categorieNaam; }

    public void setCategorieNaam(String categorieNaam) { this.categorieNaam = categorieNaam; }

    public ProductCategorie getProductCategorie() { return productCategorie; }

    public void setProductCategorie(ProductCategorie productCategorie) { this.productCategorie = productCategorie; }
}
