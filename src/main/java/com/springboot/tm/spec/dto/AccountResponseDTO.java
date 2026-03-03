package com.springboot.tm.spec.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountResponseDTO {

    private String accountNumber;

    private String accountName;

    private String status;

    private String freezeStatus;

    private BigDecimal balance;

}
