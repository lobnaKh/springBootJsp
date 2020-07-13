package com.bct.gosdmx.web.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.bct.gosdmx.utils.MessageUtils;



public final class GosdmxGrowlMessage {

    private GosdmxGrowlMessage() {
    }

    public static void showInfo(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, MessageUtils.getMessageUsingSelectedLanguage("Info"), message));
    }

    public static void showWarn(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, MessageUtils.getMessageUsingSelectedLanguage("Warn"), message));
    }

    public static void showError(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, MessageUtils.getMessageUsingSelectedLanguage("Error"), message));
    }
}