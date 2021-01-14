package be.thomasmore.graduaten.artimis.model;

import javax.persistence.*;

@Entity
public class Uitgever {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uitgeverid;
    private String uitgevernaam;

    //constructors
    public Uitgever() {
    }

    public Uitgever(String uitgevernaam) {
        this.uitgevernaam = uitgevernaam;
    }

    //getters en setters

    public Long getUitgeverid() {
        return uitgeverid;
    }

    public void setUitgeverid(Long uitgeverid) {
        this.uitgeverid = uitgeverid;
    }

    public String getUitgevernaam() {
        return uitgevernaam;
    }

    public void setUitgevernaam(String uitgevernaam) {
        this.uitgevernaam = uitgevernaam;
    }
}
