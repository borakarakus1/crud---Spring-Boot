package com.bora.crud.exception.base.handler;

import com.bora.crud.exception.base.BaseException;
import com.bora.crud.shared.Response;
import com.bora.crud.utility.ExceptionMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    private ResponseEntity<Response> handle(BaseException e){
        log.error("Error Occured: ",e);

        return new ResponseEntity<>(new Response(e.getExceptionMessage(), LocalDateTime.now()),
                e.getExceptionMessage().getErrorCode());
    }

    @ExceptionHandler(Exception.class)
    private ResponseEntity<Response> handle(Exception e){
        log.error("Error Occured : ",e);
        return new ResponseEntity<>(new Response(ExceptionMessage.UNKNOWN_ERROR_EXCEPTION,LocalDateTime.now()),
                ExceptionMessage.UNKNOWN_ERROR_EXCEPTION.getErrorCode());
    }
}
