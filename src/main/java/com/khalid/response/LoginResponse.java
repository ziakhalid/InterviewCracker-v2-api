package com.khalid.response;

import org.springframework.http.HttpStatus;

public class LoginResponse {

    private Long timestamp = 1492749969334l;
    private HttpStatus status;
    private String error = "";
    private String message = "";
    private String path = "";

    public LoginResponse(HttpStatus status, String error, String message) {
        this.status = status;
        this.error = error;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
