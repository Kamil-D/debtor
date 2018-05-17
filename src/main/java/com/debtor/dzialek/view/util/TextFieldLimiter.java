package com.debtor.dzialek.view.util;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Created by Kamil on 2017-03-12.
 */
public class TextFieldLimiter {


    public static void addTextLimiterToTextField(final TextField textField, final int maxLength) {
        textField.textProperty().addListener((ov, oldValue, newValue) -> {
                    if (textField.getText().length() > maxLength) {
                        String s = textField.getText().substring(0, maxLength);
                        textField.setText(s);
                    }
                }
        );
    }

    public static void addTextLimiterToTextArea(final TextArea textField, final int maxLength) {
        textField.textProperty().addListener((ov, oldValue, newValue) -> {
                    if (textField.getText().length() > maxLength) {
                        String s = textField.getText().substring(0, maxLength);
                        textField.setText(s);
                    }
                }
        );
    }

}
