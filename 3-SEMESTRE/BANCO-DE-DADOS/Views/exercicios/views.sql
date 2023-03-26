 create table produtos
  (
    id int primary key,
    nome varchar(100) not null,
    valor decimal(10,2),
    saldo INT
  );

    create table orcamentos 
    (
        id int primary key,
        data varchar(20),
        status varchar(20)
    );

    create table orcamentos_itens
    (
        id int primary key,
        id_prod int,
        id_orc int,
        valor_unit decimal(10,2),
        quantidade int,
        valor_total_item int,
        foreign key (id_prod) references produtos(id),
        foreign key (id_orc) references orcamentos(id) 
    );

    insert into produtos (id, nome, valor, saldo)
    values 
    (1, 'bryan', 100, 1000),
     (2, 'Ryan', 150, 1500),
     (3, 'Nyan', 180, 1900)

    
     insert INTO orcamentos (id, data, status) 
    values 
    (1,'12-23-2023', 'orçamento'),
    (2,'12-12-2023', 'vendido'),
    (3,'10-05-2023', 'cancelado')
    
  insert into orcamentos_itens(id, id_prod, id_orc, valor_total_item) 
    values
        (1, 3, 2, 10500)
        
select id_cliente, valor_unit as total, quantidade       
from orcamentos
group by id_cliente 
having valor_unit <= 3440

SELECT id, nome, sobrenome, idade FROM clientes_1
UNION
SELECT id, nome, sobrenome, idade FROM clientes_2;

SELECT clientes.id, clientes.nome, clientes.sobrenome, pedidos.data_pedido, pedidos.valor
FROM clientes
LEFT JOIN pedidos ON clientes.id = pedidos.cliente_id;

