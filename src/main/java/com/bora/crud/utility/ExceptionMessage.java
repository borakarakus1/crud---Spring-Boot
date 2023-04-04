package com.bora.crud.utility;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;


@Getter
@RequiredArgsConstructor
public enum ExceptionMessage {
    INVALID_INPUT_EXCEPTION("Invalid Input","invalid.input", HttpStatus.BAD_REQUEST),
    NOT_FOUND_EXCEPTION("Not Found","not.found",HttpStatus.NOT_FOUND),
    USER_ALREADY_AVALIABLE("User Already Available","already.available",HttpStatus.BAD_REQUEST),
    ROLE_ALREADY_AVAILABLE("Role Already Available","already.available",HttpStatus.BAD_REQUEST),
    UNKNOWN_ERROR_EXCEPTION("Unknown Error","unknown.error",HttpStatus.INTERNAL_SERVER_ERROR),
    AUTHORITY_ALREADY_AVAILABLE("Authority Already Available","already.available", HttpStatus.BAD_REQUEST),
    USER_ROLE_ALREADY_AVAILABLE("User Role Already Available","already.available",HttpStatus.BAD_REQUEST),
    USER_ROLE_AUTHORITY_AVAILABLE("User Role Authority Available","already.available",HttpStatus.BAD_REQUEST);

    private final String errorMessage;
    private final String errorName;
    private final HttpStatus errorCode;
}
