package com.debtor.dzialek.controller;

import com.debtor.dzialek.view.util.DialogsUtil;
import de.felixroske.jfxsupport.FXMLController;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import static com.debtor.dzialek.view.util.FxmlUtil.openAddNewDebtorStage;

@FXMLController
public class MainDebtorController implements Initializable{

    @FXML
    Button newDebtorButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        newDebtorButton.setOnAction((ActionEvent e) -> {
            openAddNewDebtorStage();
        });
    }

    public void closeApplication() {
        Optional<ButtonType> result = DialogsUtil.confirmOperationDialog("view.exit.title", "view.exit.header");
        if(result.get()==ButtonType.OK){
            Platform.exit();
            System.exit(0);
        }
    }

}