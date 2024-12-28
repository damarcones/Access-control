package com.desafio.backend.agenda.Models;

import java.io.Serializable;

import com.desafio.backend.agenda.Enums.TipoTelefoneEnum;
import com.desafio.backend.agenda.Validacao.ValidaTelefone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author damarcones
 */

@Entity
@Table(name = "telefone")
@ValidaTelefone
public class TelefoneModel implements Serializable{

    @Id
    private String telefone;

    private TipoTelefoneEnum tipo;

    @ManyToOne
    @JoinColumn(name = "cpf",  nullable = false)
    private PessoaModel pessoa;

    public TipoTelefoneEnum getTipo() {
        return tipo;
    }
    public void setTipo(TipoTelefoneEnum tipo) {
        this.tipo = tipo;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public PessoaModel getPessoa() {
        return pessoa;
    }
    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }


}
