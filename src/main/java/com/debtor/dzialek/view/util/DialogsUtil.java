package com.debtor.dzialek.view.util;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

import static com.debtor.dzialek.util.MessageProvider.getResourceBundle;

public class DialogsUtil {

    public static Optional<ButtonType> confirmOperationDialog(String titleTextPath, String headerTextPath) {
        Alert confirmationDialog = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationDialog.setTitle(getResourceBundle().getString(titleTextPath));
        confirmationDialog.setHeaderText(getResourceBundle().getString(headerTextPath));
        Optional<ButtonType> result = confirmationDialog.showAndWait();
        return result;
    }
}
