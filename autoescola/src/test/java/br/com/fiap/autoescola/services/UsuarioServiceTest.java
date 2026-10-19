package br.com.fiap.autoescola.services;

import br.com.fiap.autoescola.models.Usuario;
import br.com.fiap.autoescola.repositories.UsuarioRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @Test
    @DisplayName("Deve validar a criacao de usuario")
    void deveCriarUsuario() {
        Usuario usuario = new Usuario();
        // Ajustado para usar setSenha e os campos padrão da sua entidade Usuario
        usuario.setSenha("123456");

        when(usuarioRepository.save(any(Usuario.class))).thenReturn(usuario);

        Usuario resultado = usuarioRepository.save(usuario);

        assertNotNull(resultado);
        assertEquals("123456", resultado.getSenha());
    }
}