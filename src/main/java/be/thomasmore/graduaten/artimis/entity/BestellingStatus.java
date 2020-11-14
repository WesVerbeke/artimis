package be.thomasmore.graduaten.artimis.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BestellingStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bestellingStatusId;
    private String bestellingStatusBeschrijving;

    @OneToMany
    private List <Bestelling> bestelling;

    public BestellingStatus() {
    }

    public BestellingStatus(Long bestellingStatusId, String bestellingStatusBeschrijving, List<Bestelling> bestelling) {
        this.bestellingStatusId = bestellingStatusId;
        this.bestellingStatusBeschrijving = bestellingStatusBeschrijving;
        this.bestelling = bestelling;
    }

    public Long getBestellingStatusId() {
        return bestellingStatusId;
    }

    public void setBestellingStatusId(Long bestellingStatusCode) {
        this.bestellingStatusId = bestellingStatusCode;
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
        return bestellingStatusId + " " + bestellingStatusBeschrijving;
    }
}
