/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.desafio.backend.agenda.Models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

/**
 *
 * @author damarcones
 */

@Entity
@Table(name = "email")
public class EmailModel implements Serializable{

    @Id
    @Email(message = "O email não é válido.")
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "cpf",  nullable = false)
    private PessoaModel pessoa;
        

    public PessoaModel getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
