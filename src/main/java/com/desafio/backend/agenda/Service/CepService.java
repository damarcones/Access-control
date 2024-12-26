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
        EnderecoModel endereco = restTemplate.getForObject(url, EnderecoModel.class);

        if (endereco != null && endereco.getCep() != null) {
            // Remove o traço do CEP
            endereco.setCep(endereco.getCep().replace("-", ""));
        }

        return endereco;
    }

    // public String enviarEnderecoCep(EnderecoModel endereco){
    //     String url = "localhost:8080/api/cadastro/endereco/";
    //     return restTemplate.postForObject(url, endereco, EnderecoModel.class);
    // }
}
