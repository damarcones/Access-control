package com.desafio.backend.agenda.Controllers;

import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author damarcones
 */

@RestController
public class EnderecoController {

    // private final CepService cepService;

    // public EnderecoController(CepService cepService) {
    //     this.cepService = cepService;

    // }
    
    // @Autowired
    // private EnderecoRepository enderecoRepository;

    // @Autowired
    // private PessoaRepository pessoaRepository;

    // @GetMapping("/{cep}")
    // public EnderecoModel buscarEndereco(@PathVariable String cep) {
    //     return cepService.buscarEnderecoCep(cep);
    // }

    // // @PostMapping("/{cep}")
    // // public EnderecoModel enviarEnderecoCep(@PathVariable String cep) {
    // //     return cepService.enviarEnderecoCep(cep);
    // // }

    // @PostMapping("{cpf}/{cep}")
    // public EnderecoModel cadastraEndereco(@PathVariable String cpf,@PathVariable String cep) {
    //     PessoaModel pessoa = pessoaRepository.findById(cpf).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
    //     EnderecoModel endereco = cepService.buscarEnderecoCep(cep);
    //     endereco.setPessoa(pessoa);
    //     // cepService.enviarEnderecoCep(enderecoModel);
    //     return enderecoRepository.save(endereco);
    // }
    
}
