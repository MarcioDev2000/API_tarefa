package com.example.tarefa.dto;

import java.util.UUID;

import com.example.tarefa.models.Usuario;

public class UsuarioResponseDto {

    private UUID id;
    private String nome;
    private String email;
    private String role;

    public UsuarioResponseDto(Usuario usuario) {
    this.id = usuario.getId();
    this.nome = usuario.getNome();
    this.email = usuario.getEmail();
    this.role = usuario.getRole().toString();
   }

    // Getters e setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}