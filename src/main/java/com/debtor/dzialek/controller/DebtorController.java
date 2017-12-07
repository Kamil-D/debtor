package com.debtor.dzialek.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class DebtorController implements Initializable{

    @FXML
    Button newDebtorButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        newDebtorButton.setOnAction((ActionEvent e) -> {
            addNewDebtor();
        });
    }

    private void addNewDebtor() {
        Stage stage = new Stage();
        //Fill stage with content
        stage.show();
    }
}