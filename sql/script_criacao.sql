CREATE TABLE Aluno (
    id SERIAL PRIMARY KEY,
    matriculaAluno INT NOT NULL UNIQUE,
    nome VARCHAR(255) NOT NULL
);

CREATE TABLE Publicacao (
    id SERIAL PRIMARY KEY,
    codigoPub INT NOT NULL UNIQUE,
    titulo VARCHAR(255) NOT NULL,
    ano INT,
    autor VARCHAR(255),
    tipo VARCHAR(50)
);

CREATE TABLE Emprestimo (
    id SERIAL PRIMARY KEY,
    dataEmprestimo DATE NOT NULL,
    dataDevolucao DATE,
    aluno_id INT,
    publicacao_id INT,
    CONSTRAINT fk_aluno FOREIGN KEY (aluno_id) REFERENCES Aluno(id),
    CONSTRAINT fk_publicacao FOREIGN KEY (publicacao_id) REFERENCES Publicacao(id)
);
