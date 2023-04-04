package com.bora.crud.exception;

import com.bora.crud.exception.base.BaseException;
import com.bora.crud.utility.ExceptionMessage;


public class UserRoleAlreadyAvailable extends BaseException {
    public UserRoleAlreadyAvailable(){
        super(ExceptionMessage.USER_ROLE_ALREADY_AVAILABLE);
    }

}
