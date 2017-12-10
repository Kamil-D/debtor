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
    private String name;

    @Column(nullable = false)
    @Type(type = "text")
    private String surname;

    @Column(nullable = false)
    @Type(type = "text")
    private String phoneNumber;

    @Column(nullable = true)
    @Type(type = "text")
    private String note;

    @OneToMany(targetEntity = Address.class, mappedBy = "debtor")
    private Set<Address> songHashSet = new HashSet<>(0);


    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
