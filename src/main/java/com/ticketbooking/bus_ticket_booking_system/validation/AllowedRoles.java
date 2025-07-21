package com.ticketbooking.bus_ticket_booking_system.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = RoleValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface AllowedRoles {
    String message() default "Invalid role. Allowed values are: ADMIN, CUSTOMER";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}