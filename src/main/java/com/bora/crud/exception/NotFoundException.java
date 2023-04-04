package com.bora.crud.exception;

import com.bora.crud.exception.base.BaseException;
import com.bora.crud.utility.ExceptionMessage;

public class NotFoundException extends BaseException {

    public NotFoundException(){
                super(ExceptionMessage.NOT_FOUND_EXCEPTION);
        }

}