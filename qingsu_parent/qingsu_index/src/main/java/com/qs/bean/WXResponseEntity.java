package com.qs.bean;

import org.springframework.http.ResponseEntity;

public class WXResponseEntity<T> {
    private T data;
    int code;
    String message;

    public WXResponseEntity(T data, int code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "WXResponseEntity{" +
                "data=" + data +
                ", code='" + code + '\'' +
                '}';
    }
}
