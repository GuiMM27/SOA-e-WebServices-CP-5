package br.com.fiap.autoescola.controllers;

import br.com.fiap.autoescola.models.Usuario;
import br.com.fiap.autoescola.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return service.cadastrar(usuario);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<Usuario> listar() {
        return service.listarTodos();
    }

    @PreAuthorize("isAuthenticated()")
    @PatchMapping("/{id}/alterar-senha")
    public void alterarSenha(@PathVariable Long id, @RequestBody String novaSenha) {
        service.alterarPropriaSenha(id, novaSenha);
    }
}