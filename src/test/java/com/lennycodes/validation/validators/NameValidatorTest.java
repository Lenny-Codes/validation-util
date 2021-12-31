package com.lennycodes.validation.validators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {
    NameValidator nameValidator;

    @BeforeEach
    void setup() {
        nameValidator = new NameValidator();
    }

    @Test
    void validate_returnsFalseWhenNameIsNullOrBlank() {
        assertFalse(nameValidator.validate(null));
        assertFalse(nameValidator.validate(""));
        assertFalse(nameValidator.validate("  "));
    }

    @Test
    void validate_returnsFalseWhenNameIsNotAlphabetic() {
        assertFalse(nameValidator.validate("David$"));
        assertFalse(nameValidator.validate("$John"));
        assertFalse(nameValidator.validate("Jimmy10"));
        assertFalse(nameValidator.validate("10Jimmy"));
        assertFalse(nameValidator.validate("J!mmy19"));
    }

    @Test
    void validate_returnsTrueWhenNameIsAlphabetic() {
        assertTrue(nameValidator.validate("David"));
        assertTrue(nameValidator.validate("Jimmy"));
    }

    @Test
    void validate_returnsTrueWhenNameIsAlphabeticIgnoringSpaces() {
        assertTrue(nameValidator.validate("David John"));
        assertTrue(nameValidator.validate("   John   Doe"));
    }
}