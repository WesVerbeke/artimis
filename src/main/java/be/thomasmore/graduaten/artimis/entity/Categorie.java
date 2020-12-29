package be.thomasmore.graduaten.artimis.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie {

    //Fields
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long categorieId;
    private String categorienaam;

    //One to Many relations with other entities
    @OneToMany
    private List<ProductCategorie> productCategorie;

    //Constructors
    public Categorie() {
    }

    public Categorie(Long categorieId, String categorienaam, List<ProductCategorie> productCategorie) {
        this.categorieId = categorieId;
        this.categorienaam = categorienaam;
        this.productCategorie = productCategorie;
    }

    //Getters & Setters
    public Long getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Long categorieId) {
        this.categorieId = categorieId;
    }

    public String getCategorieNaam() {
        return categorienaam;
    }

    public void setCategorieNaam(String categorienaam) {
        this.categorienaam = categorienaam;
    }

    public List<ProductCategorie> getProductCategorie() {
        return productCategorie;
    }

    public void setProductCategorie(List<ProductCategorie> productCategorie) {
        this.productCategorie = productCategorie;
    }
}
