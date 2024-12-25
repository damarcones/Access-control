package com.desafio.backend.agenda.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.backend.agenda.Models.EnderecoModel;
import com.desafio.backend.agenda.Service.CepService;

/**
 *
 * @author damarcones
 */

@RestController
@RequestMapping("/api/cep")
public class CepController {

    private final CepService cepService;

    public CepController(CepService cepService) {
        this.cepService = cepService;
    }


    @GetMapping("/{cep}")
    public EnderecoModel buscarEndereco(@PathVariable String cep) {
        return cepService.buscarEnderecoCep(cep);
    }

}
