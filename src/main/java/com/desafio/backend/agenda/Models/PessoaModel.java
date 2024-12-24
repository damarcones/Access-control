package com.desafio.backend.agenda.Models;

import jakarta.validation.constraints.Pattern;

/**
 *
 * @author damarcones
 */
public class PessoaModel {


    @Pattern(regexp = "\\d{11}", message = "O CPF deve conter exatamente 11 dígitos.")
    private long cpf;

    @Pattern(regexp = "^[A-Za-z]+$", message = "O nome só pode conter letras.")
    private String nome;

    private TelefoneModel telefone;

    private EnderecoModel endereco;
    

    public TelefoneModel getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneModel telefone) {
        this.telefone = telefone;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

}
