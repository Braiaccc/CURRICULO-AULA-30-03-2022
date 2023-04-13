INSERT INTO clientes (nome, CPF, numero_telefone) VALUES
('João Silva', '12345678901', '11987654321'),
('Maria Souza', '98765432101', '11999999999'),
('Lucas Ferreira', '45678912301', '11888888888'),
('Ana Paula', '78901234501', '11777777777'),
('Carlos Eduardo', '23456789010', '11666666666');

INSERT INTO autores (nome) VALUES
('J.K. Rowling'),
('Stephen King'),
('Machado de Assis'),
('Clarice Lispector'),
('George Orwell');

INSERT INTO livros (titulo, preco, qtd_estoque, id_autor) VALUES
('Harry Potter e a Pedra Filosofal', 35.99, 10, 1),
('O Iluminado', 29.99, 5, 2),
('Dom Casmurro', 25.99, 15, 3),
('A Hora da Estrela', 20.99, 20, 4),
('1984', 18.99, 30, 5);

INSERT INTO generos (nome) VALUES
('Fantasia'),
('Terror'),
('Romance'),
('Drama'),
('Ficção Científica');

INSERT INTO livros_generos (id_livro, id_genero) VALUES
(1, 1),
(1, 5),
(2, 2),
(3, 3),
(4, 4),
(4, 3),
(5, 5),
(5, 4);

INSERT INTO editoras (nome) VALUES
('Editora Rocco'),
('Editora Objetiva'),
('Companhia das Letras'),
('Record'),
('Intrínseca');

INSERT INTO alugueis (id_cliente, data_saida) VALUES
(1, '2022-04-01'),
(2, '2022-03-27'),
(3, '2022-04-03'),
(4, '2022-04-02'),
(5, '2022-03-31');

INSERT INTO aluguel_livros (id_livro, id_aluguel, preco) VALUES
(1, 1, 35.99),
(2, 2, 20.99),
(3, 3, 25.99),
(4, 4, 20.99),
(5, 5, 18.99),
(1, 2, 35.99),
(4, 2, 20.99),
(1, 3, 35.99),
(2, 4, 29.99),
(3, 4, 25.99),
(4, 5, 20.99),
(5, 5, 18.99);

INSERT INTO editora_livros (id_livro, id_editora) VALUES 
(1, 1),
(2, 1),
(3, 2),
(4, 2),
(5, 3);