package com.desafio.backend.agenda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.backend.agenda.Models.EnderecoModel;

/**
 *
 * @author damarcones
 */
public interface EnderecoRepository extends JpaRepository<EnderecoModel, Integer> {

}
