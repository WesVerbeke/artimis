package be.thomasmore.graduaten.artimis.model;

import javax.persistence.*;

@Entity
public class Taal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taalid;
    private String taalnaam;

    //constructors
    public Taal(String taalnaam) {
        this.taalnaam = taalnaam;
    }

    public Taal() {
    }

    //getters en setters
    public Long getTaalid() {
        return taalid;
    }

    public void setTaalid(Long taalid) {
        this.taalid = taalid;
    }

    public String getTaalnaam() {
        return taalnaam;
    }

    public void setTaalnaam(String taalnaam) {
        this.taalnaam = taalnaam;
    }
}