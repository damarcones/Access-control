package com.desafio.backend.agenda.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafio.backend.agenda.Models.EnderecoModel;

/**
 *
 * @author damarcones
 */

@Service
public class CepService {
    private final RestTemplate restTemplate;

    public CepService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public EnderecoModel buscarEnderecoCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        return restTemplate.getForObject(url, EnderecoModel.class);
    }
}
