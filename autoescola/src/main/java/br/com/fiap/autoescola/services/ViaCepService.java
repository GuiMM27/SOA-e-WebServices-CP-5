package br.com.fiap.autoescola.services;

import br.com.fiap.autoescola.dtos.EnderecoViaCepDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepService {

    private final RestTemplate restTemplate = new RestTemplate();

    public EnderecoViaCepDto buscarEnderecoPorCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        try {
            return restTemplate.getForObject(url, EnderecoViaCepDto.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar serviço de CEP externo: " + e.getMessage());
        }
    }
}