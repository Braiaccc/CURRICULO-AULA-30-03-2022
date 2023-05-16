CREATE DATABASE panificadora;
USE panificadora;

SET autocommit = 0;

CREATE TABLE categorias (
    id int PRIMARY KEY auto_increment, 
    nome varchar(45)
);

CREATE TABLE produtos (
    id int PRIMARY KEY auto_increment,
    nome varchar(45),
    qtd_produzida int,
    data_producao date,
    id_categoria int,
    CONSTRAINT FK_produtos
    FOREIGN KEY (id_categoria) REFERENCES categorias(id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT
);

CREATE TABLE ingredientes (
    id int PRIMARY KEY auto_increment,
    nome varchar(45),
    qtd double,
    medida varchar(45)
);

CREATE TABLE produtos_ingredientes (
    qtd_utilizada double,
    id_ingrediente int,
    id_produto int,
    CONSTRAINT FK_produtos_ingredientes_1
    FOREIGN KEY (id_produto) REFERENCES produtos (id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT,
    CONSTRAINT FK_produtos_ingredientes_2
    FOREIGN KEY (id_ingrediente) REFERENCES ingredientes (id)
        ON UPDATE CASCADE
        ON DELETE RESTRICT
);

-- 3. Alterar a tabela de Produtos e incluir o tempo de validade.
ALTER TABLE produtos
ADD validade date;