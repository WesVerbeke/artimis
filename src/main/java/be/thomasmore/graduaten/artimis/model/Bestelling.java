package be.thomasmore.graduaten.artimis.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Bestelling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bestellingid;
    private String referentie;
    private Date bestellingdatum;
    private String leveradres;

    @ManyToOne
    private Klant klant;

    @ManyToOne
    private Plaats plaats;

    @ManyToOne
    private BestellingStatus bestellingStatus;

    public Bestelling() {
    }

    public Bestelling(Long bestellingid, String referentie, Date bestellingdatum, String leveradres, Klant klant, Plaats plaats, BestellingStatus bestellingStatus) {
        this.bestellingid = bestellingid;
        this.referentie = referentie;
        this.bestellingdatum = bestellingdatum;
        this.leveradres = leveradres;
        this.klant = klant;
        this.plaats = plaats;
        this.bestellingStatus = bestellingStatus;
    }

    public Long getbestellingid() {
        return bestellingid;
    }

    public void setbestellingid(Long bestellingid) {
        this.bestellingid = bestellingid;
    }

    public String getReferentie() {
        return referentie;
    }

    public void setReferentie(String referentie) {
        this.referentie = referentie;
    }

    public Date getbestellingdatum() {
        return bestellingdatum;
    }

    public void setbestellingdatum(Date bestellingdatum) {
        this.bestellingdatum = bestellingdatum;
    }

    public String getleveradres() {
        return leveradres;
    }

    public void setleveradres(String leveradres) {
        this.leveradres = leveradres;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public Plaats getPlaats() {
        return plaats;
    }

    public void setPlaats(Plaats plaats) {
        this.plaats = plaats;
    }

    public BestellingStatus getBestellingStatus() {
        return bestellingStatus;
    }

    public void setBestellingStatus(BestellingStatus bestellingStatus) {
        this.bestellingStatus = bestellingStatus;
    }
}
