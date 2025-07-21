package com.ticketbooking.bus_ticket_booking_system.validation;

import com.ticketbooking.bus_ticket_booking_system.model.Role;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Set;

public class RoleValidator implements ConstraintValidator<AllowedRoles, Role> {

    private static final Set<Role> ALLOWED = Set.of(
            Role.ROLE_ADMIN,
            Role.ROLE_CUSTOMER
    );

    @Override
    public boolean isValid(Role value, ConstraintValidatorContext context) {
        return value != null && ALLOWED.contains(value);
    }
}