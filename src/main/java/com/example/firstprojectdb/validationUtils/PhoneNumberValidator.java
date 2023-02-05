package com.example.firstprojectdb.validationUtils;

import com.example.firstprojectdb.annotations.PhoneNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
        if (phoneNumber.length() != 12 || phoneNumber.charAt(0) != '+' || !phoneNumber.substring(1, 5).equals("3706")) {
            return false;
        }
        return true;
    }
}
