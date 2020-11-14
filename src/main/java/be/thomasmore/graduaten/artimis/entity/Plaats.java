package be.thomasmore.graduaten.artimis.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Plaats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GenerationType.Table
    private int plaatsID;
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
