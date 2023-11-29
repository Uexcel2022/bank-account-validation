package com.uexcel.bankaccountvalidation.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseModel {
    private boolean status;
    private String message;
    private List<Body> data;
}
