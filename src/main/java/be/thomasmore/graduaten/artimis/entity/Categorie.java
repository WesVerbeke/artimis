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
    private BestellingProduct bestellingProduct;

    //Constructors


    //Getters & Setters


}
