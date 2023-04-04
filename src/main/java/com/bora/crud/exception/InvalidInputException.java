package com.bora.crud.exception;

import com.bora.crud.exception.base.BaseException;
import com.bora.crud.utility.ExceptionMessage;

public class InvalidInputException extends BaseException {
    public InvalidInputException(){
        super(ExceptionMessage.INVALID_INPUT_EXCEPTION);
    }
}
