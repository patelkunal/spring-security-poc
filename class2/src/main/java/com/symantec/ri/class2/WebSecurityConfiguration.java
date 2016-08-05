package com.symantec.ri.class2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.PostConstruct;

/**
 * Created by kunal_patel on 8/4/16.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    private final static Logger LOGGER = LoggerFactory.getLogger(WebSecurityConfiguration.class);

    @PostConstruct
    public void postInit() {
        LOGGER.info("Registering {}", this.getClass().getCanonicalName());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/preauth/**").permitAll()
                .anyRequest().fullyAuthenticated()
                .and().httpBasic();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        // web.ignoring().antMatchers("/preauth/**"); // Not advisable for dynamic rest endpoint.
    }
}
