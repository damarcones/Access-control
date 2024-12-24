/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.desafio.backend.agenda.Validacao;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.auth0.jwt.interfaces.Payload;

import jakarta.validation.Constraint;

/**
 *
 * @author damarcones
 */

@Documented
@Constraint(validatedBy = ValidadorTelefone.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidaTelefone {

    String message() default "Número de telefone inválido para o tipo especificado.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
