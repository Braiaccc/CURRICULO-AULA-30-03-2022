DELIMITER $$
CREATE PROCEDURE getDatetime()
BEGIN

    select (A data atual é: ', current_timestamp);


END $$
DELIMITER ;

call getDatetime();