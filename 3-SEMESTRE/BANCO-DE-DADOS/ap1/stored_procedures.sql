-- Busca um cliente por CPF, retornando os livros que ele já alugou e o total que ja foi gasto por ele
DELIMITER //
CREATE PROCEDURE buscarInfoAluguelPorCPF(p_CPF varchar(11))
BEGIN
	SELECT c.nome, c.CPF, group_concat(l.titulo SEPARATOR ', ') as nome_livros, SUM(al.preco) as total_gasto
	FROM clientes c
		JOIN alugueis a
			ON a.id_cliente = c.id
		JOIN aluguel_livros al
			ON al.id_aluguel = a.id
		JOIN livros l
			ON l.id = al.id_livro
	WHERE CPF = p_CPF
    GROUP BY al.id_aluguel;
END//
DELIMITER ;

call buscarInfoAluguelPorCPF('04448991032');

-- Inserir Cliente
DELIMITER //
CREATE PROCEDURE inserirCliente(p_nome varchar(100), p_CPF varchar(11), p_telefone varchar(11))
BEGIN
	INSERT INTO clientes(nome, CPF, numero_telefone) VALUES
    (p_nome, p_CPF, p_telefone);
    SELECT p_nome, p_CPF, p_telefone;
END//
DELIMITER ;

call inserirCliente('Bernardo Alves', '12345678932', '111111111111');

-- Atualizar preço de livro
DELIMITER //
CREATE PROCEDURE atualizarPrecoLivro(p_id INT, p_preco DECIMAL(10, 2))
BEGIN
	UPDATE livros
    SET preco = p_preco
    WHERE id = p_id;
END//
DELIMITER ;

call atualizarPrecoLivro(1, 50);

-- Buscar livros por genero

DELIMITER //
CREATE PROCEDURE buscarLivrosPorGenero(p_id INT)
BEGIN
	SELECT g.nome as genero, l.titulo, l.preco, l.qtd_estoque
    FROM generos g
		JOIN livros_generos lg
			ON g.id = lg.id_genero
		JOIN livros l
			ON l.id = lg.id_livro
    where g.id = p_id;
END//
DELIMITER ;

call buscarLivrosPorGenero(5);

-- Buscar clientes que ja alugaram X livro
DELIMITER //
CREATE PROCEDURE buscarClientesQueJaAlugaram(p_id INT)
BEGIN
    SELECT l.titulo, c.nome, al.preco
    FROM livros l
        JOIN aluguel_livros al
            ON l.id = al.id_livro
		JOIN alugueis a
			ON al.id_aluguel = a.id
        JOIN clientes c
            ON c.id = a.id_cliente
	WHERE l.id = p_id;
END//
DELIMITER ;

call buscarClientesQueJaAlugaram(2);