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

    public BestellingStatus(Long bestellingStatusCode, String bestellingStatusBeschrijving, List<Bestelling> bestelling) {
        this.bestellingStatusCode = bestellingStatusCode;
        this.bestellingStatusBeschrijving = bestellingStatusBeschrijving;
        this.bestelling = bestelling;
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

    public List<Bestelling> getBestelling() {
        return bestelling;
    }

    public void setBestelling(List<Bestelling> bestelling) {
        this.bestelling = bestelling;
    }

    @Override
    public String toString() {
        return bestellingStatusCode + " " + bestellingStatusBeschrijving;
    }
}
