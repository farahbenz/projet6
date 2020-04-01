package com.ocr.P6.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource dataSource;
    @Autowired
    public void globalConfig(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
        .dataSource(dataSource)
        .usersByUsernameQuery("select username, password,true from user where username=?")
        .authoritiesByUsernameQuery("select role_role,true from user where role_role =?")
        .rolePrefix("ROLE_");


    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http

                .authorizeRequests()
                .antMatchers("/js/**", "/css/**", "/img/**", "/scss/**", "/vendor/**").permitAll()
                .antMatchers("/index").permitAll()
                .antMatchers("/acceuil").permitAll()
                .antMatchers("/spots").permitAll()
                .antMatchers("/inscription").permitAll()
                .antMatchers("/afficheSpot/{id}").permitAll()
                .antMatchers("/contact").permitAll()
                .antMatchers("/afficheSpot").permitAll()
                .antMatchers("/updateComment/{id}").permitAll()
                .antMatchers("/recherche").permitAll()
                .antMatchers("/search").permitAll()
                .antMatchers("/delete/{id}").access("hasRole('ROLE_1')")
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("username").passwordParameter("password")
                .permitAll()
                .and()
                .logout()
                .invalidateHttpSession(true)
                .logoutUrl("/logout")
                .permitAll();
    }

    @SuppressWarnings("deprecation")
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }


}
