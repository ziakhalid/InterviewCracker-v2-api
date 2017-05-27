package com.khalid.login;


import com.khalid.response.LoginResponse;
import com.khalid.services.ResponseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    ResponseServices responseServices;

    @GetMapping("/login")
    public LoginResponse getLoginResponse(){
        return responseServices.getLoginResponse();
    }

}
