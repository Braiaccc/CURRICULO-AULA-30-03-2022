INSERT INTO categorias(nome) VALUES
    ('Bolo'),
    ('Pão'),
    ('Sobremesa'),
    ('Bolacha');

INSERT INTO ingredientes(nome, qtd, medida) VALUES
    ('Farinha de trigo', 250, 'Kg'),
    ('Fermento', 5, 'Kg'),
    ('Açúcar', 150, 'Kg'),
    ('Sal', 100, 'Kg'),
    ('Margarina', 5000, 'g'),
    ('Óleo', 10, 'L'),
    ('Ovo', 250, 'UN'),
    ('Cenoura', 100, 'Kg'),
    ('Chocolate em pó', 100, 'Kg'),
    ('Leite', 175, 'L'),
    ('Manteiga', 5000, 'g'),
    ('Polvilho Azedo', 50, 'Kg'),
    ('Queijo', 100, 'Kg'),
    ('Chocolate em barra', 100, 'Kg'),
    ('Aveia', 100, 'Kg');

INSERT INTO produtos(nome, qtd_produzida, data_producao, validade, id_categoria) VALUES
    ('Bolo de Cenoura', 10, '2023-05-5', '2023-05-20', 1),
    ('Bolo de Chocolate', 15, '2023-05-3', '2023-05-18', 1),
    ('Pão de Queijo', 30, '2023-05-10', '2023-05-15', 2),
    ('Bolo de Cenoura', 10, '2023-05-10', '2023-05-30', 1);

-- Bolo de cenoura
INSERT INTO produtos_ingredientes(qtd_utilizada, id_ingrediente, id_produto) VALUES
    (2.4, 6, 1),
    (40, 7, 1),
    (3, 1, 1),
    (30, 8, 1),
    (5.6, 3, 1),
    (0.1, 2, 1),
    (100, 11, 1),
    (1.8, 9, 1),
    (2.5, 10, 1);

-- Bolo de cenoura 2
INSERT INTO produtos_ingredientes(qtd_utilizada, id_ingrediente, id_produto) VALUES
    (2.4, 6, 4),
    (40, 7, 4),
    (3, 1, 4),
    (30, 8, 4),
    (5.6, 3, 4),
    (0.1, 2, 4),
    (100, 11, 4),
    (1.8, 9, 4),
    (2.5, 10, 4);

-- Bolo de chocolate
INSERT INTO produtos_ingredientes(qtd_utilizada, id_ingrediente, id_produto) VALUES
    (60, 7, 2),
    (0.5, 9, 2),
    (5.4, 1, 2),
    (5.4, 3, 2),
    (0.3, 2, 2),
    (3.750, 10, 2);

-- Pão de queijo
INSERT INTO produtos_ingredientes(qtd_utilizada, id_ingrediente, id_produto) VALUES
    (0.8, 12, 3),
    (0.250, 10, 3),
    (2, 7, 3),
    (0.05, 4, 3),
    (0.12, 6, 3),
    (0.1, 13, 3);

