package com.springsecurityoauth2.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(1)
@RequiredArgsConstructor
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.requestMatchers().antMatchers("/login", "/oauth/authorize","/api/hello")
                .and().authorizeRequests()
                .antMatchers("/login", "/oauth/authorize","/api/hello").permitAll()
                .and().authorizeRequests().anyRequest()
                .authenticated().and().formLogin().permitAll();
    }
}
