INSERT INTO clientes (nome, CPF, numero_telefone) VALUES 
('João Silva', '11122233344', '11987654321'),
('Maria Santos', '22233344455', '11999998888'),
('Pedro Lima', '33344455566', '11888887777'),
('Ana Rodrigues', '44455566677', '11777776666'),
('Lucas Souza', '55566677788', '11666665555'),
('Julia Costa', '66677788899', '11555554444'),
('Rafaela Oliveira', '77788899900', '11444443333'),
('Gustavo Pereira', '88899900011', '11333332222'),
('Fernanda Almeida', '99900011122', '11222221111'),
('Marcos Santos', '00011122233', '11111110000'),
('Will Smith', '00011122253', '11987654321');

INSERT INTO autores (nome) VALUES
('Machado de Assis'),
('J.K. Rowling'),
('J.R.R. Tolkien'),
('Dan Brown'),
('William P. Young'),
('George Orwell'),
('E.L. James'),
('Aluísio Azevedo'),
('Antoine de Saint-Exupéry'),
('Guimarães Rosa');

INSERT INTO livros (titulo, preco, qtd_estoque, id_autor) VALUES 
('A Cabana', 29.90, 20, 5),
('O Código Da Vinci', 49.99, 15, 4),
('Harry Potter e a Pedra Filosofal', 35.00, 10, 2),
('O Pequeno Príncipe', 25.00, 5, 9),
('O Hobbit', 42.00, 12, 3),
('O Senhor dos Anéis: A Sociedade do Anel', 50.00, 8, 3),
('1984', 27.50, 18, 6),
('Dom Casmurro', 20.00, 25, 1),
('O Cortiço', 15.00, 30, 8),
('Grande Sertão: Veredas', 38.00, 7, 10);

INSERT INTO generos (nome) VALUES 
('Romance'),
('Ficção Científica'),
('Fantasia'),
('Suspense'),
('Drama'),
('Comédia'),
('Terror'),
('Ação'),
('Aventura'),
('Mistério');


INSERT INTO livros_generos (id_livro, id_genero) VALUES 
(1, 1),
(1, 2),
(2, 4),
(2, 1),
(3, 3),
(3, 1),
(3, 9),
(4, 5),
(5, 3),
(5, 8),
(5, 9),
(6, 3),
(6, 9),
(6, 8),
(7, 7),
(7, 2),
(8, 1),
(9, 1),
(10, 9);

INSERT INTO editoras (nome) VALUES 
('Editora Arqueiro'),
('Editora Sextante'),
('Editora Record'),
('Editora Companhia das Letras'),
('Editora Intrínseca'),
('Editora Rocco'),
('Editora Globo'),
('Editora Abril'),
('Editora Scipione'),
('Editora Moderna');

INSERT INTO alugueis (id_cliente, data_saida) VALUES 
(1, '2022-01-01'),
(2, '2022-01-02'),
(3, '2022-01-03'),
(4, '2022-01-04'),
(5, '2022-01-05'),
(6, '2022-01-06'),
(7, '2022-01-07'),
(8, '2022-01-08'),
(9, '2022-01-09'),
(10, '2022-01-10'),
(1, '2022-01-03'),
(2, '2022-01-05'),
(3, '2022-01-01'),
(9, '2022-01-09'),
(1, '2022-01-06'),
(1, '2022-01-07'),
(10, '2022-01-08'),
(9, '2022-02-23');

INSERT INTO aluguel_livros (id_livro, id_aluguel, preco) VALUES 
(1, 1, 29.90),
(2, 2, 53.00),
(3, 3, 30.00),
(4, 4, 25.00),
(5, 5, 45.00),
(1, 2, 60.00),
(6, 6, 50.00),
(8, 6, 20.00),
(5, 6, 45.00),
(7, 7, 27.50),
(10, 7, 45.00),
(8, 8, 20.00),
(9, 9, 20.00),
(1, 10, 25.00),
(9, 10, 17.50),
(10, 10, 45.00);

INSERT INTO editora_livros (id_livro, id_editora) VALUES 
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(6, 7),
(7, 7),
(7, 1),
(8, 8),
(9, 9),
(9, 2),
(10, 10);

