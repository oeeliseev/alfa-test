package com.test.alfa.alfa.controllers;

import com.test.alfa.alfa.exception.ExceptionSerialize;
import com.test.alfa.alfa.exception.NoSuchUserException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
@Slf4j
public class ExceptionHandlerController {
    @ExceptionHandler(value = NoSuchUserException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ExceptionSerialize noSuchUserException(final Exception e) {
        ExceptionSerialize exception = new ExceptionSerialize()
                .setMessage(e.getMessage())
                .setCode(NOT_FOUND.value());
        log.error(exception.getMessage());
        return exception;
    }

    @ExceptionHandler(value = {Exception.class, RuntimeException.class})
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    public ExceptionSerialize internalError(final Exception e) {
        ExceptionSerialize exception = new ExceptionSerialize()
                .setMessage(String.format("internal server error: %s", e.toString()))
                .setCode(INTERNAL_SERVER_ERROR.value());
        log.error(ExceptionUtils.getStackTrace(e));
        return exception;
    }

    @ExceptionHandler(value = {MethodArgumentNotValidException.class, MethodArgumentTypeMismatchException.class})
    @ResponseStatus(BAD_REQUEST)
    public ExceptionSerialize argumentException(final Exception e) {
        ExceptionSerialize exception = new ExceptionSerialize()
                .setMessage(e.getMessage())
                .setCode(BAD_REQUEST.value());
        log.error(exception.getMessage());
        return exception;
    }
}
