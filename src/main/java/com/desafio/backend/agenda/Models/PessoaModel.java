package com.desafio.backend.agenda.Models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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

    @Pattern(regexp = "^[a-zA-Z0-9\\s]{3,100}$", message = "O nome só pode conter letras.")
    private String nome;

    @OneToMany(mappedBy="pessoa", cascade = CascadeType.ALL)
    private List<TelefoneModel> telefone;

    @OneToMany(mappedBy="pessoa", cascade = CascadeType.ALL)
    private List<EmailModel> email;


    @OneToOne(mappedBy="pessoa", cascade = CascadeType.ALL)
    private EnderecoModel enderecoModel;
    

    public List<TelefoneModel> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<TelefoneModel> telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<EmailModel> getEmail() {
        return email;
    }

    public void setEmail(List<EmailModel> email) {
        this.email = email;
    }

    public EnderecoModel getEnderecoModel() {
        return enderecoModel;
    }

    public void setEnderecoModel(EnderecoModel enderecoModel) {
        this.enderecoModel = enderecoModel;
    }

}
