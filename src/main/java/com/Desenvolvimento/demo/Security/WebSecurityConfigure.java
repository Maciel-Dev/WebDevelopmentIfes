package com.Desenvolvimento.demo.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@EnableWebSecurity
@Configuration
public class WebSecurityConfigure {

    @Bean
    public InMemoryUserDetailsManager users()
    {
        InMemoryUserDetailsManager creator = new InMemoryUserDetailsManager();
        UserDetails user = User.withUsername("user").password(passwordEncoder().encode("123")).roles("USER").build();

        creator.createUser(user);

        return creator;
    }


    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
