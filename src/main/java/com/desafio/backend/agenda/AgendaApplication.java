package com.desafio.backend.agenda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.desafio.backend.agenda.Models.PessoaModel;
import com.desafio.backend.agenda.Repository.PessoaRepository;

@SpringBootApplication
public class AgendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);

	}

	@Bean
    CommandLineRunner initDatabase(PessoaRepository pessoaRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (pessoaRepository.count() == 0) { // Verifica se o banco está vazio
                PessoaModel admin = new PessoaModel();
                admin.setCpf("33831106100");
                admin.setNome("admin");
                admin.setSenha(passwordEncoder.encode("123qwe!@#"));
                admin.setRole("ROLE_ADMIN");
                pessoaRepository.save(admin);

                PessoaModel user = new PessoaModel();
                user.setCpf("04443907766");
                user.setNome("user");
                user.setSenha(passwordEncoder.encode("123qwe123"));
                user.setRole("ROLE_USER");
                pessoaRepository.save(user);

                PessoaModel user2 = new PessoaModel();
                user2.setCpf("04243907766");
                user2.setNome("user");
                user2.setSenha(passwordEncoder.encode("123qwe123"));
                user2.setRole("ROLE_USER");
                pessoaRepository.save(user2);

                System.out.println("Usuários iniciais criados!");
            }
        };
	}

}
