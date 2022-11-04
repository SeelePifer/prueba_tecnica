package com.lfte.ejercicio.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice(basePackages = "com.lfte.ejercicio")
public class CustomErrorHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
                                                                          HttpHeaders headers, HttpStatus status, WebRequest request) {
        String error = ex.getParameterName() + " -> parameter is missing in request";

        APIError apiError = new APIError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
        return handleExceptionInternal(ex, apiError, headers, apiError.getStatus(), request);

    }
}
