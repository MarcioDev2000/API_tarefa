package com.example.tarefa.models;
import java.util.UUID;

import com.example.tarefa.enums.Role;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 100,  nullable = false)
    private String nome;

    @Column(unique = true, length = 150)
    private String email;

    @Column(length = 60)
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role; 

    @Column(length = 255)
    private String resetPasswordToken;

    @Temporal(TemporalType.TIMESTAMP)
    private Date tokenExpirationDate; 

    public Usuario(){}

    public Usuario(String nome, String email, String senha, Role role){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.role = role;
    }


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

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getResetPasswordToken() {
        return resetPasswordToken;
      }
    
      public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
      }


    public Date getTokenExpirationDate() {
        return tokenExpirationDate;
    }

    public void setTokenExpirationDate(Date tokenExpirationDate) {
        this.tokenExpirationDate = tokenExpirationDate;
    }

}