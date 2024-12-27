package com.desafio.backend.agenda.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.desafio.backend.agenda.Models.PessoaModel;
import com.desafio.backend.agenda.Repository.PessoaRepository;

/**
 *
 * @author damarcones
 */
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private PessoaRepository pessoaRepository;


    @Override
    public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        PessoaModel usuario = pessoaRepository.findByNome(nome).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return new org.springframework.security.core.userdetails.User(
                usuario.getNome(),
                usuario.getSenha(),
                List.of(new SimpleGrantedAuthority(usuario.getRole()))
        );
        
    }

    
}
