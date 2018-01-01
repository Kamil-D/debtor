package com.debtor.dzialek.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static com.debtor.dzialek.view.util.TextFieldLimiter.addTextLimiterToTextArea;
import static com.debtor.dzialek.view.util.TextFieldLimiter.addTextLimiterToTextField;

@FXMLController
public class AddDebtorController implements Initializable {

    @FXML
    TextField contractNumberField;

    @FXML
    TextField firstNameField;

    @FXML
    TextField lastNameField;

    @FXML
    TextField phoneNumberField;

    @FXML
    TextArea noteField;

    @FXML
    TextField streetFirstField;

    @FXML
    TextField streetNumberFirstField;

    @FXML
    TextField codeFirstField;

    @FXML
    TextField cityFirstField;

    @FXML
    TextField streetSecondField;

    @FXML
    TextField streetNumberSecondField;

    @FXML
    TextField codeSecondField;

    @FXML
    TextField citySecondField;

    @FXML
    Button addDebtorButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bindings();
        addTextLimiterToTextFields();
    }

    private void bindings() {
        this.addDebtorButton.disableProperty().bind(contractNumberField.textProperty().isEmpty());
        this.addDebtorButton.disableProperty().bind(firstNameField.textProperty().isEmpty());
        this.addDebtorButton.disableProperty().bind(lastNameField.textProperty().isEmpty());
    }

    private void addTextLimiterToTextFields() {
        addTextLimiterToTextField(firstNameField, 30);
        addTextLimiterToTextField(lastNameField, 30);
        addTextLimiterToTextField(phoneNumberField, 9);
        addTextLimiterToTextArea(noteField, 500);
        addTextLimiterToTextField(streetFirstField, 50);
        addTextLimiterToTextField(streetNumberFirstField, 10);
        addTextLimiterToTextField(codeFirstField, 6);
        addTextLimiterToTextField(cityFirstField, 70);
        addTextLimiterToTextField(streetSecondField, 50);
        addTextLimiterToTextField(streetNumberSecondField, 10);
        addTextLimiterToTextField(codeSecondField, 6);
        addTextLimiterToTextField(citySecondField, 70);
    }


    public void addDebtorOnAction(ActionEvent actionEvent) {
        validateDebtorFields();
        validateMailingAddressFields();
        validateHomeAddressFields();
    }

    private void validateDebtorFields() {

    }

    private void validateMailingAddressFields() {

    }

    private void validateHomeAddressFields() {

    }
}
