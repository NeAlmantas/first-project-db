package com.example.firstprojectdb.validationUtils;

import com.example.firstprojectdb.exceptions.CustomException;
import org.springframework.ui.Model;

public final class Validator /*instanceof*/ {

    private Validator() {
        //todo utils
    }

    public static void validateAttributes(Model model, String... args) {
        for (String s : args) {
            if (model.getAttribute(s) == null) {
                throw new CustomException(s + " atributas negali but tuscias!");
            }
        }
    }


}
