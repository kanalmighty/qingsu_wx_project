package com.qs.bean;

import org.springframework.http.ResponseEntity;

public class WXResponseEntity<T> {
    private T data;
    int code;

    public WXResponseEntity(T data, int code) {
        this.data = data;
        this.code = code;
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
