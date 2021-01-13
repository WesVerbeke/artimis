package be.thomasmore.graduaten.artimis.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Plaats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GenerationType.Table
    private Long plaatsid;
    private String postcode;
    private String gemeente;


    public Plaats() {
    }

    public Plaats(Long plaatsid, String postcode, String gemeente, List<Bestelling> bestellingen) {
        this.plaatsid = plaatsid;
        this.postcode = postcode;
        this.gemeente = gemeente;
    }

    public Long getplaatsid() {
        return plaatsid;
    }

    public void setplaatsid(Long plaatsid) {
        this.plaatsid = plaatsid;
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

    @Override
    public String toString()
    {
        return this.postcode + " " + this.gemeente;
    }
}
