package com.bora.crud.exception;

import com.bora.crud.exception.base.BaseException;
import com.bora.crud.utility.ExceptionMessage;

public class UserAlreadyAvailable extends BaseException {
    public UserAlreadyAvailable(){
        super(ExceptionMessage.USER_ALREADY_AVALIABLE);
    }
}
