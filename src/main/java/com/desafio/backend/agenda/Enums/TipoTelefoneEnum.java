/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

package com.desafio.backend.agenda.Enums;

/**
 *
 * @author damarcones
 */
public enum TipoTelefoneEnum {

    residencial("^(\\d{10})$"),
    comercial("^(\\d{10})$"),
    celular("^(\\d{11})");

    private final String regex;

    TipoTelefoneEnum(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

}
