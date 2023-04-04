package com.bora.crud.exception;

import com.bora.crud.exception.base.BaseException;
import com.bora.crud.utility.ExceptionMessage;

public class AuthorityAlreadyAvailable extends BaseException {
    public AuthorityAlreadyAvailable(){
        super(ExceptionMessage.AUTHORITY_ALREADY_AVAILABLE);
    }
}
