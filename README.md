# Spring Security JDBC Authentication Demo

Demo de uma API que autentica usuários em um Banco de Dados.
Nesse exemplo foi utilizado o Banco de Dados em memória
[H2](https://www.h2database.com/html/main.html).

O schema utilizado foi o presente em 
DEFAULT_USER_SCHEMA_DDL_LOCATION, da classe JdbcDaoImpl, 
do pacote `org.springframework.security.core.userdetails.jdbc`.

Temos dois end-points GET:
 - `/` - Usuários comuns (ROLE_USER)
 - `/admin` - Administradores (ROLE_ADMIN)

Todas as rotas precisam de autenticação, excluindo o 
console do H2, em `/h2-console`. Então, é possível acessar
o console e criar mais usuários para testes. Utilize um 
gerador de hash Bcrypt, como o 
[bcrypt-generator.com](https://bcrypt-generator.com),
se desejar criar um usuário pelo console do H2.

Foram criados dois usuários para testar os conceitos 
envolvidos:
 - Admin
   - username: wande
   - password: password 
 - User
   - username: wade
   - password: senha

## Como rodar

```sh
$ mvn spring-boot:run
```
