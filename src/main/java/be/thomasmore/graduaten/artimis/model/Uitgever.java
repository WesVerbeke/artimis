package be.thomasmore.graduaten.artimis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Uitgever {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uitgeverid;
    private String uitgever;

    //constructors
    public Uitgever(String uitgever) {
        this.uitgever = uitgever;
    }

    public Uitgever() {
    }

    //getters en setters
    public Long getUitgeverid() {
        return uitgeverid;
    }

    public void setUitgeverid(Long uitgeverid) {
        this.uitgeverid = uitgeverid;
    }

    public String getUitgever() {
        return uitgever;
    }

    public void setUitgever(String uitgever) {
        this.uitgever = uitgever;
    }
}
