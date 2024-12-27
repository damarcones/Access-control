package com.desafio.backend.agenda.Validacao;

import com.desafio.backend.agenda.Models.TelefoneModel;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 *
 * @author damarcones
 */
public class ValidadorTelefone implements ConstraintValidator<ValidaTelefone, TelefoneModel> {

    @Override
    public boolean isValid(TelefoneModel telefoneModel, ConstraintValidatorContext context) {
        if (telefoneModel == null || telefoneModel.getTipo() == null || telefoneModel.getTelefone() == null) {
            return false;
        }
        String regex = telefoneModel.getTipo().getRegex();
        return telefoneModel.getTelefone().matches(regex);
    }

}
