package be.thomasmore.graduaten.artimis.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BestellingStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bestellingStatusCode;
    private String bestellingStatusBeschrijving;

    @OneToMany
    private List <Bestelling> bestelling;

    public BestellingStatus() {
    }

    public BestellingStatus(Long bestellingStatusCode, String bestellingStatusBeschrijving, Bestelling bestelling) {
        this.bestellingStatusCode = bestellingStatusCode;
        this.bestellingStatusBeschrijving = bestellingStatusBeschrijving;
        this.bestelling = (List<Bestelling>) bestelling;
    }

    public Long getBestellingStatusCode() {
        return bestellingStatusCode;
    }

    public void setBestellingStatusCode(Long bestellingStatusCode) {
        this.bestellingStatusCode = bestellingStatusCode;
    }

    public String getBestellingStatusBeschrijving() {
        return bestellingStatusBeschrijving;
    }

    public void setBestellingStatusBeschrijving(String bestellingStatusBeschrijving) {
        this.bestellingStatusBeschrijving = bestellingStatusBeschrijving;
    }

    public Bestelling getBestelling() {
        return (Bestelling) bestelling;
    }

    public void setBestelling(Bestelling bestelling) {
        this.bestelling = (List<Bestelling>) bestelling;
    }

    @Override
    public String toString() {
        return bestellingStatusCode + " " + bestellingStatusBeschrijving;
    }
}
