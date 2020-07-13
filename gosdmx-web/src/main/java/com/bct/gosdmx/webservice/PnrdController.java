package com.bct.gosdmx.webservice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class PnrdController {

    @GetMapping("/pnrd")
    public String handleErrors(HttpServletRequest request) {
        return "redirect:/GOSDMX_App/pnrd.faces";
    }
}