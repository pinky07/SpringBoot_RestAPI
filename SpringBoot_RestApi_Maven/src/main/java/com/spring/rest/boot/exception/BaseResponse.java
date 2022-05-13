package com.spring.rest.boot.exception;

public class BaseResponse {
    private String s;
    public void setMessage(String s) {
        this.s =s;
    }

    public String getS() {
        return s;
    }
}
