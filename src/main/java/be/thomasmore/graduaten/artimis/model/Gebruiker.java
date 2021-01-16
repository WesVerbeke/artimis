package be.thomasmore.graduaten.artimis.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Gebruiker {

    public static final String USERNAME = "E-mail";
    public static final String PASSWORD = "Wachtwoord";
    public static final String ENABLED = "Gebruiker Actief";

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String username;
    private String password;
    private Boolean enabled;

    @ManyToOne
    private Autoriteit autoriteit;

    @OneToOne
    private Klant klant;

    //constructors
    public Gebruiker() {
    }

    public Gebruiker(String username, String password, Boolean enabled, Autoriteit autoriteit, Klant klant) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.autoriteit = autoriteit;
        this.klant = klant;
    }

    //getters en setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Autoriteit getAutoriteit() {
        return autoriteit;
    }

    public void setAutoriteit(Autoriteit autoriteit) {
        this.autoriteit = autoriteit;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    //Methodes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gebruiker gebruiker = (Gebruiker) o;
        return username.equals(gebruiker.username);
    }

    @Override
    public int hashCode() {
        return 13513515* Objects.hash(username);
    }
}
