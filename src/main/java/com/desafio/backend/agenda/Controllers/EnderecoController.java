package com.desafio.backend.agenda.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.backend.agenda.Models.EnderecoModel;
import com.desafio.backend.agenda.Models.PessoaModel;
import com.desafio.backend.agenda.Repository.EnderecoRepository;
import com.desafio.backend.agenda.Repository.PessoaRepository;
import com.desafio.backend.agenda.Service.CepService;

/**
 *
 * @author damarcones
 */

@RestController
@RequestMapping("/api/cadastro/endereco/")
public class EnderecoController {

    private final CepService cepService;

    public EnderecoController(CepService cepService) {
        this.cepService = cepService;

    }
    
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/{cep}")
    public EnderecoModel buscarEndereco(@PathVariable String cep) {
        return cepService.buscarEnderecoCep(cep);
    }

    // @PostMapping("/{cep}")
    // public EnderecoModel enviarEnderecoCep(@PathVariable String cep) {
    //     return cepService.enviarEnderecoCep(cep);
    // }

    @PostMapping("{cpf}/{cep}")
    public EnderecoModel cadastraEndereco(@PathVariable String cpf,@PathVariable String cep) {
        PessoaModel pessoa = pessoaRepository.findById(cpf).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        EnderecoModel endereco = cepService.buscarEnderecoCep(cep);
        endereco.setPessoa(pessoa);        
        // cepService.enviarEnderecoCep(enderecoModel);
        return enderecoRepository.save(endereco);
    }
    
}
