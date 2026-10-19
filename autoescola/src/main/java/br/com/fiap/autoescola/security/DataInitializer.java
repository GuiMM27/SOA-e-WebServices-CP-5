package br.com.fiap.autoescola.security;

import br.com.fiap.autoescola.models.Usuario;
import br.com.fiap.autoescola.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (usuarioRepository.count() == 0) {
            Usuario admin = new Usuario();
            admin.setNome("Administrador");
            admin.setEmail("admin@fiap.com.br");
            admin.setSenha(passwordEncoder.encode("123456"));
            admin.setRole("ADMIN");
            usuarioRepository.save(admin);
        }
    }
}