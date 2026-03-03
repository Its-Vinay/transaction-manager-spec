package com.springboot.tm.spec.dto;

import lombok.Data;

@Data
public class AccountResponseDTO {

    private String accountNumber;

    private String accountName;

    private String status;

    private String freezeStatus;

}
