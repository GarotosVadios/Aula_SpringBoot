# Módulo de Backend com Spring Boot e Flyway

## Objetivo do Projeto

Este projeto tem como objetivo o desenvolvimento de um **módulo de backend completo** para cadastro de uma entidade (exemplo: Produto, Cliente, Evento, etc.)

## Tecnologias Utilizadas

- **Spring Boot**: Framework para desenvolvimento do backend.
- **Flyway**: Ferramenta para versionamento e migração do banco de dados.
- **PostgreSQL**: Banco de dados.
- **PGAdmin**: SGBD.

## Estrutura do Projeto

A estrutura do projeto segue as boas práticas de design de software e está organizada nas seguintes camadas:

1. **Model**: Define a entidade do banco de dados.
2. **Repository**: Responsável pela interação com a base de dados.
3. **Service**: Camada de negócios, que contém a lógica do aplicativo.
4. **Controller**: Camada responsável por expor os endpoints RESTful.

## Passos para Configuração do Ambiente

### 1. Clone o Repositório

Clone este repositório para o seu ambiente local:

```bash
git clone https://github.com/seu-usuario/aula_Springboot_Flyway.git
````

# Configurações do Banco de Dados
   # Acessar o Terminal do PostgreSQL
   ````bash
sudo service postgresql start

sudo -u postgres psql

psql -U postgres

````

# Criar Banco de Dados e Usuário
````bash

CREATE DATABASE produtos_db;

CREATE USER rogerio WITH PASSWORD 'rogerio123';

GRANT ALL PRIVILEGES ON DATABASE produtos_db TO meu_usuario;

\q
````
# Tabela SQL

```bash
CREATE TABLE produtos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    preco DECIMAL(10, 2) NOT NULL
)
````

# Maven
````bash

mvn -v

mvn spring-boot:run

````
