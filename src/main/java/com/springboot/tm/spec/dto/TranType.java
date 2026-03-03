package com.springboot.tm.spec.dto;

import lombok.Getter;

public enum TranType {

    CREDIT("CREDIT"),
    DEBIT("DEBIT"),
    FUND_TRANSFER("FUND_TRANSFER");

    @Getter
    private final String tranType;

    TranType(String tranType) {
        this.tranType = tranType;
    }
}
