package de.demmer.dennis.opentoscatestapp;

/**
 * Einfaches POJO um Informationen ueber Nutzer zu speichern
 *
 */
public class User {

    private int id;
    private String firstname;
    private String surname;
    private String alias;

    public User(int id, String firstname, String surname, String alias) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.alias = alias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
