package com.oraganizationmanagement.demoproject.customannotaion;

import static java.lang.annotation.ElementType.FIELD;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckUniqEmailID.class)
public @interface CheckUniqeEmail {
	
    String message() default "email Id already in use";
    
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
