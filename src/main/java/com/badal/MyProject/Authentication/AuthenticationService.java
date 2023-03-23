package com.badal.MyProject.Authentication;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){
        boolean isValidUserName = username.equalsIgnoreCase("Badal Saini");
        boolean isValidPassword = password.equalsIgnoreCase("password");
    return isValidUserName && isValidPassword;
    }
}
