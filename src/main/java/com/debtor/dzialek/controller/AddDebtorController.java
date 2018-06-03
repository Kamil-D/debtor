package com.debtor.dzialek.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

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

    private static final Pattern codePattern = Pattern.compile("[0-9]{2}-[0-9]{3}");
    private static final Pattern phoneNumberPattern = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{3}");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bindings();
        addTextLimiterToTextFields();
    }

    private void bindings() {
        this.addDebtorButton.disableProperty().bind(disableAddDebtorButton()); }

    private BooleanBinding disableAddDebtorButton() {
        BooleanBinding[] nameTabBindings = {
                emptyTextFieldBinding(contractNumberField),
                emptyTextFieldBinding(firstNameField),
                emptyTextFieldBinding(lastNameField),
                textFieldIsNotEmptyAndMatchRegex(codeFirstField, codePattern),
                textFieldIsNotEmptyAndMatchRegex(codeSecondField, codePattern),
                textFieldIsNotEmptyAndMatchRegex(phoneNumberField, phoneNumberPattern)};

        BooleanBinding disableAddDebtorButton = any(nameTabBindings);
        return disableAddDebtorButton;
    }

    private BooleanBinding emptyTextFieldBinding(TextField textField) {
        BooleanBinding binding = Bindings.createBooleanBinding(() ->
                textField.getText().trim().isEmpty(), textField.textProperty());
        return binding ;
    }


    private BooleanBinding any(BooleanBinding[] bindings) {
        return Bindings.createBooleanBinding(() ->
                Arrays.stream(bindings).anyMatch(BooleanBinding::get), bindings);
    }

    private BooleanBinding textFieldIsNotEmptyAndMatchRegex(TextField textField, Pattern pattern) {
        BooleanBinding booleanBinding = Bindings.and(
                textField.textProperty().isNotEmpty(),
                patternTextFieldBinding(textField, pattern));
        booleanBinding.addListener((obs, oldValue, newValue) -> {
            textField.pseudoClassStateChanged(PseudoClass.getPseudoClass("validation-error"), newValue);
        });
        return booleanBinding;
    }

    private BooleanBinding patternTextFieldBinding(TextField textField, Pattern pattern) {
        return Bindings.createBooleanBinding(() ->
                !pattern.matcher(textField.getText()).matches(), textField.textProperty());
    }

    private void addTextLimiterToTextFields() {
        addTextLimiterToTextField(firstNameField, 30);
        addTextLimiterToTextField(lastNameField, 30);
        addTextLimiterToTextField(phoneNumberField, 11);
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
