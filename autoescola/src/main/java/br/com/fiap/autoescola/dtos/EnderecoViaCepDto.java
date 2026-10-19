package br.com.fiap.autoescola.dtos;

public record EnderecoViaCepDto(
    String cep,
    String logradouro,
    String complemento,
    String bairro,
    String localidade,
    String uf
) {}