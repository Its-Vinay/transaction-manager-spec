package com.springboot.tm.spec.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TransactionInquiryDTO {

    private String transactionType;

    private String transactionStatus;

    private BigDecimal amount;

    private String fromAccountNumber;

    private String toAccountNumber;

    private String bankId;

    private String failureReason;

    private LocalDateTime createdAt;
}
