package br.com.fiap.autoescola.controllers;

import br.com.fiap.autoescola.models.Instrucao;
import br.com.fiap.autoescola.models.MotivoCancelamento;
import br.com.fiap.autoescola.services.InstrucaoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instrucoes")
@Tag(name = "Instruções", description = "Endpoints para gerenciamento e agendamento de instruções da auto-escola")
public class InstrucaoController {

    @Autowired
    private InstrucaoService service;

    @PatchMapping("/{id}/cancelar")
    @Operation(summary = "Cancela uma instrução agendada", description = "Aplica validação do motivo e antecedência mínima de 24 horas")
    public ResponseEntity<Instrucao> cancelar(@PathVariable Long id, @RequestParam MotivoCancelamento motivo) {
        Instrucao instrucaoCancelada = service.cancelarInstrucao(id, motivo);
        return ResponseEntity.ok(instrucaoCancelada);
    }
}