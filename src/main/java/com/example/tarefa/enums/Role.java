package com.example.tarefa.enums;

public enum Role {
    USER,
    ADMIN,
    MANAGER;

    public String getAuthority() {
        return "ROLE_" + this.name();
    }
}