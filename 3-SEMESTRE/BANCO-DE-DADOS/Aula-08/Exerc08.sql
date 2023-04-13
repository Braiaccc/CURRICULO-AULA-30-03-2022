CREATE TABLE Pessoas (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(255) NOT NULL,
  sexo CHAR(1) NOT NULL,
  data_nascimento DATE NOT NULL
);

INSERT INTO Pessoas (nome, sexo, data_nascimento) VALUES ('João', 'M', '2000-01-01');
INSERT INTO Pessoas (nome, sexo, data_nascimento) VALUES ('Maria', 'F', '1995-06-15');
INSERT INTO Pessoas (nome, sexo, data_nascimento) VALUES ('Pedro', 'M', '1987-02-28');

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

