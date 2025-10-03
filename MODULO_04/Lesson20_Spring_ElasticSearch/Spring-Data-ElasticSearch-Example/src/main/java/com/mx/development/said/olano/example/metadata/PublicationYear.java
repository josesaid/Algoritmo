package com.mx.development.said.olano.example.metadata;

import com.mx.development.said.olano.example.validator.PublicationYearValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * Custom annotation for validating publication years. This annotation ensures that
 * the specified year is not in the future, preventing invalid publication dates.
 *
 * The annotation can be applied to fields, parameters, and other annotations, and
 * is backed by a custom validator class, {@code PublicationYearValidator},
 * which performs the year validation.
 *
 * Constraints validated:
 * - The provided year must be less than or equal to the current year.
 *
 * Validation will fail if the year is in the future.
 *
 * Used in combination with the Bean Validation API for declarative validation.
 *
 * Attributes:
 * - {@code message}: Custom validation message on failure.
 * - {@code groups}: Allows grouping of constraints.
 * - {@code payload}: Provides additional information or extensions for metadata clients.
 *
 * @author josesaidolanogarcia
 */
@Documented
@Retention(RUNTIME)
@Target({FIELD, ANNOTATION_TYPE, PARAMETER})
@Constraint(validatedBy = PublicationYearValidator.class)
public @interface PublicationYear {

    String message() default "Publication year cannot be future year";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}