package com.uexcel.bankaccountvalidation.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Body {
    private String accountNumber;
    private String Name;
    private Long bankId;
}
