package br.com.fiap.autoescola.controllers;

import br.com.fiap.autoescola.models.Instrucao;
import br.com.fiap.autoescola.models.MotivoCancelamento;
import br.com.fiap.autoescola.services.InstrucaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instrucoes")
public class InstrucaoController {

    @Autowired
    private InstrucaoService service;

    @PatchMapping("/{id}/cancelar")
    public ResponseEntity<Instrucao> cancelar(@PathVariable Long id, @RequestParam MotivoCancelamento motivo) {
        Instrucao instrucaoCancelada = service.cancelarInstrucao(id, motivo);
        return ResponseEntity.ok(instrucaoCancelada);
    }
}