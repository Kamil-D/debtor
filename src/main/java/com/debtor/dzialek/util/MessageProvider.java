package com.debtor.dzialek.util;

import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Provides two types of classes providing internationalization for Spring Boot and JavaFX
 */
public class MessageProvider {

    /**
     * ResourceBundleMessageSource is for Internationalization in Spring
     */
    private static ResourceBundleMessageSource messageSource;

    /**
     * ResourceBundle is for Internationalization in JavaFX
     */
    private static ResourceBundle resourceBundle;

    private static Locale locale;

    public static void initializeMessageSource() {
        locale = new Locale("pl");
        messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages/messages");
    }

    public static void initializeResourceBundleForFxml() {
        resourceBundle = ResourceBundle.getBundle("messages.messages");
    }

    public static String getMessage(String messagePath) {
        return messageSource.getMessage(messagePath, null, locale);
    }

    public static ResourceBundleMessageSource getMessageSource() {
        return messageSource;
    }

    public static ResourceBundle getResourceBundle() {
        return resourceBundle;
    }
}
