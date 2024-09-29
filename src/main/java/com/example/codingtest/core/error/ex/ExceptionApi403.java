package com.example.codingtest.core.error.ex;

// 인증관련
public class ExceptionApi403 extends RuntimeException {
    public ExceptionApi403(String message) {
        super(message);
    }
}
