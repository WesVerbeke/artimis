package be.thomasmore.graduaten.artimis.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Bestelling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bestellingId;
    private String referentie;
    private Date bestellingDatum;
    private String leverAdres;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Plaats plaats;

    @ManyToOne
    private BestellingStatus bestellingStatus;

    public Bestelling() {
    }

    public Bestelling(Long bestellingId, String referentie, Date bestellingDatum, String leverAdres, Customer customer, Plaats plaats, BestellingStatus bestellingStatus) {
        this.bestellingId = bestellingId;
        this.referentie = referentie;
        this.bestellingDatum = bestellingDatum;
        this.leverAdres = leverAdres;
        this.customer = customer;
        this.plaats = plaats;
        this.bestellingStatus = bestellingStatus;
    }

    public Long getBestellingId() {
        return bestellingId;
    }

    public void setBestellingId(Long bestellingId) {
        this.bestellingId = bestellingId;
    }

    public String getReferentie() {
        return referentie;
    }

    public void setReferentie(String referentie) {
        this.referentie = referentie;
    }

    public Date getBestellingDatum() {
        return bestellingDatum;
    }

    public void setBestellingDatum(Date bestellingDatum) {
        this.bestellingDatum = bestellingDatum;
    }

    public String getLeverAdres() {
        return leverAdres;
    }

    public void setLeverAdres(String leverAdres) {
        this.leverAdres = leverAdres;
    }

    public Customer getKlant() {
        return customer;
    }

    public void setKlant(Customer customer) {
        this.customer = customer;
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
