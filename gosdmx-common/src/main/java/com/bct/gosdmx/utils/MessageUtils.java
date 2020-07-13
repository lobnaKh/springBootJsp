package com.bct.gosdmx.utils;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.context.FacesContext;

public final class MessageUtils {

    private static final String MESSAGE = "message";

    private MessageUtils() {
    }

    public static String getMessageUsingSelectedLanguage(String key) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        FacesContext context = FacesContext.getCurrentInstance();
        Locale locale = context.getViewRoot().getLocale();
        ResourceBundle bundle = ResourceBundle.getBundle(MESSAGE, locale, loader);
        return bundle.getString(key);
    }

    public static String getMessageUsingDefaultLanguage(String key) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        ResourceBundle bundle = ResourceBundle.getBundle(MESSAGE, Locale.FRENCH, loader);
        return bundle.getString(key);
    }

    public static ResourceBundle getResourceBundleOfDefaultLanguage() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        return ResourceBundle.getBundle(MESSAGE, Locale.FRENCH, loader);
    }

    public static String getMessageUsingSelectedLanguage(String key, String param) {
        return MessageFormat.format(MessageUtils.getMessageUsingSelectedLanguage(key), param);
    }
    
    public static String getMessageUsingDefaultLanguage(String key, String param) {
        return MessageFormat.format(MessageUtils.getMessageUsingDefaultLanguage(key), param);
    }
}