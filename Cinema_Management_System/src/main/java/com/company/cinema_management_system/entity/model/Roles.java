package com.company.cinema_management_system.entity.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public enum Roles {
    MANAGER("Manager can add or delete unlimited number of films"),
    USER("User can only have access for list of films.");
    private String access;
}
