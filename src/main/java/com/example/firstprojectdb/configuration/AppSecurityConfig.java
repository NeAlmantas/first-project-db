package com.example.firstprojectdb.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig /*extends WebSecurityConfigurerAdapter*/ {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/free/**").permitAll()
//                .antMatchers("/thymeleaf").authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login1")
//                .loginProcessingUrl("/login")
//                .defaultSuccessUrl("/thymeleaf")
//                .permitAll()
//                .and()
//                .logout().permitAll();
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/free/**").permitAll()
                .antMatchers("/thymeleaf").authenticated()
                .and()
                .formLogin().permitAll()
                .loginPage("/login1")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/thymeleaf")
                .and()
                .logout().permitAll();

        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
//        return new InMemoryUserDetailsManager();
        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("user1")
                .password("password1")
                .roles("USER")
                .build();
        UserDetails user2 = User.withDefaultPasswordEncoder()
                .username("vartotojas")
                .password("master")
                .roles("USER", "ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user1, user2);
    }
}
