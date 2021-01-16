package be.thomasmore.graduaten.artimis.model;

import javax.persistence.*;

@Entity
public class Plaats {
    public static final String NAME = "plaats";
    public static final String POSTCODE = "Postcode";
    public static final String GEMEENTE = "Gemeente";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GenerationType.Table
    private Long plaatsid;
    private String postcode;
    private String gemeente;

    //constructors
    public Plaats() {
    }

    public Plaats(String postcode, String gemeente) {
        this.postcode = postcode;
        this.gemeente = gemeente;
    }

    //getters en setters

    public Long getPlaatsid() {
        return plaatsid;
    }

    public void setPlaatsid(Long plaatsid) {
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
}
