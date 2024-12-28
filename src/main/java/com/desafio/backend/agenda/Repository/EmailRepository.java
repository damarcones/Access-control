package com.desafio.backend.agenda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.backend.agenda.Models.EmailModel;

/**
 *
 * @author damarcones
 */
public interface EmailRepository extends JpaRepository<EmailModel, String>{


}
