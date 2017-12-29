package com.debtor.dzialek.model.db;


import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int id;

    @Column(nullable = false)
    @Type(type = "text")
    private String city;

    @Column(nullable = false)
    @Type(type = "text")
    private String code;

    @Column(nullable = false)
    @Type(type = "text")
    private String street;

    @Column(nullable = false)
    @Type(type = "text")
    private String streetNumber;

    @Column(nullable = false)
    @Type(type = "text")
    private String addressType;

    @ManyToOne(cascade = CascadeType.ALL)
    private Debtor debtor;


    // Constructor
    public Address() {  }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public Debtor getDebtor() {
        return debtor;
    }

    public void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }
}
