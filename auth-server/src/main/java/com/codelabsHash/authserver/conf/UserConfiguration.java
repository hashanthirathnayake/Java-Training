package com.codelabsHash.authserver.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {
    PasswordEncoder passwordEncoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception{

    auth.inMemoryAuthentication().withUser("hashanthi")
            .password(passwordEncoder.encode("1111"))
                    .roles("USER","ADMIN","MANAGER")
            .authorities("CAN_READ","CAN_WRITE","CAN_DELETE").and()
            .withUser("suranga").password("surpass").roles("USER")
            .authorities("CAN_READ","CAN_WRITE")
            .and()
                .withUser("krish")
                .password(passwordEncoder.encode("4321"))
                .roles("USER")
                .authorities("CAN_READ","CAN_WRITE");

    }
}
