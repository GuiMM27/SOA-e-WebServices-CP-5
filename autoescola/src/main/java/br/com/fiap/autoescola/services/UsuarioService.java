package br.com.fiap.autoescola.services;

import br.com.fiap.autoescola.models.Usuario;
import br.com.fiap.autoescola.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Usuario cadastrar(Usuario usuario) {
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        return repository.save(usuario);
    }

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public void alterarPropriaSenha(Long usuarioId, String novaSenha) {
        Usuario usuario = repository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        usuario.setSenha(passwordEncoder.encode(novaSenha));
        repository.save(usuario);
    }
}