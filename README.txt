ATIVIDADE 1º AVALIAÇÃO - SISTEMA DE BIBLIOTECA

Disciplina: Aplicação de Banco de Dados

Aluno: Herlei C. Pimentel da Silva

Sobre

Esse repositório contém a implementação de um sistema de biblioteca. Ele foca no mapeamento objeto-relacional (ORM) utilizando a API Java JPA e o padrão DAO (Data Access Object).

Estrutura

Esse código foi estruturado visando o desacoplamento e a manutenibilidade do sistema.

'model': Contém as entidades mapeadas com anotações JPA (@Entity), respeitando as associações e cardinalidades do diagrama de classes.

'dao': Concentra a lógica de persistência. A classe EmprestimoDAO realiza as operações de CRUD e consultas customizadas via JPQL.

'util': Provê a conexão com o banco de dados através da configuração do EntityManager.

'test': Conjunto de testes unitários que validam o ciclo de vida dos objetos e a integridade das operações no banco de dados.