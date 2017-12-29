package com.debtor.dzialek.model.db;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
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

    @OneToMany(targetEntity = Debtor.class)
    private Set<Debtor> songHashSet = new HashSet<>(0);

    // todo - add privileges

    // Constructor
    public User() { }


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

    public Set<Debtor> getSongHashSet() {
        return songHashSet;
    }

    public void setSongHashSet(Set<Debtor> songHashSet) {
        this.songHashSet = songHashSet;
    }
}
