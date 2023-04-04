package com.bora.crud.exception;

import com.bora.crud.exception.base.BaseException;
import com.bora.crud.utility.ExceptionMessage;
import lombok.Data;
import lombok.RequiredArgsConstructor;



public class UnkownErrorException extends BaseException {
    public UnkownErrorException(){
        super(ExceptionMessage.UNKNOWN_ERROR_EXCEPTION);
    }
}
