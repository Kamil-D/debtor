package com.debtor.dzialek.model.db;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Debtor {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private String contractNumber;

    @Column(nullable = false)
    @Type(type = "text")
    private String firstName;

    @Column(nullable = false)
    @Type(type = "text")
    private String lastName;

    @Column(nullable = false)
    @Type(type = "text")
    private String phoneNumber;

    @Column(nullable = true)
    @Type(type = "text")
    private String note;

    @OneToMany(targetEntity = Address.class, mappedBy = "debtor")
    private Set<Address> songHashSet = new HashSet<>(0);


    // Constructor
    public Debtor(String contractNumber, String firstName, String lastName) {
        this.contractNumber = contractNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Set<Address> getSongHashSet() {
        return songHashSet;
    }

    public void setSongHashSet(Set<Address> songHashSet) {
        this.songHashSet = songHashSet;
    }
}
