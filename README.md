# Projeto de Teste de Requisições HTTP

## Tecnologias Utilizadas
- Java
- Spring Boot
- JPA
- MySQL
- Maven

## Configuração do Banco de Dados
1. Crie um banco de dados MySQL.
2. Configure `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
   ````

## Como Executar
1. Clone o repositório:
   ```sh
   git clone https://github.com/LrAmaral/restful-api/
   ```
2. Acesse o diretório do projeto:
   ```sh
   cd seu-repo
   ```
3. Compile e execute:
   ```sh
   mvn spring-boot:run
   ```

## Testando a API
Use ferramentas como Postman para testar as requisições HTTP.
