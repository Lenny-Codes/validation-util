package com.lennycodes.validation.common;

/**
 * Purpose: this can be used to implement a specific type of validation.
 * @param <T> refers to the type of object that will be validated
 */
public interface Validator<T> {
    boolean validate(T val);

    default boolean validate(T val, ValidResultAction validAction, InvalidResultAction invalidAction) {
        boolean isValid = validate(val);

        if(isValid && validAction != null) {
            validAction.performAction();
        }
        else if(!isValid && invalidAction != null){
            invalidAction.performAction();
        }

        return isValid;
    }
}
