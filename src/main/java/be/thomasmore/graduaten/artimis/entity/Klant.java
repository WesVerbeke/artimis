package be.thomasmore.graduaten.artimis.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Klant {

    public static final String NAME = "klant";
    public static final String FIRST_NAME = "Voornaam";
    public static final String LAST_NAME = "Achternaam";
    public static final String EMAIL = "Email";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long klantid;
    private String voornaam;
    private String achternaam;
    private String geboortedatum;
    private String email;
    private String telefoon;
    private String gebruikersnaam;
    private String wachtwoord;

    @OneToMany
    private List<Bestelling> bestellingen;

    //Constructor
    public Klant() {} //default constructor

    public Klant(Long klantid, String voornaam, String achternaam, String geboortedatum, String email,
                 String gebruikersnaam, String wachtwoord, List<Bestelling> bestellingen) {
        this.klantid = klantid;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.email = email;
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.bestellingen = bestellingen;
    }

    public Long getklantid() {
        return klantid;
    }

    public void setklantid(Long klantid) {
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

    public String getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(String geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    @Override
    public String toString()
    {
        return ""; //voorlopige returnwaarde
    }
}
