package com.springboot.tm.spec.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferRequestDTO {

    private String sourceAccountNumber;

    private String destinationAccountNumber;

    private BigDecimal amount;

}
