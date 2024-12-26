package com.desafio.backend.agenda.Models;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

/**
 *
 * @author damarcones
 */

@Entity
@Table(name = "endereco")
public class EnderecoModel implements Serializable{
    
    @Id
    private long id;
    @Pattern(regexp = "(^\\d{8})", message = "O CEP deve conter exatamente 8 dígitos.")
    private String cep;
   
    private String logradouro;
    private String complemento;

    private String bairro;
  
    private String localidade;
    private String uf;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cpf",  nullable = false)
    private PessoaModel pessoa;
    
    public PessoaModel getPessoa() {
        return pessoa;
    }
    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

}
