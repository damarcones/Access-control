/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.desafio.backend.agenda.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.backend.agenda.Models.EmailModel;
import com.desafio.backend.agenda.Models.PessoaModel;
import com.desafio.backend.agenda.Repository.EmailRepository;
import com.desafio.backend.agenda.Repository.PessoaRepository;

/**
 *
 * @author damarcones
 */
@RestController
@RequestMapping("api/email/")
public class EmailController {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    PessoaRepository pessoaRepository;

    @PostMapping("cadastrar/{cpf}")
    public EmailModel cadastraEmail(@PathVariable String cpf, @RequestBody EmailModel emailModel) {
        PessoaModel pessoa = pessoaRepository.findById(cpf).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        emailModel.setPessoa(pessoa);
        return emailRepository.save(emailModel);
    }

    @GetMapping("listar")
    public List<EmailModel> listar() {
        return emailRepository.findAll();
    }

    @GetMapping("procura/{email}")
    public EmailModel procura(@PathVariable String email) {
        return emailRepository.findById(email).orElseThrow(() -> new RuntimeException("Email não encontrada"));
    }

}
