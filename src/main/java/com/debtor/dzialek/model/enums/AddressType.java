package com.debtor.dzialek.model.enums;

import java.util.NoSuchElementException;

public enum AddressType {

    HOME_ADDRESS("Adres zamieszkania"),
    MAILING_ADDRESS("Adres korespondencyjny");

    AddressType(String code) {
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }

    public AddressType byCode(String code) {
        for (AddressType addressType : AddressType.values()) {
            if (addressType.getCode().equals(code))
                return addressType;
        }
        String exceptionMessage = "enum AddressType of code " + code + " does not exists";
        throw new NoSuchElementException(exceptionMessage);
    }
}
