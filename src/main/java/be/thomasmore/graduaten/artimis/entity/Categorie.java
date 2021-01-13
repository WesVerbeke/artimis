package be.thomasmore.graduaten.artimis.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Categorie {

    //Fields
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long categorieid;
    private String categorienaam;

    //Constructors
    public Categorie() {
    }

    public Categorie(Long categorieid, String categorienaam, List<ProductCategorie> productCategorie) {
        this.categorieid = categorieid;
        this.categorienaam = categorienaam;
    }

    //Getters & Setters
    public Long getcategorieid() {
        return categorieid;
    }

    public void setcategorieid(Long categorieid) {
        this.categorieid = categorieid;
    }

    public String getcategorienaam() {
        return categorienaam;
    }

    public void setcategorienaam(String categorienaam) {
        this.categorienaam = categorienaam;
    }
}
