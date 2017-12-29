package com.debtor.dzialek.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class AddDebtorController implements Initializable {

    @FXML
    Button addDebtorButton;

    @FXML
    TextField contractNumberField;

    @FXML
    TextField firstNameField;

    @FXML
    TextField lastNameField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.addDebtorButton.disableProperty().bind(contractNumberField.textProperty().isEmpty());
        this.addDebtorButton.disableProperty().bind(firstNameField.textProperty().isEmpty());
        this.addDebtorButton.disableProperty().bind(lastNameField.textProperty().isEmpty());
    }
}
