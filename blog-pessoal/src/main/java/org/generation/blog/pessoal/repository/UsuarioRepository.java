package org.generation.blog.pessoal.repository;

import java.util.Optional;

import org.generation.blog.pessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByUsuario(String usuario);
}
