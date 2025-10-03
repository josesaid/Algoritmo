package com.mx.development.said.olano.example.validator;

import com.mx.development.said.olano.example.metadata.PublicationYear;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.time.Year;

/**
 * A custom implementation of {@code ConstraintValidator} responsible for validating
 * publication year values as per the {@code PublicationYear} annotation.
 *
 * This validator ensures that the provided year is not in the future.
 *
 * Constraints validated:
 * - The value must not be greater than the current year.
 *
 * Validation logic:
 * - The method {@code isValid} checks if the supplied year is less than or equal to
 *   the current year. If the year is in the future, validation fails.
 *
 * Usage:
 * - Used in conjunction with the {@code PublicationYear} annotation for declarative
 *   validation of publication year fields and parameters.
 *
 * @author josesaidolanogarcia
 */
public class PublicationYearValidator implements ConstraintValidator<PublicationYear, Integer> {

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return !Year.of(value).isAfter(Year.now());
    }


}