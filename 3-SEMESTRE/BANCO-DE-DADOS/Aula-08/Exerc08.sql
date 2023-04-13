/* Crie uma tabela Pessoas que contenha as colunas id, nome, sexo e data_nascimento.
*/

CREATE TABLE Pessoas (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(255) NOT NULL,
  sexo CHAR(1) NOT NULL,
  data_nascimento DATE NOT NULL
);

INSERT INTO Pessoas (nome, sexo, data_nascimento) VALUES ('João', 'M', '2000-01-01');
INSERT INTO Pessoas (nome, sexo, data_nascimento) VALUES ('Maria', 'F', '1995-06-15');
INSERT INTO Pessoas (nome, sexo, data_nascimento) VALUES ('Pedro', 'M', '1987-02-28');

/* 1- Crie uma Store Procedure onde sejam possíveis passar como parâmetro as informações para Nome,
 Sexo e Data_Nascimento.
 Esta Stored Procedure deverá consultar no banco de dados o último ID gerado na tabela de Pessoas, 
 incrementar este ID e inserir um registro nesta tabela com os dados enviados por parâmetro.*/

DELIMITER //
CREATE PROCEDURE InserirPessoa(
	IN p_nome VARCHAR(100),
    IN p_sexo CHAR(1),
    IN p_data_nascimento DATE
)
	BEGIN
		DECLARE v_id INT;
        
        SELECT MAX(id) INTO v_id FROM Pessoas;
        SET v_id = COALESCE(v_id, 0) + 1;
        
         INSERT INTO Pessoas (id, nome, sexo, data_nascimento) 
			VALUES (v_id, p_nome, p_sexo, p_data_nascimento);
    END//
    
DELIMITER ;
	
    CALL InserirPessoa('ANA', 'F', '2023-05-12');
    
    SELECT * FROM Pessoas

/* 2 - Crie uma Stored Procedure que mostre quantos Homens e quantas Mulheres têm cadastrados.
*/
 
DELIMITER // 
CREATE PROCEDURE contarQtdGeneros()

BEGIN
	DECLARE p_qtd_masc INT;
	DECLARE p_qtd_fem INT;

	SELECT COUNT(*) 
		INTO p_qtd_masc 
			FROM Pessoas
			WHERE sexo = 'M';

SELECT COUNT(*) 
INTO p_qtd_fem
FROM Pessoas
WHERE sexo = 'F';

SELECT p_qtd_fem, p_qtd_masc;

END //

DELIMITER ;

CALL contarQtdGeneros();

/*
3 - Crie uma Stored Procedure que mostre quantos Homens são menores e maiores de idade,
e quantas Mulheres são maiores e menores de idade.
*/

DELIMITER //
CREATE PROCEDURE sp_contagem_idade()
BEGIN
    SELECT
        SUM(CASE WHEN sexo = 'M' AND TIMESTAMPDIFF(YEAR, data_nascimento, CURDATE()) >= 18 THEN 1 ELSE 0 END) AS qtd_homem_maior_idade,
        SUM(CASE WHEN sexo = 'M' AND TIMESTAMPDIFF(YEAR, data_nascimento, CURDATE()) < 18 THEN 1 ELSE 0 END) AS qtd_homem_menor_idade,
        SUM(CASE WHEN sexo = 'F' AND TIMESTAMPDIFF(YEAR, data_nascimento, CURDATE()) >= 18 THEN 1 ELSE 0 END) AS qtd_mulher_maior_idade,
        SUM(CASE WHEN sexo = 'F' AND TIMESTAMPDIFF(YEAR, data_nascimento, CURDATE()) < 18 THEN 1 ELSE 0 END) AS qtd_mulher_menor_idade
    FROM Pessoas;
END //
DELIMITER ;

CALL sp_contagem_idade();

/*Crie uma Stored Procedure que receba dois Números.
 Esta Procedure ao ser executada deverá mostrar o retorno obtido se estes dois números fossem somados, 
diminuídos, multiplicados e divididos.*/

DELIMITER //
CREATE PROCEDURE sp_operacoes_aritmeticas(
    IN num1 INT,
    IN num2 INT
)
BEGIN
    SELECT
        num1 + num2 AS soma,
        num1 - num2 AS diferenca,
        num1 * num2 AS multiplicacao,
        CASE WHEN num2 = 0 THEN NULL ELSE num1 / num2 END AS divisao
    FROM DUAL;
END //

DELIMITER ;

CALL sp_operacoes_aritmeticas(40, 35);
