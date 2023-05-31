package com.example.umcstudy.exception;

import lombok.Getter;

public enum ExceptionCode {
     MEMBER_NOT_FOUND(404, "Member not found");

    @Getter
    private double status;

    @Getter
    private String message;

    ExceptionCode(double code, String message) {
        this.status = code;
        this.message = message;
    }
}
