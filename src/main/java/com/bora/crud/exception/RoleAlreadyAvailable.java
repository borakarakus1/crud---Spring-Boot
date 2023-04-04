package com.bora.crud.exception;

import com.bora.crud.exception.base.BaseException;
import com.bora.crud.utility.ExceptionMessage;

public class RoleAlreadyAvailable extends BaseException {
    public RoleAlreadyAvailable(){
        super(ExceptionMessage.ROLE_ALREADY_AVAILABLE);
    }
}
