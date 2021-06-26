package com.oraganizationmanagement.demoproject.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class OrgnizationSecurity extends WebSecurityConfigurerAdapter {
	
	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER").and().withUser("admin")
		.password("{noop}password").roles("USER", "ADMIN");
		
		 
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/greet").hasAnyRole("USER", "ADMIN")
		.antMatchers("/addBook").hasAnyRole("USER", "ADMIN")
		.antMatchers("/addNewEmployee").hasAnyRole("ADMIN")
		/*.anyRequest().authenticated().and().formLogin().permitAll().and().httpBasic();*/
		.anyRequest().authenticated().and().formLogin().permitAll().and().logout().permitAll();
		
		
		
       http.csrf().disable();
		
		/*http.authorizeRequests().antMatchers("/").hasRole("USER")
	      .and()
	      .httpBasic();*/
		
	}

}
