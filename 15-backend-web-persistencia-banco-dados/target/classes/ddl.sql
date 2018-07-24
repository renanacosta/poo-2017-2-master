-- psql -U aluno -W -h 10.132.214.1 postgres

CREATE DATABASE poo20172agendamarcio;

\C poo20172agendamarcio

CREATE TABLE contatos (
  codigo   SERIAL       NOT NULL PRIMARY KEY,
  nome     VARCHAR(50)  NOT NULL,
  telefone VARCHAR(20)      NULL,
  email    VARCHAR(100)     NULL
);

INSERT INTO contatos VALUES (
  DEFAULT, 'John Doe', 
  '88772233', 'john@doe.me'
);