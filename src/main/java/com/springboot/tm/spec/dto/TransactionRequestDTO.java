package com.springboot.tm.spec.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransactionRequestDTO {

    private String accountNumber;

    private BigDecimal amount;

    private String crDrIndicator;
}
