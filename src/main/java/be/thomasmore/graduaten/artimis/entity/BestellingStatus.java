package be.thomasmore.graduaten.artimis.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BestellingStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bestellingstatusid;
    private String bestellingstatusbeschrijving;

    @OneToMany
    private List <Bestelling> bestelling;

    public BestellingStatus() {
    }

    public BestellingStatus(Long bestellingstatusid, String bestellingstatusbeschrijving, List<Bestelling> bestelling) {
        this.bestellingstatusid = bestellingstatusid;
        this.bestellingstatusbeschrijving = bestellingstatusbeschrijving;
        this.bestelling = bestelling;
    }

    public Long getbestellingstatusid() {
        return bestellingstatusid;
    }

    public void setbestellingstatusid(Long bestellingStatusCode) {
        this.bestellingstatusid = bestellingStatusCode;
    }

    public String getbestellingstatusbeschrijving() {
        return bestellingstatusbeschrijving;
    }

    public void setbestellingstatusbeschrijving(String bestellingstatusbeschrijving) {
        this.bestellingstatusbeschrijving = bestellingstatusbeschrijving;
    }

    public List<Bestelling> getBestelling() {
        return bestelling;
    }

    public void setBestelling(List<Bestelling> bestelling) {
        this.bestelling = bestelling;
    }

    @Override
    public String toString() {
        return bestellingstatusid + " " + bestellingstatusbeschrijving;
    }
}
