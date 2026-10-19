package br.com.fiap.autoescola.repositories;

import br.com.fiap.autoescola.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}