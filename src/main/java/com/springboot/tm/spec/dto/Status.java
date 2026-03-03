package com.springboot.tm.spec.dto;

import lombok.Getter;

public enum Status {

    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    CLOSED("CLOSED");

    @Getter
    private final String status;

    Status(String status) {
        this.status = status;
    }
}
