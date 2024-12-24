
package com.desafio.backend.agenda.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 *
 * @author damarcones
 */
@Entity(name = "user")
@Table(name = "user")
@Builder
@AllArgsConstructor
@Getter

public class UserModel {

    @Id
    private long cpf;

    private String nome;

    private List<String> email;

    private List<String> telefone;


}
