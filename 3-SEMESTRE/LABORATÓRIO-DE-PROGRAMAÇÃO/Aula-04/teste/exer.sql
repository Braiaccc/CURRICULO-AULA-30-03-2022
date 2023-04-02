CREATE VIEW livros_mais_vendidos AS
SELECT l.titulo, a.nome as autor, l.valor_unit, SUM(vl.qtd) as qtd_vendida
FROM livros l
INNER JOIN autores_livros al ON l.id = al.id_livro
INNER JOIN autores a ON al.id_autor = a.id
INNER JOIN vendas_livros vl ON l.id = vl.id_livro
GROUP BY l.id
ORDER BY qtd_vendida DESC;

CREATE VIEW autores_nao_venderam AS
SELECT a.id, a.nome
FROM autores a
LEFT JOIN autores_livros al ON a.id = al.id_autor
WHERE al.id_autor IS NULL;

CREATE VIEW faturamento_clientes AS
SELECT c.nome, SUM(vl.qtd * vl.valor_unit) as faturamento_total
FROM clientes c
INNER JOIN vendas v ON c.id = v.id_cliente
INNER JOIN vendas_livros vl ON v.id = vl.id_venda
GROUP BY c.id;