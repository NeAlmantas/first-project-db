package com.example.firstprojectdb.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.List;

@ControllerAdvice
public class ControllerAdviceHandler {

    @ExceptionHandler(CustomException.class)
    public String handleContentNotAllowedException(CustomException unfe, Model model) {
        List<String> errors = Collections.singletonList(unfe.getMessage());
        model.addAttribute("errors", errors);
        return "error";
    }
}
