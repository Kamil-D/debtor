package com.debtor.dzialek.model.db;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int id;

    @Column(nullable = false)
    @Type(type = "text")
    private String username;

    @Column(nullable = false)
    @Type(type = "text")
    private String password;

    @Column(nullable = false)
    @Type(type = "text")
    private String emailAddress;

    // todo - add privileges


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
