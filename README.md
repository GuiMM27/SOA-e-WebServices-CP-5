# Checkpoint 4 - API ReST com Spring Boot (Auto-escola)

API desenvolvida em Java para o gerenciamento e agendamento de instruções de uma auto-escola, contemplando autenticação JWT, controle de acesso por perfis, encriptação de senhas e regras de negócio para cancelamentos.

## Integrantes
Guilherme Moreira RM557290


## Tecnologias Utilizadas
* Java (versão 17+)
* Spring Boot
* Spring Security (com BCryptPasswordEncoder)
* Spring Data JPA
* H2 Database 

## Funcionalidades Implementadas
* Cadastro e listagem de Alunos
* Processo de cadastramento de usuários com encriptação de senha
* Controle de acesso restrito a administradores para gerenciamento de usuários
* Funcionalidade de alteração de senha pelo próprio usuário
* Serviço de cancelamento de instruções com validação de motivo e antecedência mínima de 24 horas