package com.ll.sbb1.User;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADMIN"), USER("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}
