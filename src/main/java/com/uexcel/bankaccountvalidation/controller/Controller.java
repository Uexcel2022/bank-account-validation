package com.uexcel.bankaccountvalidation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientSsl;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uexcel.bankaccountvalidation.response.Body;
import com.uexcel.bankaccountvalidation.response.ResponseModel;
import com.uexcel.bankaccountvalidation.service.JsonPlaceHoldersService;

@RestController
public class Controller {
    @GetMapping("/validate")
    ResponseEntity<ResponseModel> validatAccount() {

        List<Body> list = new ArrayList<>();
        ResponseModel response = new ResponseModel();
        response.setStatus(true);
        response.setMessage("Account number resolved");
        Body body = new Body("0015658758", "ONWEIFENDI UDOKA EXCELLENCE", 9L);
        list.add(body);
        response.setData(list);
        return ResponseEntity.ok(response);
    }

    @Bean
    JsonPlaceHoldersService jsonPlaceHoldersService() {

    }

}
