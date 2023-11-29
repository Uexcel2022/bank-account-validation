package com.uexcel.bankaccountvalidation.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    @GetMapping("/validate/{param}")
    Object validatAccount(@PathVariable("param") String string, Object r) {
        String token = "sk_test_852abfa3389620b2c0830fa28e5f8339bcf46c4c";
        String uri = "https://api.paystack.co/bank/resolve?" + string;

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        header.set(HttpHeaders.AUTHORIZATION, "Bearer " + token);

        HttpEntity<String> requestEntity = new HttpEntity<String>(uri, header);

        return restTemplate.exchange(uri, HttpMethod.GET, requestEntity, Object.class).getBody();

    }

}
