# Desafio SEA

Documentação da API
Descrição
Este é um projeto que fornece uma API REST para gerenciar o cadastro básico de funcionários e clientes.

## Credenciais de Login
* Método POST
  
  `127.0.0.1:8080/login`
  
  * username: admin
  * pasword: 123qwe!@#

  Essas credencias são inseridas diretamente no banco de dados MySQL quando a aplicação é executada.

  ## Inserindo dados
  * Método POST
  `127.0.0.1:8080/api/pessoa/cadastrar`
```json
{
    "cpf": "04833906154",
    "nome": "Fa2",
    "role": "CLIENTE"
}
```

# Tecnologias Utilizadas
* Java
* SpringBoot
* Maven
* JwT
* MySQL
* Thymeleaf
* lombok
* JPA
