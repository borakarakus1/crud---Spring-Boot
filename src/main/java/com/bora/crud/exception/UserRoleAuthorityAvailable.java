package com.bora.crud.exception;

import com.bora.crud.exception.base.BaseException;
import com.bora.crud.utility.ExceptionMessage;

public class UserRoleAuthorityAvailable extends BaseException {
    public UserRoleAuthorityAvailable(){
        super(ExceptionMessage.USER_ROLE_AUTHORITY_AVAILABLE);
    }
}
