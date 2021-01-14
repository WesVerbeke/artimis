package be.thomasmore.graduaten.artimis.model;

import javax.persistence.*;

@Entity
public class BestellingStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bestellingstatusid;
    private String bestellingstatusbeschrijving;

    //constructors
    public BestellingStatus() {
    }

    public BestellingStatus(String bestellingstatusbeschrijving) {
        this.bestellingstatusbeschrijving = bestellingstatusbeschrijving;
    }

    //getters en setters
    public Long getBestellingstatusid() {
        return bestellingstatusid;
    }

    public void setBestellingstatusid(Long bestellingstatusid) {
        this.bestellingstatusid = bestellingstatusid;
    }

    public String getBestellingstatusbeschrijving() {
        return bestellingstatusbeschrijving;
    }

    public void setBestellingstatusbeschrijving(String bestellingstatusbeschrijving) {
        this.bestellingstatusbeschrijving = bestellingstatusbeschrijving;
    }

    //methodes
    @Override
    public String toString() {
        return bestellingstatusid + " " + bestellingstatusbeschrijving;
    }
}
