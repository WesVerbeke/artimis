package be.thomasmore.graduaten.artimis.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Bestelling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bestellingid;
    private Date bestellingdatum;

    @ManyToOne
    private Klant klant;

    @ManyToOne
    private BestellingStatus bestellingStatus;

    //constructors
    public Bestelling() {
    }

    public Bestelling(Date bestellingdatum, Klant klant, BestellingStatus bestellingStatus) {
        this.bestellingdatum = bestellingdatum;
        this.klant = klant;
        this.bestellingStatus = bestellingStatus;
    }

    //getters en setters

    public Long getBestellingid() {
        return bestellingid;
    }

    public void setBestellingid(Long bestellingid) {
        this.bestellingid = bestellingid;
    }

    public Date getBestellingdatum() {
        return bestellingdatum;
    }

    public void setBestellingdatum(Date bestellingdatum) {
        this.bestellingdatum = bestellingdatum;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public BestellingStatus getBestellingStatus() {
        return bestellingStatus;
    }

    public void setBestellingStatus(BestellingStatus bestellingStatus) {
        this.bestellingStatus = bestellingStatus;
    }
}
