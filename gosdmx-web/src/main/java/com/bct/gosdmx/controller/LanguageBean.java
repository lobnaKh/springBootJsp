package com.bct.gosdmx.controller;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.springframework.context.annotation.Scope;

import lombok.Data;

@ManagedBean(value = "languageBean")
@Scope("session")
@Data
public class LanguageBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String currentLanguageCode;

    private static Map<String, Locale> availableLanguages;

    static {
        availableLanguages = new LinkedHashMap<>();
        availableLanguages.put("fr", Locale.FRENCH);
        availableLanguages.put("en", Locale.ENGLISH);
    }

    public Map<String, Locale> getAvailableLanguages() {
        return availableLanguages;
    }

    @PostConstruct
    public void init() {
        currentLanguageCode = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale().toLanguageTag().substring(0, 2);
    }

    public void onCountryLocaleCodeChange(ValueChangeEvent event) {
        String newLocaleValue = event.getNewValue().toString();
        availableLanguages.entrySet().stream().filter(language -> language.getValue().toString().equals(newLocaleValue)).forEach(language -> {
            currentLanguageCode = language.getValue().toLanguageTag();
            FacesContext.getCurrentInstance().getViewRoot().setLocale(language.getValue());
        });
    }
}