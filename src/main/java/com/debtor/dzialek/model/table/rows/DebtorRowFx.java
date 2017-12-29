package com.debtor.dzialek.model.table.rows;

import com.debtor.dzialek.model.db.Debtor;
import javafx.beans.property.SimpleStringProperty;

/**
 * Row presenting Debtor record in the TableView
 */
public class DebtorRowFx {

    private SimpleStringProperty contractNumber;
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty phoneNumber;
    private SimpleStringProperty note;

    private Debtor debtor;

    public DebtorRowFx(Debtor debtor) {
        this.debtor = debtor;
        setSimpleProperties(debtor);
    }

    private void setSimpleProperties(Debtor debtor) {
        contractNumber = new SimpleStringProperty(debtor.getContractNumber());
        firstName = new SimpleStringProperty(debtor.getFirstName());
        lastName = new SimpleStringProperty(debtor.getLastName());
        phoneNumber = new SimpleStringProperty(debtor.getPhoneNumber());
        note = new SimpleStringProperty(debtor.getNote());
    }

    public String getContractNumber() {
        return contractNumber.get();
    }

    public SimpleStringProperty contractNumberProperty() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber.set(contractNumber);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public SimpleStringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public String getNote() {
        return note.get();
    }

    public SimpleStringProperty noteProperty() {
        return note;
    }

    public void setNote(String note) {
        this.note.set(note);
    }

    public Debtor getDebtor() {
        return debtor;
    }

    public void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }
}
