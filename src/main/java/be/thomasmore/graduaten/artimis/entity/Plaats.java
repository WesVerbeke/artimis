package be.thomasmore.graduaten.artimis.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Plaats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GenerationType.Table
    private int plaatsID;
    //ik wou eerst GenerationType.TABLE pakken omdat postcode een natural key is
    //maar alle research die ik hiervoor heb gedaan raadt dit af, onderstaande link legt uit waarom:
    //https://vladmihalcea.com/why-you-should-never-use-the-table-identifier-generator-with-jpa-and-hibernate/

    //in plaats daarvan de user wel op het attribuut postcode laten zoeken maar de database laten auto-increments maken via IDENTITY
    //!moeten er dan wel voor zorgen dat postcode unique identifier is in de database
    private String postcode;
    private String gemeente;

    @OneToMany
    private List<Bestelling> bestellingen;

    public Plaats() {
    }

    public Plaats(int plaatsID, String postcode, String gemeente, List<Bestelling> bestellingen) {
        this.plaatsID = plaatsID;
        this.postcode = postcode;
        this.gemeente = gemeente;
        this.bestellingen = bestellingen;
    }

    public int getPlaatsID() {
        return plaatsID;
    }

    public void setPlaatsID(int plaatsID) {
        this.plaatsID = plaatsID;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    public List<Bestelling> getBestellingen() {
        return bestellingen;
    }

    public void setBestellingen(List<Bestelling> bestellingen) {
        this.bestellingen = bestellingen;
    }

    @Override
    public String toString()
    {
        return this.postcode + " " + this.gemeente;
    }
}
