package com.desafio.backend.agenda.Models;

import com.desafio.backend.agenda.Enums.TipoTelefoneEnum;

/**
 *
 * @author damarcones
 */
public class TelefoneModel {

    private TipoTelefoneEnum tipo;

    String telefone;

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


}
