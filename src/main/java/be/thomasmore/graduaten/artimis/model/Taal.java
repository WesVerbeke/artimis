package be.thomasmore.graduaten.artimis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Taal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taalid;
    private String taal;

    //constructors
    public Taal(String taal) {
        this.taal = taal;
    }

    public Taal() {
    }

    //getters en setters
    public Long getTaalid() {
        return taalid;
    }

    public void setTaalid(Long uitgeverid) {
        this.taalid = taalid;
    }

    public String getTaal() {
        return taal;
    }

    public void setTaal(String uitgever) {
        this.taal = taal;
    }
}