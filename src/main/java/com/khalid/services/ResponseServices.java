package com.khalid.services;

import com.khalid.response.LoginResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ResponseServices {

    public LoginResponse getLoginResponse(){
        return new LoginResponse(HttpStatus.ACCEPTED, "", "Success");
    }
}
