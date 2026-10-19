# Checkpoint 5 – API ReST com Spring Boot (Auto-escola)

API desenvolvida em Java para o gerenciamento, agendamento de instruções, controle de segurança JWT, documentação Swagger, consumo de serviços externos e testes automatizados de uma auto-escola.

---

## 👥 Integrantes do Grupo

*   **Guilherme Machado Moreira** – RM557290 – 3ESPV
*   **Enzo Almeida Santos Ramos** – RM556900 – 3ESPV
*   **Gabriel de Mello Silva Fernandes** – RM5544213 – 3ESPV

---

## 🛠️ Tecnologias Utilizadas

*   **Java** (Versão 17+)
*   **Spring Boot**
*   **Spring Security** (com BCryptPasswordEncoder e autenticação JWT)
*   **Spring Data JPA** & **H2 Database**
*   **SpringDoc OpenAPI (Swagger)** para documentação automática
*   **JUnit 5 & Mockito** para testes automatizados
*   **RestTemplate** para consumo de API externa (ViaCEP)

---

## 🚀 Funcionalidades Implementadas

*   **CRUD Completo** de Alunos, Instrutores e Usuários.
*   **Sistema de Autenticação e Autorização** via Tokens JWT, encriptando senhas com BCrypt e controlando perfis de acesso (ADMIN).
*   **Agendamento e Cancelamento de Instruções** com validações de regras de negócio (horário de funcionamento, antecedência mínima de 24h para cancelamento, limite de aulas diárias por aluno, etc.).
*   **Documentação Interativa (Swagger)** disponível em `/swagger-ui/index.html`.
*   **CORS Global** configurado para consumo flexível por clientes externos.
*   **Consumo de WebService Externo** (Integração com a API do ViaCEP).
*   **Testes Automatizados Unitários** utilizando JUnit e Mockito.

---

## 📄 Como Executar o Projeto

1. Clone o repositório para o seu computador:
   
   git clone [https://github.com/GuiMM27/SOA-e-WebServices---CP-5.git](https://github.com/GuiMM27/SOA-e-WebServices---CP-5.git)
Acesse a pasta do projeto (autoescola):

Bash
cd SOA-e-WebServices---CP-5/autoescola
Execute a aplicação utilizando o Maven Wrapper:

No Windows (Git Bash/CMD):

Bash
./mvnw.cmd spring-boot:run
No Linux/Mac:

Bash
./mvnw spring-boot:run
📚 Documentação da API (Swagger)
Com a aplicação rodando localmente, acesse o link abaixo no seu navegador para visualizar e testar todos os endpoints interativamente:
👉 http://localhost:8080/swagger-ui/index.html

🧪 Executando os Testes Automatizados
Para rodar a suíte de testes unitários e de integração configurada no projeto, execute:

Bash
./mvnw.cmd test