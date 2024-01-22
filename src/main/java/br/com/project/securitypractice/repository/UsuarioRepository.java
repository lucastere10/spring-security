package br.com.project.securitypractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.securitypractice.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
