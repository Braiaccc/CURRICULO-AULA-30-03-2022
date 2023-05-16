-- Exibir quantos produtos há para cada categoria; 
SELECT c.nome, p.nome
FROM categorias c
    JOIN produtos p
        on c.id = p.id_categoria
group by c.id;

-- Exibir todos os produtos, quais ingredientes e em que quantidade são  utilizados para produzi-lo;
SELECT p.nome, GROUP_CONCAT(i.nome SEPARATOR '|') as ingredientes, GROUP_CONCAT(CONCAT(pi.qtd_utilizada, i.medida) SEPARATOR '|') as quantidades_ingredientes
FROM produtos p
    JOIN produtos_ingredientes pi
        on p.id = pi.id_produto
    JOIN ingredientes i
        on i.id = pi.id_ingrediente
group by p.id;

-- Exibir qual a quantidade produzida de cada produto dos últimos 30 dias; 
SELECT p.nome, sum(qtd_produzida) as qtd
FROM produtos p 
where p.data_producao >= DATE_SUB(CURRENT_DATE, INTERVAL 30 DAY)
group by p.nome;

-- Se for dobrada a produção para o próximo mês, quanto de ingrediente será necessário.  

SELECT p.nome, GROUP_CONCAT(i.nome SEPARATOR '|') as ingredientes, GROUP_CONCAT(CONCAT(pi.qtd_utilizada * 2, i.medida) SEPARATOR '|') as quantidades_ingredientes
FROM produtos p
    JOIN produtos_ingredientes pi
        on p.id = pi.id_produto
    JOIN ingredientes i
        on i.id = pi.id_ingrediente
where p.data_producao >= DATE_SUB(CURRENT_DATE, INTERVAL 30 DAY)
group by p.id;

-- Mostrar os ingredientes que nunca foram utilizados; 
SELECT i.nome
FROM ingredientes i
    LEFT JOIN produtos_ingredientes pi
        ON pi.id_ingrediente = i.id
WHERE pi.id_ingrediente is null;
