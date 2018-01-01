package com.debtor.dzialek.view.util;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

import static com.debtor.dzialek.util.MessageProvider.getResourceBundle;

public class DialogsUtil {

    public static Optional<ButtonType> confirmExitApplicationDialog() {
        Alert confirmationDialog = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationDialog.setTitle(getResourceBundle().getString("view.exit.title"));
        confirmationDialog.setHeaderText(getResourceBundle().getString("view.exit.header"));
        Optional<ButtonType> result = confirmationDialog.showAndWait();
        return result;
    }
}
