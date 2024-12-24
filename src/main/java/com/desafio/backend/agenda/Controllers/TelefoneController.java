package com.desafio.backend.agenda.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.backend.agenda.Models.TelefoneModel;

import jakarta.validation.Valid;


/**
 *
 * @author damarcones
 */

@RestController
@RequestMapping("/api/telefone")
public class TelefoneController {

    @PostMapping
    public ResponseEntity<String> validarTelefone(@Valid @RequestBody TelefoneModel telefoneModel) {
        return ResponseEntity.ok("Número de telefone Válido");
    }
    



}
