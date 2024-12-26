/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.desafio.backend.agenda.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.backend.agenda.Models.EmailModel;
import com.desafio.backend.agenda.Models.PessoaModel;
import com.desafio.backend.agenda.Repository.EmailRepository;
import com.desafio.backend.agenda.Repository.EnderecoRepository;
import com.desafio.backend.agenda.Repository.PessoaRepository;
import com.desafio.backend.agenda.Service.CepService;

import jakarta.validation.Valid;

/**
 *
 * @author damarcones
 */
@RestController
@RequestMapping("/api/cadastro/")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private EmailRepository emailRepository;

    private final CepService cepService;

    public PessoaController(CepService cepService) {
        this.cepService = cepService;
    }

    @PostMapping("")
    public PessoaModel cadastrarPessoa(@Valid @RequestBody PessoaModel pessoa) {
        return pessoaRepository.save(pessoa);

    }

    @PostMapping("{cpf}/email")
    public EmailModel cadastraEmail(@PathVariable String cpf, @RequestBody EmailModel emailModel) {
        PessoaModel pessoa =  pessoaRepository.findById(cpf).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        emailModel.setPessoa(pessoa);
        return emailRepository.save(emailModel);
    }
    

    

}
