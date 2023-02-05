package com.example.firstprojectdb.annotations;

import com.example.firstprojectdb.model.PhoneNumberType;
import com.example.firstprojectdb.validationUtils.PhoneNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Constraint(validatedBy = PhoneNumberValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumber {
    String message() default "nurodytas telefono numeris yra nevalidus.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    PhoneNumberType phoneNumberType() default PhoneNumberType.FULL;
}
