package br.com.fiap.autoescola.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_instrucoes")
public class Instrucao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora;
    private String status = "AGENDADA";

    @Enumerated(EnumType.STRING)
    private MotivoCancelamento motivoCancelamento;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public MotivoCancelamento getMotivoCancelamento() { return motivoCancelamento; }
    public void setMotivoCancelamento(MotivoCancelamento motivoCancelamento) { this.motivoCancelamento = motivoCancelamento; }
}