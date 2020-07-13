package com.bct.gosdmx.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.el.ELContext;
import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bct.gosdmx.web.utils.enums.DefaultStartedView;

import lombok.Data;

@Controller("routingManagerBean")
@Scope("session")
@Data
public final class RoutingManagerBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String currentContentUrl;

    private String selectedUrl;

    @Override
    public String toString() {
        return currentContentUrl;
    }

    @PostConstruct
    public void init() {
        currentContentUrl = DefaultStartedView.INDEX.getViewPath();
    }

    public static void setContentView(Object routingViewEnum) {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();
        RoutingManagerBean routingManagerBean = (RoutingManagerBean) elContext.getELResolver().getValue(elContext, null, "routingManagerBean");
        routingManagerBean.setCurrentContentUrl(routingViewEnum.toString());
    }

    public static String getContentView() {
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();
        RoutingManagerBean routingManagerBean = (RoutingManagerBean) elContext.getELResolver().getValue(elContext, null, "routingManagerBean");
        return routingManagerBean.getCurrentContentUrl();
    }

}