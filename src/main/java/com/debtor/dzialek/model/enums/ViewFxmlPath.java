package com.debtor.dzialek.model.enums;

import java.util.NoSuchElementException;

public enum ViewFxmlPath {

    LOGIN("/javafxviews/login.fxml"),
    MAIN_VIEW("/javafxviews/debtor_main.fxml"),
    ADD_DEBTOR("/javafxviews/add_debtor.fxml");

    ViewFxmlPath(String fxmlPath) {
        this.fxmlPath = fxmlPath;
    }

    private String fxmlPath;

    public String getFxmlPath() {
        return fxmlPath;
    }

    public ViewFxmlPath byFxmlPath(String fxmlPath) {
        for (ViewFxmlPath viewFxmlPath : ViewFxmlPath.values()) {
            if (viewFxmlPath.getFxmlPath().equals(fxmlPath))
                return viewFxmlPath;
        }
        String exceptionMessage = "enum ViewFxmlPath of fxmlPath " + fxmlPath + " does not exists";
        throw new NoSuchElementException(exceptionMessage);
    }

}
