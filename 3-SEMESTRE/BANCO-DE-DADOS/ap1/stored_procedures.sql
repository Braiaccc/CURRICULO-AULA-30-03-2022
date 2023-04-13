
DELIMITER //
CREATE PROCEDURE buscarLivroPorGenero(p_id INT)
BEGIN
	SELECT g.nome as genero, l.titulo, l.preco, l.qtd_estoque
		FROM livros_generos lg
			JOIN generos g
				ON lg.id_genero = g.id
			JOIN livros l
				ON lg.id_livro = l.id
		WHERE g.id = p_id;
END//

DELIMITER ;

CALL buscarLivroPorGenero(2);

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

CALL buscarLivroPorGenero(1);