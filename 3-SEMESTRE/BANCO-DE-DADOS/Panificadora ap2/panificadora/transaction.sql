-- Utilizando controle de transações, atualize as receitas para reduzir em 10% a  quantidade de fermento utilizada;
DELIMITER //
START TRANSACTION;

UPDATE produtos_ingredientes
SET qtd_utilizada = qtd_utilizada * 0.9
WHERE id_ingrediente = (SELECT id FROM ingredientes WHERE nome = 'fermento');

COMMIT;
DELIMITER ;

-- Utilizando controle de transações, exclua todos os registros de produção do  último mês; 
DELIMITER //

START TRANSACTION

DELETE FROM produtos
WHERE data_producao >= DATE_SUB(CURRENT_DATE, INTERVAL 1 MONTH)

COMMIT;
DELIMITER ;