package be.thomasmore.graduaten.artimis.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Klant {

    public static final String NAME = "klant";
    public static final String VOORNAAM = "Voornaam";
    public static final String ACHTERNAAM = "Achternaam";
    public static final String GEBOORTEDATUM = "Geboortedatum";
    public static final String EMAIL = "E-mail";
    public static final String GEBRUIKERSNAAM = "Gebruikersnaam";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long klantid;
    private String voornaam;
    private String achternaam;
    private String geboortedatum;
    private String adres;
    private String email;
    private String gebruikersnaam;
    private String wachtwoord;
    private Boolean beheerder;

    //Constructor
    public Klant() {
    }

    public Klant(String voornaam, String achternaam, String geboortedatum, String adres, String email, String gebruikersnaam, String wachtwoord, Boolean beheerder) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.adres = adres;
        this.email = email;
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.beheerder = beheerder;
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

    public String getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(String geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Boolean getBeheerder() {
        return beheerder;
    }

    public void setBeheerder(Boolean beheerder) {
        this.beheerder = beheerder;
    }

/*
    @Override
    public String toString()
    {
        return ""; //voorlopige returnwaarde
    }
*/
}
