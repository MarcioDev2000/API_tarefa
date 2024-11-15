package com.example.tarefa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tarefa.models.Usuario;

import java.util.Optional;
import java.util.UUID;

@Repository 
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    Optional<Usuario> findByEmail(String email);
    Optional<Usuario> findByResetPasswordToken(String resetPasswordToken);
}