package com.uexcel.bankaccountvalidation.controller;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
    @GetMapping("/validate/{bankDetails}/{token}")
    Object validatAccount(@PathVariable("bankDetails") String bankDetails, @PathVariable("token") String token)
            throws IOException {

        String uri = "https://api.paystack.co/bank/resolve?" + bankDetails;

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders header = new HttpHeaders();

        header.set(HttpHeaders.AUTHORIZATION, "Bearer " + token);

        HttpEntity<String> requestEntity = new HttpEntity<String>(uri, header);

        return restTemplate.exchange(uri, HttpMethod.GET, requestEntity, Object.class).getBody();

    }
}
