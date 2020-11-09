package be.thomasmore.graduaten.artimis.entity;

import javax.persistence.*;

@Entity
public class BestellingStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bestellingStatusCode;
    private String bestellingStatusBeschrijving;

    @OneToMany
    private Bestelling bestelling;

    public BestellingStatus() {
    }

    public BestellingStatus(Long bestellingStatusCode, String bestellingStatusBeschrijving) {
        this.bestellingStatusCode = bestellingStatusCode;
        this.bestellingStatusBeschrijving = bestellingStatusBeschrijving;
    }

    public int getBestellingStatusCode() {
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

    @Override
    public String toString() {
        return bestellingStatusCode + " " + bestellingStatusBeschrijving;
    }
}
