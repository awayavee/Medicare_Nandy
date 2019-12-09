package com.cognizant.medical.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	AppUserDetailsService appUserDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(appUserDetailsService).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors();
		http.csrf().disable().httpBasic().and().authorizeRequests().antMatchers("/authenticate").permitAll()
				.antMatchers("/**").permitAll().anyRequest().authenticated().and()
				.addFilter(new JwtAuthorizationFilter(authenticationManager()));
		
		/*
		http.cors();
		http.csrf().disable().httpBasic().and().authorizeRequests().antMatchers("/authenticate")
							.authenticated().and()
							.addFilter(new JwtAuthorizationFilter(authenticationManager())); 
	*/		 

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
