CREATE PROCEDURE contar_livros_por_autor(@cpf_autor VARCHAR(11))
AS
BEGIN
    SET NOCOUNT ON;
    
    DECLARE @num_livros INT;
    
    SELECT @num_livros = COUNT(*) FROM livros WHERE autor_cpf = @cpf_autor;
    
    SELECT @num_livros as 'Quantidade de Livros';
END

CREATE PROCEDURE atualizar_data_lancamento(
    @codigo_livro INT,
    @nova_data_lancamento DATE
)
AS
BEGIN
    UPDATE livros
    SET data_lancamento = @nova_data_lancamento
    WHERE codigo = @codigo_livro;
END

CREATE PROCEDURE inserir_livro(
    @titulo VARCHAR(50),
    @autor VARCHAR(50),
    @editora VARCHAR(50),
    @ano_publicacao INT,
    @preco DECIMAL(10, 2)
)
AS
BEGIN
    INSERT INTO livros (titulo, autor, editora, ano_publicacao, preco)
    VALUES (@titulo, @autor, @editora, @ano_publicacao, @preco);
END

CREATE PROCEDURE excluir_livro(
    @codigo INT
)
AS
BEGIN
    DELETE FROM livros WHERE codigo = @codigo;
END

CREATE PROCEDURE atualizar_livro(
    @codigo INT,
    @titulo VARCHAR(50),
    @autor VARCHAR(50),
    @editora VARCHAR(50),
    @ano_publicacao INT,
    @preco DECIMAL(10, 2)
)
AS
BEGIN
    UPDATE livros
    SET titulo = @titulo,
        autor = @autor,
        editora = @editora,
        ano_publicacao = @ano_publicacao,
        preco = @preco
    WHERE codigo = @codigo;
END

CREATE PROCEDURE alterar_preco_editora(
    @editora VARCHAR(50),
    @valor DECIMAL(10, 2),
    @tipo CHAR(1) -- P para percentual ou A para absoluto
)
AS
BEGIN
    DECLARE @fator DECIMAL(10, 2);

    IF @tipo = 'P'
        SET @fator = 1 + (@valor / 100.0);
    ELSE IF @tipo = 'A'
        SET @fator = 1 + (@valor / (SELECT AVG(preco) FROM livros WHERE editora = @editora));

    UPDATE livros
    SET preco = preco * @fator
    WHERE editora = @editora;
END
