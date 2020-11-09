package be.thomasmore.graduaten.artimis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BestellingStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bestellingStatusCode;
    private String bestellingStatusBeschrijving;

    public BestellingStatus() {
    }

    public BestellingStatus(int bestellingStatusCode, String bestellingStatusBeschrijving) {
        this.bestellingStatusCode = bestellingStatusCode;
        this.bestellingStatusBeschrijving = bestellingStatusBeschrijving;
    }

    public int getBestellingStatusCode() {
        return bestellingStatusCode;
    }

    public void setBestellingStatusCode(int bestellingStatusCode) {
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
