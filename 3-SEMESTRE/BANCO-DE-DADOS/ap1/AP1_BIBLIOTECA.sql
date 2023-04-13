CREATE DATABASE biblioteca;

CREATE TABLE clientes(
    id INT PRIMARY KEY auto_increment,
    nome VARCHAR(100),
    CPF VARCHAR(11),
    numero_telefone varchar(11)
);

CREATE TABLE autores(
    id INT PRIMARY KEY auto_increment,
    nome VARCHAR(75)
);

CREATE TABLE livros(
    id INT PRIMARY KEY auto_increment,
    id_autor INT,
    titulo VARCHAR(100),
    preco DECIMAL(10,2),
    qtd_estoque INT,
	CONSTRAINT fk_livros_autor
    FOREIGN KEY(id_autor) REFERENCES autores(id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT
);

CREATE TABLE generos(
    id INT PRIMARY KEY auto_increment,
    nome VARCHAR(75)
);

CREATE TABLE editoras(
    id INT PRIMARY KEY auto_increment,
    nome VARCHAR(75)
);

CREATE TABLE alugueis(
    id INT PRIMARY KEY auto_increment,
    id_cliente INT,
    data_saida DATE,
    CONSTRAINT fk_alugueis_cliente
    FOREIGN KEY(id_cliente) REFERENCES clientes(id)
);


CREATE TABLE livros_generos(
    id_livro int,
    id_genero int,
    CONSTRAINT fk_livros_generos_livro
    FOREIGN KEY(id_livro) REFERENCES livros(id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT fk_livros_generos_genero
    FOREIGN KEY(id_genero) REFERENCES generos(id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT
);

CREATE TABLE aluguel_livros(
    id_livro INT,
    id_aluguel INT,
    CONSTRAINT fk_aluguel_livros_livro
    FOREIGN KEY(id_livro) REFERENCES livros(id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT fk_aluguel_livros_aluguel
    FOREIGN KEY(id_aluguel) REFERENCES alugueis(id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT
);

CREATE TABLE editora_livros(
    id_livro int,
    id_editora int,
    CONSTRAINT fk_editora_livros_livro
    FOREIGN KEY(id_livro) REFERENCES livros(id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT fk_editora_livros_editora
    FOREIGN KEY(id_editora) REFERENCES editoras(id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT
);