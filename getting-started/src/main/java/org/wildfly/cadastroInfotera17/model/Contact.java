package org.wildfly.cadastroInfotera17.model;

import jakarta.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    private String nmContact;
    private String nrTelephone;
    private String nmEmail;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNmContact() {
        return nmContact;
    }

    public void setNmContact(String nmContact) {
        this.nmContact = nmContact;
    }

    public String getNrTelephone() {
        return nrTelephone;
    }

    public void setNrTelephone(String nrTelephone) {
        this.nrTelephone = nrTelephone;
    }

    public String getNmEmail() {
        return nmEmail;
    }

    public void setNmEmail(String nmEmail) {
        this.nmEmail = nmEmail;
    }
}