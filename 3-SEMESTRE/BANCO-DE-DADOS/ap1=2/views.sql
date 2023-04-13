CREATE VIEW livros_mais_alugados AS
SELECT l.id, l.titulo, COUNT(al.id_livro) as qtd_alugadas, l.preco, l.qtd_estoque
FROM livros l
	LEFT JOIN aluguel_livros al
		on l.id = al.id_livro
GROUP BY al.id_livro
ORDER BY qtd_alugadas DESC;

select * from livros_mais_alugados;

CREATE VIEW clientes_que_mais_alugaram as
SELECT c.nome, COUNT(a.id_cliente) as qtd_aluguel
FROM clientes c
	LEFT JOIN alugueis a
		ON c.id = a.id_cliente
GROUP BY a.id_cliente
ORDER BY qtd_aluguel DESC;

select * from clientes_que_mais_alugaram;

CREATE VIEW quantidade_vendidadas_livros_genero AS
SELECT g.nome AS genero, COUNT(al.id_livro) AS quantidade_vendida
FROM livros_generos lg
	JOIN generos g 
		ON lg.id_genero = g.id
	JOIN aluguel_livros al 
		ON lg.id_livro = al.id_livro
GROUP BY g.nome
ORDER BY quantidade_vendida DESC;

select * from quantidade_vendidadas_livros_genero;

-- mostrar 
select l.titulo, GROUP_CONCAT(g.nome SEPARATOR ', ') as generos
from livros l 
	join livros_generos lg
		on l.id = lg.id_livro
	join generos g
		on lg.id_genero = g.id
group by l.id;