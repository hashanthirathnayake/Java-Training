package com.example.employeeservice.service;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;

public class AccessTokenConfigurer {
    public static String getToken(){
        OAuth2AuthenticationDetails authenticationDetails = (OAuth2AuthenticationDetails) SecurityContextHolder.getContext().getAuthentication().getDetails();
        return authenticationDetails.getTokenType().concat(" ").concat(authenticationDetails.getTokenValue());
    }
}
