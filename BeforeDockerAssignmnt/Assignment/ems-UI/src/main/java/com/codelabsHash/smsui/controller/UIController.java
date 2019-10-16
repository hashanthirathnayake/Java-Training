package com.codelabsHash.smsui.controller;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableOAuth2Sso
@Controller
public class UIController extends WebSecurityConfigurerAdapter {
    
    @Override
    
    protected  void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers()
                .permitAll()
                .anyRequest()
                .authenticated();

    }

    @RequestMapping(value = "/")
    public String index(){
        return "home";
    }
    
    @RequestMapping(value = "/createuser")
    public String home()
    {
        return "CreateUser";
    }

    @RequestMapping(value = "/fetch")
    public String fetch()
    {
        return "Fetch";
    }

    @RequestMapping(value = "/fetchAll")
    public String fetchAll()
    {
        return "FetchAll";
    }


}
