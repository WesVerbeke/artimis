package be.thomasmore.graduaten.artimis.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class BestellingStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bestellingstatusid;
    private String bestellingstatusbeschrijving;

    public BestellingStatus() {
    }

    public BestellingStatus(Long bestellingstatusid, String bestellingstatusbeschrijving, List<Bestelling> bestelling) {
        this.bestellingstatusid = bestellingstatusid;
        this.bestellingstatusbeschrijving = bestellingstatusbeschrijving;
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

    @Override
    public String toString() {
        return bestellingstatusid + " " + bestellingstatusbeschrijving;
    }
}
