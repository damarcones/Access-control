package com.desafio.backend.agenda.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.backend.agenda.Models.PessoaModel;
import com.desafio.backend.agenda.Repository.PessoaRepository;

import jakarta.validation.Valid;



/**
 *
 * @author damarcones
 */
@RestController
@RequestMapping("/api/pessoa/")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping("cadastra")
    public PessoaModel cadastrarPessoa(@Valid @RequestBody PessoaModel pessoa) {
        return pessoaRepository.save(pessoa);

    }

    @GetMapping("/listar/")
    public List<PessoaModel> listaTudo(){
        return pessoaRepository.findAll();
    }

    @GetMapping("procura/{cpf}")
    public PessoaModel procura(@PathVariable String cpf) {
        return pessoaRepository.findById(cpf).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
    }
    

}
