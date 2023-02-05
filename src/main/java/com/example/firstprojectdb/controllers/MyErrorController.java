package com.example.firstprojectdb.controllers;

import org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Optional;

@Component("errorViewResolver")
public class MyErrorController implements ErrorViewResolver {

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        switch (status) {
            case NOT_FOUND:
                return new ModelAndView("404");
            case FORBIDDEN:
                return new ModelAndView("403");
            default:
                return new ModelAndView("error");
        }
    }
}
