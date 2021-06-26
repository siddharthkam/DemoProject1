package com.oraganizationmanagement.demoproject;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.Hibernate;
import org.hibernate.validator.HibernateValidator;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

import com.oraganizationmanagement.demoproject.model.AuditorAwareImpl;

@SpringBootApplication
@ComponentScan("com.oraganizationmanagement.demoproject")
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class DemoprojectApplication {

	public static void main(String[] args) {
		
		System.out.println("Hii One");
		SpringApplication.run(DemoprojectApplication.class, args);
	}
	
	    @Bean
	    public AuditorAware<String> auditorAware(){
	        return new AuditorAwareImpl();
	    }
	    
	    @Bean
	    public LocalValidatorFactoryBean validator() {
	        return new LocalValidatorFactoryBean();
	    }

	    @Bean
	    public MethodValidationPostProcessor methodValidationPostProcessor(Validator validator) {
	        MethodValidationPostProcessor methodValidationPostProcessor = new MethodValidationPostProcessor();
	        methodValidationPostProcessor.setValidator(validator);
	        return methodValidationPostProcessor;
	    }

	    

}
