'1 - Escreva uma consulta que retorne o nome do cliente, a soma do valor total das compras e o número total de pedidos feitos por cada cliente, apenas para aqueles que fizeram pelo menos três pedidos. Use um inner join entre as tabelas "clientes" e "pedidos" e agrupe os resultados pelo nome do cliente.'

SELECT c.nome, SUM(p.valor_total) as valor_total_compras, COUNT(p.id) as total_pedidos
FROM clientes c
INNER JOIN pedidos p ON c.id = p.id_cliente
GROUP BY c.nome
HAVING COUNT(p.id) >= 3;


'2 - Escreva uma consulta que retorne o nome do produto, a média do preço de venda e a soma total de unidades vendidas por categoria de produto. Use um left join entre as tabelas "produtos" e "vendas" e agrupe os resultados pela categoria do produto.'

SELECT p.nome, AVG(v.preco_venda) as media_preco_venda, SUM(v.unidades_vendidas) as total_unidades_vendidas, cat.nome as categoria
FROM produtos p
LEFT JOIN vendas v ON p.id = v.id_produto
INNER JOIN categorias cat ON p.id_categoria = cat.id
GROUP BY cat.nome, p.nome;

'3 - Escreva uma consulta que retorne o nome do fornecedor, o nome do produto e o número total de unidades compradas por fornecedor e por produto, apenas para aqueles com mais de 100 unidades compradas. Use um inner join entre as tabelas "fornecedores", "produtos" e "compras" e agrupe os resultados pelo nome do fornecedor e pelo nome do produto.'

SELECT f.nome as fornecedor, p.nome as produto, SUM(c.unidades_compradas) as total_unidades_compradas
FROM fornecedores f
INNER JOIN produtos p ON f.id = p.id_fornecedor
INNER JOIN compras c ON p.id = c.id_produto
GROUP BY f.nome, p.nome
HAVING SUM(c.unidades_compradas) > 100;

'4 - Escreva uma consulta que retorne o nome do departamento, o nome do funcionário e a média do salário dos funcionários em cada departamento, apenas para aqueles com uma média de salário superior a R$ 5000. Use um left join entre as tabelas "funcionarios" e "departamentos" e agrupe os resultados pelo nome do departamento e pelo nome do funcionário.'

SELECT d.nome as departamento, f.nome as funcionario, AVG(f.salario) as media_salario
FROM funcionarios f
LEFT JOIN departamentos d ON f.id_departamento = d.id
GROUP BY d.nome, f.nome
HAVING AVG(f.salario) > 5000;

'5- Escreva uma consulta que retorne o nome do cliente, o nome do produto e a soma do valor total das compras feitas por cada cliente para cada produto. Use um right join entre as tabelas "clientes" e "compras" e um inner join entre as tabelas "produtos" e "compras" e agrupe os resultados pelo nome do cliente e pelo nome do produto.'

SELECT c.nome as cliente, p.nome as produto, SUM(c.valor_total) as valor_total_compras
FROM compras c
RIGHT JOIN clientes cl ON c.id_cliente = cl.id
INNER JOIN produtos p ON c.id_produto = p.id
GROUP BY cl.nome, p.nome;
