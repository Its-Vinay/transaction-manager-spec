package com.springboot.tm.spec.dto;

import lombok.Getter;

public enum FreezeStatus {

    NOT_FROZEN("NOT_FROZEN"),
    TOTAL_FREEZE("TOTAL_FREEZE"),
    CREDIT_FREEZE("CREDIT_FREEZE"),
    DEBIT_FREEZE("DEBIT_FREEZE");

    @Getter
    private final String freezeStatus;

    FreezeStatus(String freezeStatus) {
        this.freezeStatus = freezeStatus;
    }
}
