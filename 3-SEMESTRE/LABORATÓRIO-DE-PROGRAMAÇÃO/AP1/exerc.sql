CREATE TABLE produto (
    Prd_Qtd_Estoque INT,
    Prd_Falta INT,
    Prd_Codigo INT PRIMARY KEY,
    Prd_Descricao VARCHAR(255),
    Prd_Valor DECIMAL(10,2),
    Prd_Status INT
);

CREATE TABLE orcamentos_produtos (
    Orp_Qtd INT,
    Orp_Valor DECIMAL(10,2),
    Orc_Codigo INT,
    Orp_Status INT,
    Prd_Codigo INT,
    PRIMARY KEY (Orc_Codigo, Prd_Codigo),
    FOREIGN KEY (Orc_Codigo) REFERENCES orcamentos(Orc_Codigo),
    FOREIGN KEY (Prd_Codigo) REFERENCES produto(Prd_Codigo)
);

CREATE TABLE orcamentos (
    Orc_Codigo INT PRIMARY KEY,
    Orc_Data DATE,
    Orc_Status INT
);

CREATE TRIGGER atualiza_estoque
AFTER INSERT ON orcamentos_produtos
FOR EACH ROW
BEGIN
  IF NEW.Orp_Status = 2 THEN
    UPDATE produto SET Prd_Qtd_Estoque = Prd_Qtd_Estoque + NEW.Orp_Qtd WHERE Prd_Codigo = NEW.Prd_Codigo;
  ELSE
    UPDATE produto SET Prd_Qtd_Estoque = Prd_Qtd_Estoque - NEW.Orp_Qtd WHERE Prd_Codigo = NEW.Prd_Codigo;
  END IF;
END;

CREATE TRIGGER produtos_trigger
AFTER UPDATE ON produtos
FOR EACH ROW
BEGIN
  DECLARE qtd_anterior INT;
  DECLARE prd_em_falta INT;
  
  IF OLD.Prd_Qtd_Estoque <> NEW.Prd_Qtd_Estoque OR OLD.Prd_Valor <> NEW.Prd_Valor OR OLD.Prd_Status <> NEW.Prd_Status THEN
    INSERT INTO produtos_atualizados (prd_codigo, prd_qtd_anterior, prd_qtd_atualizada, prd_valor) 
    VALUES (OLD.Prd_Codigo, OLD.Prd_Qtd_Estoque, NEW.Prd_Qtd_Estoque, NEW.Prd_Valor);
    
    IF NEW.Prd_Qtd_Estoque = 0 THEN
      INSERT INTO produtos_em_falta (Prd_Codigo, Prd_Descricao, Prd_Falta, Prd_Status) 
      VALUES (NEW.Prd_Codigo, NEW.Prd_Descricao, 1, NEW.Prd_Status);
    END IF;
    
    UPDATE orcamentos_produtos SET Orp_Status = NULL WHERE Prd_Codigo = OLD.Prd_Codigo;
    UPDATE produtos SET Prd_Status = NULL WHERE Prd_Codigo = OLD.Prd_Codigo;
    
    SELECT Prd_Qtd_Estoque INTO qtd_anterior FROM produtos WHERE Prd_Codigo = OLD.Prd_Codigo;
    
    IF NEW.Prd_Qtd_Estoque = 0 THEN
      SET prd_em_falta = 1;
    ELSE
      SET prd_em_falta = 0;
    END IF;
    
    UPDATE produto SET Prd_Falta = prd_em_falta WHERE Prd_Codigo = OLD.Prd_Codigo;
  END IF;
END;
