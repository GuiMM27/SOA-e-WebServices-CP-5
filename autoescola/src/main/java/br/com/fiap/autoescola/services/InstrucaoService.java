package br.com.fiap.autoescola.services;

import br.com.fiap.autoescola.models.Instrucao;
import br.com.fiap.autoescola.models.MotivoCancelamento;
import br.com.fiap.autoescola.repositories.InstrucaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Service
public class InstrucaoService {

    @Autowired
    private InstrucaoRepository repository;

    public Instrucao cancelarInstrucao(Long instrucaoId, MotivoCancelamento motivo) {
        Instrucao instrucao = repository.findById(instrucaoId)
                .orElseThrow(() -> new RuntimeException("Instrução não encontrada"));

        LocalDateTime agora = LocalDateTime.now();
        long horasDeAntecedencia = ChronoUnit.HOURS.between(agora, instrucao.getDataHora());

        if (horasDeAntecedencia < 24) {
            throw new RuntimeException("Não é possível cancelar. Antecedência mínima de 24 horas requerida.");
        }

        if (motivo == null) {
            throw new RuntimeException("O motivo do cancelamento é obrigatório.");
        }

        instrucao.setStatus("CANCELADA");
        instrucao.setMotivoCancelamento(motivo);
        
        return repository.save(instrucao);
    }
}