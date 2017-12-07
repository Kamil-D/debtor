package com.debtor.dzialek.model.db;

import java.util.HashSet;
import java.util.Set;

public class Debtor {

    private String name;

    private String surname;

    private String contractNumber;

    private String phoneNumber;

    private String note;

    private Set<Address> songHashSet = new HashSet<>(0);

}
