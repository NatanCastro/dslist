# dslist
API Spring Boot desenvolvida durante o intensivo Java Spring Boot.

## Requisitos para rodar esse projeto

 - Java 17
 - maven instalado ou uma IDE que compile e rode o programa (intellij IDEA, eclipse, etc...)
 - (opicional) postgres instalado na maquina ou em um container docker

## Tecnologias usadas

**Linguagens, frameworks e bibliotecas**

Java, Spring boot, JPA

**Bancos de dados**

*postgres* usado em desenvolvimento e em produção <br>
*H2* usado para teste rapido da aplicação

## Endpoints

 - /games - lista todos os jogos cadastrados <br>
 - /games/{id}__*__ - retorna o jogo especificado <br>
 - /lists - lista todas as listas de jogos cadastradas <br>
 - /lists/{listId}__**__ - retorna a lista jogos especificada <br>
 - /lists/{listId}__**__/games - retorna os jogos de uma lista especifica <br>

**termos**

*{id}*__*__ - referece ao id que o jogo tem no banco de dados <br>
Exemplo: /games/4

*{listId}*__**__ - referece ao id que a lista de jogos tem no banco de dados <br>
Exemplos: /lists/3 e lists/5/games

## Modelo de domínio DSList
![Modelo de domínio DSList](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)
