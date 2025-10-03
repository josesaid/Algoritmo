package com.mx.development.said.olano.example.validator;

import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PublicationYearValidatorTest {

    @Test
    void shouldReturnTrueForCurrentYear() {
        // Arrange
        PublicationYearValidator validator = new PublicationYearValidator();
        int currentYear = Year.now().getValue();

        // Act
        boolean result = validator.isValid(currentYear, null);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForPastYear() {
        // Arrange
        PublicationYearValidator validator = new PublicationYearValidator();
        int pastYear = Year.now().getValue() - 1;

        // Act
        boolean result = validator.isValid(pastYear, null);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForFutureYear() {
        // Arrange
        PublicationYearValidator validator = new PublicationYearValidator();
        int futureYear = Year.now().getValue() + 1;

        // Act
        boolean result = validator.isValid(futureYear, null);

        // Assert
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForNullValue() {
        // Arrange
        PublicationYearValidator validator = new PublicationYearValidator();
        // Act
        boolean result = validator.isValid(2026, null);
        // Assert
        assertFalse(result);
    }


}