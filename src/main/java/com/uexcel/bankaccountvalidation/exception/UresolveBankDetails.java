package com.uexcel.bankaccountvalidation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;

@ControllerAdvice
public class UresolveBankDetails {

    @ResponseBody
    @ExceptionHandler(HttpClientErrorException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> badBankDetails() {

        return ResponseEntity.ok("Bad Bank Details");

    }

    @ResponseBody
    @ExceptionHandler(ResourceAccessException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> noInternetConnection() {

        return ResponseEntity.ok("No internet Connection");

    }
}
