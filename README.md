# Projeto API-Cliente

## Visão Geral
O projeto api-cliente é uma aplicação Front-end e Back-end desenvolvida em Java 17, destinada à gestão de informações de clientes. Este projeto foi desenvolvido seguindo o padrão de arquitetura de software MVC (Model-View-Controller), utilizando Spring Boot, Spring Data JPA, e Lombok, e é configurado com Maven para a gestão de dependências e build do projeto. O banco de dados utilizado é o H2, que oferece rapidez e simplicidade para o desenvolvimento e testes.

## Tecnologias Utilizadas
- *Linguagem de Programação:* Java 17
- *Framework:* Spring Boot 3.2.0
- *Persistência de Dados:* Spring Data JPA
- *Biblioteca:* Lombok
- *Banco de Dados:* H2 Database
- *Gerenciamento de Projeto e Build:* Maven

## Características

- *Padrão MVC:* O projeto segue o padrão MVC, que separa a aplicação em três componentes interconectados: o Modelo (Model), a Visualização (View) e o Controlador (Controller). Este padrão foi fundamental para organizar a lógica de negócio, a interface do usuário e a interação do usuário, facilitando a manutenção do projeto.
- *Spring Boot 3.2.0:* Este framework é utilizado no projeto com o propósito de otimizar o processo de desenvolvimento utilizando Spring, removendo as complexidades associadas à configuração de aplicações. A sua inclusão no projeto aprimorou a eficiência no desenvolvimento, reduzindo significativamente o tempo e esforço de configuração.
- *Spring Data JPA:* Facilita a implementação da camada de persistência de dados.
- *Lombok:* A seleção do Lombok para este projeto foi motivada pela sua capacidade de automatizar a geração de métodos comuns em classes Java. Esta biblioteca contribui para um código mais enxuto e legível, reduzindo a necessidade de codificação padrão, como getters, setters e métodos construtores, melhorando assim a eficiência do desenvolvimento.
- *H2 Database:* A decisão de utilizar o H2 Database, um sistema de gerenciamento de banco de dados em memória, foi fundamentada na sua eficácia durante as fases de desenvolvimento e teste. Esta escolha foi atribuída devido à sua simplicidade de integração, que facilita a realização de testes rápidos e o desenvolvimento ágil.
- *Maven:* O maven foi adotada no projeto para desenpenhar um papel crucial na criação e no gerenciamento eficiente das dependências.

- *ModelMapper:* Introduzido o uso do ModelMapper para simplificar a conversão entre entidades JPA e objetos DTO (Data Transfer Object). O ModelMapper automatiza o mapeamento de campos entre esses dois tipos de objetos, reduzindo a necessidade de código manual e melhorando a manutenibilidade.

- *DTOs (Data Transfer Objects):* Adicionada a utilização de DTOs para transferência de dados entre a camada de controle e a camada de visualização. Isso permite uma maior flexibilidade no design da API, evitando a exposição desnecessária de detalhes internos das entidades JPA.

## Telas
  - Busca de clientes
    ![Screenshot from 2023-12-14 02-14-09](https://github.com/manoelerickgp/api-client/assets/139079937/b0c40f60-be73-4b46-88b3-7206b29cfac0)

  - Clientes encontrados
    ![Screenshot from 2023-12-14 02-15-43](https://github.com/manoelerickgp/api-client/assets/139079937/6ddc338c-fd7e-4425-88c8-caada7b8e184)

  - Botao: Detalhes -> Irá exibir os detalhes do cliente
    ![Screenshot from 2023-12-14 02-16-15](https://github.com/manoelerickgp/api-client/assets/139079937/73cb0541-17cf-4be2-a1d4-5bfd3018cd3a)

  - Botao: Voltar -> Irá minimizar os detalhes do cliente.
    ![Screenshot from 2023-12-14 02-51-54](https://github.com/manoelerickgp/api-client/assets/139079937/b9235af7-d322-4a16-8f70-eb63c0f7847e)

  - Botao: Excluir -> Removerá o cliente da listagem, sem que seja apagado do banco de dados(sem chamar API).
    ![Screenshot from 2023-12-14 02-53-23](https://github.com/manoelerickgp/api-client/assets/139079937/dde9d04c-f830-45c6-9f9b-a55663afd843)

  - Botao: Visualizar PDF -> Irá direcionar o usuário para uma nova aba, onde será apresentado o PDF da fatura.

## GET Clientes por data de nascimento
  - URL -> http://localhost:8080/api/v1/persons/findByPeriod?birthdayStart=1996-02-24&birthdayEnd=2010-02-09

## GET Todos os clientes
  - URL -> http://localhost:8080/api/v1/persons

## GET Cliente por ID
  - URL -> http://localhost:8080/api/v1/persons
  - 
![Screenshot from 2023-12-14 02-36-56](https://github.com/manoelerickgp/api-client/assets/139079937/c5c731a9-2504-429a-8242-b7342637d5f9)


## GET Todos cartoes de credito
  - URL -> http://localhost:8080/api/v1/credit_cards

## GET Cartao por ID
  - URL -> http://localhost:8080/api/v1/credit_cards/3
  - 
![Screenshot from 2023-12-14 02-40-30](https://github.com/manoelerickgp/api-client/assets/139079937/7e4cbf61-fac6-473a-a586-216be5a230b0)


## GET Todos enderecos
  - URL -> http://localhost:8080/api/v1/addresses

## GET Endereco por ID
  - URL -> http://localhost:8080/api/v1/addresses/3
  - 
![Screenshot from 2023-12-14 02-45-07](https://github.com/manoelerickgp/api-client/assets/139079937/0bd7985f-f48e-477e-b461-a33e0d0498ed)

