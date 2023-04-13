CREATE VIEW livros_mais_alugados AS
SELECT l.id, l.titulo, COUNT(al.id_livro) as qtd_alugadas
FROM livros l
	LEFT JOIN aluguel_livros al
		on l.id = al.id_livro
group by al.id_livro
order by qtd_alugadas DESC;

CREATE VIEW clientes_que_mais_alugaram as
SELECT c.nome, COUNT(a.id_cliente) as qtd_aluguel
FROM clientes c
	LEFT JOIN alugueis a
		ON c.id = a.id_cliente
GROUP BY a.id_cliente
ORDER BY qtd_aluguel DESC;

CREATE VIEW quantidade_livros_genero AS
SELECT g.nome AS genero, COUNT(al.id_livro) AS quantidade_vendida
FROM livros_generos lg
JOIN generos g ON lg.id_genero = g.id
JOIN aluguel_livros al ON lg.id_livro = al.id_livro
GROUP BY g.nome
ORDER BY quantidade_vendida DESC;
