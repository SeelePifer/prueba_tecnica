package com.lfte.ejercicio.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@AllArgsConstructor
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class BaseException extends RuntimeException {


    private static final long serialVersionUID = 6952389158572038825L;


    public BaseException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }


    public BaseException(String errorMessage) {
        super(errorMessage);
    }
}

