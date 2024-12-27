package com.desafio.backend.agenda.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.backend.agenda.Models.PessoaModel;


/**
 *
 * @author damarcones
 */
public interface PessoaRepository extends JpaRepository<PessoaModel, String>{

    Optional<PessoaModel> findByNome(String nome);

}
