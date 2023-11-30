package com.uexcel.bankaccountvalidation.controller;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    @GetMapping("/validate**")
    Object validatAccount(@RequestParam("account_number") String account_number,
            @RequestParam("bank_code") String bank_code,
            @RequestParam("token") String token)
            throws IOException {

        String uri = "https://api.paystack.co/bank/resolve?account_number=" + account_number + "&bank_code="
                + bank_code;

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders header = new HttpHeaders();

        header.set(HttpHeaders.AUTHORIZATION, "Bearer " + token);

        HttpEntity<String> requestEntity = new HttpEntity<String>(uri, header);

        return restTemplate.exchange(uri, HttpMethod.GET, requestEntity,
                Object.class).getBody();

    }
}
