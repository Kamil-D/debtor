package com.debtor.dzialek.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static com.debtor.dzialek.view.util.FxmlUtil.openAddNewDebtorWindow;

@FXMLController
public class MainDebtorController implements Initializable{

    @FXML
    Button newDebtorButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        newDebtorButton.setOnAction((ActionEvent e) -> {
            openAddNewDebtorWindow();
        });
    }

}