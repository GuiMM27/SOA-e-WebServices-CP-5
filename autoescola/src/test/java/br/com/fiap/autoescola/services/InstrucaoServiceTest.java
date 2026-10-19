package br.com.fiap.autoescola.services;

import br.com.fiap.autoescola.models.Instrucao;
import br.com.fiap.autoescola.repositories.InstrucaoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class InstrucaoServiceTest {

    @Mock
    private InstrucaoRepository instrucaoRepository;

    @InjectMocks
    private InstrucaoService instrucaoService;

    @Test
    @DisplayName("Deve agendar instrucao com sucesso")
    void deveAgendarInstrucao() {
        Instrucao instrucao = new Instrucao();
        instrucao.setDataHora(LocalDateTime.now().plusDays(2));

        when(instrucaoRepository.save(any(Instrucao.class))).thenReturn(instrucao);

        Instrucao salva = instrucaoRepository.save(instrucao);

        assertNotNull(salva);
        assertEquals(instrucao.getDataHora(), salva.getDataHora());
    }
}