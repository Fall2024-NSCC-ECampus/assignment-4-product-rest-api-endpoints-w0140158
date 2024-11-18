package com.example.productrestapiendpoints.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  // Disable CSRF protection for stateless API
                .authorizeRequests()
                .anyRequest().permitAll()  // Allow all requests to be accessed without authentication
                .and()
                .httpBasic().disable();  // Disable HTTP Basic authentication since you don't need it for testing

        return http.build();
    }
}
