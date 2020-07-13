package com.bct.gosdmx.web.utils.enums;

public enum ConnexionManagementRoutingViews {
    
    NOT_FOUND_PAGE            ("redirect:/GOSDMX_App/errors/404.faces"),
    FORBIDDEN_PAGE            ("redirect:/GOSDMX_App/errors/403.faces"),
    INTERNAL_SERVER_ERROR_PAGE("redirect:/GOSDMX_App/errors/500.faces");
  
    private final String viewPath;

    private ConnexionManagementRoutingViews(final String viewPath) {
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