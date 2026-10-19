package br.com.fiap.autoescola.repositories;

import br.com.fiap.autoescola.models.Instrucao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrucaoRepository extends JpaRepository<Instrucao, Long> {
}