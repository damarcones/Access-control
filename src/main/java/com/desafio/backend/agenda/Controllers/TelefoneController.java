package com.desafio.backend.agenda.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.backend.agenda.Models.PessoaModel;
import com.desafio.backend.agenda.Models.TelefoneModel;
import com.desafio.backend.agenda.Repository.PessoaRepository;
import com.desafio.backend.agenda.Repository.TelefoneRepository;

import jakarta.validation.Valid;


/**
 *
 * @author damarcones
 */

@RestController
@RequestMapping("/api/cadastro/")
public class TelefoneController {

    @Autowired
    private TelefoneRepository telefoneRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping("{cpf}/telefone")
    public TelefoneModel cadastraTelefone(@PathVariable String cpf, @Valid @RequestBody TelefoneModel telefoneModel) {
        PessoaModel pessoa = pessoaRepository.findById(cpf).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        telefoneModel.setPessoa(pessoa);
        return telefoneRepository.save(telefoneModel);
    }
    




}
