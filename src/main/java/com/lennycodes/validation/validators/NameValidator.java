package com.lennycodes.validation.validators;

import com.lennycodes.validation.common.Validator;

/**
 * Purpose: To validate a name String value. The value should be alphabetic only (ignoring spaces)
 */
public class NameValidator implements Validator<String> {

    /**
     * Validates name value.
     * @param name the string value that will be validated
     * @return true if is alphabetic (ignoring spaces), false if is null, blank, or non-alphabetic.
     */
    @Override public boolean validate(String name) {
        // Write your code here


        return true;
    }
}
