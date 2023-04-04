package com.bora.crud.exception.base;

import com.bora.crud.utility.ExceptionMessage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BaseException extends RuntimeException{
    protected final ExceptionMessage exceptionMessage;
}
