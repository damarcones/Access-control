package com.desafio.backend.agenda.Models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

/**
 *
 * @author damarcones
 */

@Entity
@Table(name = "pessoa")
public class PessoaModel implements Serializable{

    @Id
    @Pattern(regexp = "(\\d{11})", message = "O CPF deve conter exatamente 11 dígitos.")
    private String cpf;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9\\s]{3,100}$", message = "O nome só pode conter letras.")
    private String nome;

    private String senha;

    private String role;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
