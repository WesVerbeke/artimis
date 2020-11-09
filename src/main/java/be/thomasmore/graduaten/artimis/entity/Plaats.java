package be.thomasmore.graduaten.artimis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plaats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GenerationType.Table
    private int plaatsID;
    //ik wou eerst GenerationType.TABLE pakken omdat postcode een natural key is
    //maar alle research die ik hiervoor heb gedaan raadt dit af, onderstaande link legt uit waarom:
    //https://vladmihalcea.com/why-you-should-never-use-the-table-identifier-generator-with-jpa-and-hibernate/

    //in plaats daarvan de user wel op het attribuut postcode laten zoeken maar de database laten auto-increments maken via IDENTITY
    //de vraag is dan wel: hoe zorgen we er voor dat Postcode unique identifier is? (kan dit in de code of enkel op database niveau?)
    private String postcode;
    private String gemeente;

    public Plaats() {
    }

    public Plaats(int plaatsID, String postcode, String gemeente) {
        this.plaatsID = plaatsID;
        this.postcode = postcode;
        this.gemeente = gemeente;
    }

    public int getPlaatsID() {
        return plaatsID;
    }

    public void setPlaatsID(int plaatsID) {
        this.plaatsID = plaatsID;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    @Override
    public String toString()
    {
        return this.postcode + " " + this.gemeente;
    }
}
