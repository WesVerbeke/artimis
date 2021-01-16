package be.thomasmore.graduaten.artimis.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Klant {

    public static final String NAME = "klant";
    public static final String VOORNAAM = "Voornaam";
    public static final String ACHTERNAAM = "Achternaam";
    public static final String GEBOORTEDATUM = "Geboortedatum";
    public static final String ADRES = "Adres";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long klantid;
    private String voornaam;
    private String achternaam;
    private Date geboortedatum;
    private String adres;

    @ManyToOne
    private Plaats plaats;

    //Constructor
    public Klant() {
    }

    public Klant(String voornaam, String achternaam, Date geboortedatum, String adres, Plaats plaats) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.adres = adres;
        this.plaats = plaats;
    }

    //getters en setters
    public Long getKlantid() {
        return klantid;
    }

    public void setKlantid(Long klantid) {
        this.klantid = klantid;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Plaats getPlaats() {
        return plaats;
    }

    public void setPlaats(Plaats plaats) {
        this.plaats = plaats;
    }
}
