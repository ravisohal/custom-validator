package com.sohal.api;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target({FIELD, METHOD, ANNOTATION_TYPE, PARAMETER})
@Constraint(validatedBy = WireRequestValidation.class)
public @interface WireRequest {

    String message() default "{wire.movemoneyrequest.validation}";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
