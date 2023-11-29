package com.uexcel.bankaccountvalidation.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.uexcel.bankaccountvalidation.response.ResponseModel;

public interface JsonPlaceHoldersService {
    @GetMapping("/validate")
    ResponseEntity<ResponseModel> validatAccount();
}
