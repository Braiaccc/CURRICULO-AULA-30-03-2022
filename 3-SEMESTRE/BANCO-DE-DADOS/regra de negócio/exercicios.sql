'1 mostrar numero total de vendas e o valor total de vendas para cada cliente que realizar pelo menos uma compra'

SELECT c.nome, COUNT(*) AS numero_vendas, SUM(v.valor) AS valor_total_vendas
FROM clientes c
INNER JOIN vendas v ON c.id_cliente = v.id_cliente
GROUP BY c.nome
HAVING COUNT(*) > 0;

'2 mostrar o número de vendas feitas para cada produto, incluindo produtos que nunca foram vendidos.'

SELECT p.nome, COUNT(v.id_venda) AS numero_vendas
FROM produtos p
LEFT JOIN vendas_produtos vp ON p.id_produto = vp.id_produto
LEFT JOIN vendas v ON vp.id_venda = v.id_venda
GROUP BY p.nome;

'3 mostrar o valor total de vendas realizadas para cada mês do ano.'

SELECT DATE_TRUNC('month', data_venda) AS mes, SUM(valor) AS valor_total_vendas
FROM vendas
GROUP BY mes;
