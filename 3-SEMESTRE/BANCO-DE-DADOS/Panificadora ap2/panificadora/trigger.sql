DELIMITER //
CREATE TRIGGER atualiza_estoque AFTER INSERT ON produtos_ingredientes FOR EACH ROW
BEGIN
    UPDATE ingredientes
    SET qtd = qtd - NEW.qtd_utilizada 
    WHERE id = NEW.id_ingrediente;
END//
DELIMITER ;

DELIMITER //
CREATE TRIGGER estorna_estoque AFTER DELETE ON produtos_ingredientes FOR EACH ROW
BEGIN
    UPDATE ingredientes
    SET qtd = qtd + OLD.qtd_utilizada 
    WHERE id = OLD.id_ingrediente
DELIMITER ;