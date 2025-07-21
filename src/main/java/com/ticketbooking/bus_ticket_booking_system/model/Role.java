package com.ticketbooking.bus_ticket_booking_system.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Role {
    ROLE_ADMIN,
    ROLE_CUSTOMER,
    ROLE_STAFF;

    @JsonCreator
    public static Role from(String value) {
        try {
            return Role.valueOf("ROLE_" + value.toUpperCase());
        } catch (IllegalArgumentException ex) {
            return null; // Let validation handle the null
        }
    }
}