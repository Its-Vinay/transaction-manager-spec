package com.springboot.tm.spec.dto;

import lombok.Getter;

public enum CrDrIndicator {

    CREDIT("CREDIT"),
    DEBIT("DEBIT");

    @Getter
    private final String indicator;

    CrDrIndicator(String indicator) {
        this.indicator = indicator;
    }
}
