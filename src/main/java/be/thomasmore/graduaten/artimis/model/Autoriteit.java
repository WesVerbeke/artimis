package be.thomasmore.graduaten.artimis.model;

import javax.persistence.*;

@Entity
public class Autoriteit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long autoriteitid;
    private String authority;

    //constructors
    public Autoriteit() {
    }

    public Autoriteit(String authority) {
        this.authority = authority;
    }

    //getters en setters
    public Long getAutoriteitid() {
        return autoriteitid;
    }

    public void setAutoriteitid(Long autoriteitid) {
        this.autoriteitid = autoriteitid;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
