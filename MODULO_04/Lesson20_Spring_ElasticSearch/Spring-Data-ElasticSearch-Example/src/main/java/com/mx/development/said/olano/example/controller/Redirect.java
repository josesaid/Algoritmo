package com.mx.development.said.olano.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * A REST controller that provides redirection endpoints.
 * This controller includes methods to redirect users to the Swagger UI documentation page.
 * @author josesaidolanogarcia
 */
@RestController
public class Redirect {

    @GetMapping(value = "/")
    public ModelAndView redirectToDocPage() {
        return new ModelAndView("redirect:/swagger-ui/index.html");
    }

    @GetMapping(value = "/apidocs")
    public ModelAndView redirectToApiPage() {
        return new ModelAndView("redirect:/swagger-ui/index.html");
    }
}
