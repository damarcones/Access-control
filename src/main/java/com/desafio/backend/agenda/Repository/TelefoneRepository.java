package com.desafio.backend.agenda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.backend.agenda.Models.TelefoneModel;

/**
 *
 * @author damarcones
 */
public interface TelefoneRepository extends JpaRepository<TelefoneModel, String> {

}
