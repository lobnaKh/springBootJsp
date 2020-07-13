package com.bct.gosdmx.web.utils.enums;

public enum DefaultStartedView {

    INDEX("/GOSDMX_App/pnrd");

    private final String viewPath;

    private DefaultStartedView(String viewPath) {
        this.viewPath = viewPath;
    }

    public String getViewPath() {
        return viewPath;
    }

    @Override
    public String toString() {
        return viewPath;
    }
}
