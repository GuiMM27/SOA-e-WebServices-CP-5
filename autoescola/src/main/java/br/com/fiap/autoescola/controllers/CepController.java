package br.com.fiap.autoescola.controllers;

import br.com.fiap.autoescola.dtos.EnderecoViaCepDto;
import br.com.fiap.autoescola.services.ViaCepService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
@Tag(name = "Consulta Externa CEP", description = "Consumo de API externa do ViaCEP")
public class CepController {

    @Autowired
    private ViaCepService viaCepService;

    @GetMapping("/{cep}")
    @Operation(summary = "Busca endereço por CEP consumindo API externa")
    public ResponseEntity<EnderecoViaCepDto> consultarCep(@PathVariable String cep) {
        return ResponseEntity.ok(viaCepService.buscarEnderecoPorCep(cep));
    }
}