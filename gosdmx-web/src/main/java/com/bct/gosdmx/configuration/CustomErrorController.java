package com.bct.gosdmx.configuration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bct.gosdmx.web.utils.enums.ConnexionManagementRoutingViews;

@Controller
public class CustomErrorController extends AbstractErrorController {

    private static final String ERROR_PATH = "/error";

    @Autowired
    public CustomErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }

    @RequestMapping(ERROR_PATH)
    public String handleErrors(HttpServletRequest request) {
        HttpStatus status = getStatus(request);
        String errorViewPath = "";

        switch (status) {
        case NOT_FOUND:
            errorViewPath = ConnexionManagementRoutingViews.NOT_FOUND_PAGE.getViewPath();
            break;
        case FORBIDDEN:
            // errorViewPath = ConnexionManagementRoutingViews.FORBIDDEN_PAGE.getViewPath();
            break;
        case INTERNAL_SERVER_ERROR:
            errorViewPath = ConnexionManagementRoutingViews.INTERNAL_SERVER_ERROR_PAGE.getViewPath();
            break;
        default:
            break;
        }
        return errorViewPath;
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}